package kori.gdd.slidingpuzzle.state.move.extend;

import kori.gdd.slidingpuzzle.constant.Constant;
import kori.gdd.slidingpuzzle.state.move.AbstractMove;
import kori.gdd.slidingpuzzle.state.move.MoveParams;

public class U_Move extends AbstractMove {

	@Override
	protected MoveParams getParams(int emptyPos, int width) {
		return new MoveParams(emptyPos-width, Constant.U_ACTION);
	}

}
