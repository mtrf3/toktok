package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes14.dex */
public enum V3T implements WireEnum {
    AnswerNormal(0),
    AnswerTimeout(1),
    AnswerBadWord(2),
    AnswerRiskQuestion(3);

    public static final ProtoAdapter<V3T> ADAPTER = new EnumAdapter<V3T>() { // from class: X.V3V
        @Override // com.squareup.wire.EnumAdapter
        public final V3T LIZ(int i) {
            return V3T.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static V3T fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AnswerRiskQuestion;
                }
                return AnswerBadWord;
            }
            return AnswerTimeout;
        }
        return AnswerNormal;
    }

    public static V3T valueOf(String str) {
        return (V3T) V0N.LJJJ(V3T.class, str);
    }

    V3T(int i) {
        this.LJLIL = i;
    }
}
