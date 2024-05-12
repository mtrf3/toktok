package X;

import android.content.Context;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VuL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81229VuL {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 189));
    public final /* synthetic */ C81227VuJ LIZIZ;

    public final boolean LIZJ() {
        return ((Boolean) this.LIZ.getValue()).booleanValue();
    }

    public C81229VuL(C81227VuJ c81227VuJ) {
        this.LIZIZ = c81227VuJ;
    }

    public final float LIZ(int i) {
        float mPercentStepLength;
        float mAttrsBarPadding;
        int min = Math.min(this.LIZIZ.getMMaxPercent(), Math.max(this.LIZIZ.getMMinPercent(), i));
        boolean LIZJ = LIZJ();
        if (!LIZJ) {
            mPercentStepLength = this.LIZIZ.getMPercentStepLength() * (min - this.LIZIZ.getMMinPercent());
            mAttrsBarPadding = this.LIZIZ.getMAttrsBarPadding();
        } else if (LIZJ) {
            mPercentStepLength = this.LIZIZ.getMPercentStepLength() * (this.LIZIZ.getMMinPercent() + (this.LIZIZ.getMPercentRange() - min));
            mAttrsBarPadding = this.LIZIZ.getMAttrsBarPadding();
        } else {
            throw new C162476Zf();
        }
        return mAttrsBarPadding + mPercentStepLength;
    }

    public final int LIZIZ(float f) {
        int mMinPercent;
        int i;
        float mAttrsBarPadding = this.LIZIZ.getMAttrsBarPadding();
        Context context = this.LIZIZ.getContext();
        o.LJIIIIZZ(context, "context");
        if (f < mAttrsBarPadding - C74275TDb.LIZIZ(context, 10.0f)) {
            if (LIZJ()) {
                mMinPercent = this.LIZIZ.getMMaxPercent();
            } else {
                mMinPercent = this.LIZIZ.getMMinPercent();
            }
        } else {
            Context context2 = this.LIZIZ.getContext();
            o.LJIIIIZZ(context2, "context");
            float LJ = C81184Vtc.LJ(C16880lQ.LLLLL(context2));
            float mAttrsBarPadding2 = this.LIZIZ.getMAttrsBarPadding();
            Context context3 = this.LIZIZ.getContext();
            o.LJIIIIZZ(context3, "context");
            if (f > LJ - (mAttrsBarPadding2 - C74275TDb.LIZIZ(context3, 10.0f))) {
                if (LIZJ()) {
                    mMinPercent = this.LIZIZ.getMMinPercent();
                } else {
                    mMinPercent = this.LIZIZ.getMMaxPercent();
                }
            } else {
                boolean LIZJ = LIZJ();
                if (!LIZJ) {
                    mMinPercent = ((int) ((f - this.LIZIZ.getMAttrsBarPadding()) / this.LIZIZ.getMPercentStepLength())) + this.LIZIZ.getMMinPercent();
                } else if (LIZJ) {
                    mMinPercent = this.LIZIZ.getMMinPercent() + (this.LIZIZ.getMPercentRange() - ((int) ((f - this.LIZIZ.getMAttrsBarPadding()) / this.LIZIZ.getMPercentStepLength())));
                } else {
                    throw new C162476Zf();
                }
            }
        }
        C81227VuJ c81227VuJ = this.LIZIZ;
        int i2 = c81227VuJ.LJLILLLLZI;
        if ((i2 != 0 || ((i = c81227VuJ.LJLJLJ) != i2 && i != c81227VuJ.LJLJI)) && mMinPercent >= c81227VuJ.getMDefaultPercent() - 2 && mMinPercent <= this.LIZIZ.getMDefaultPercent() + 2) {
            mMinPercent = this.LIZIZ.getMDefaultPercent();
        }
        return Math.min(Math.max(this.LIZIZ.getMMinPercent(), mMinPercent), this.LIZIZ.getMMaxPercent());
    }
}
