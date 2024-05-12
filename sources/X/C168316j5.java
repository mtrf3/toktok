package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.6j5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168316j5 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Effect LJLJJI;
    public boolean LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public float LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Boolean.valueOf(this.LJLJJL), this.LJLJJLL, this.LJLJL, Float.valueOf(this.LJLJLJ), Boolean.valueOf(this.LJLJLLL)};
    }

    public final boolean L() {
        boolean LJJJZ = C78685UuP.LJJJZ(this.LJLILLLLZI);
        boolean LIZIZ = C44687HgJ.LIZIZ(this.LJLILLLLZI);
        long LJIIIIZZ = C44687HgJ.LJIIIIZZ(this.LJLILLLLZI);
        if (LJJJZ && LIZIZ && LJIIIIZZ > 0) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        boolean LJJJZ = C78685UuP.LJJJZ(this.LJLIL);
        boolean LIZIZ = C44687HgJ.LIZIZ(this.LJLIL);
        long LJIIIIZZ = C44687HgJ.LJIIIIZZ(this.LJLIL);
        if (LJJJZ && LIZIZ && LJIIIIZZ > 0) {
            return true;
        }
        return false;
    }

    public C168316j5(String vcOutputFile, String originInputFile, String speakerId, Effect effect, String effectId, String svcFrom, int i) {
        float f;
        vcOutputFile = (i & 1) != 0 ? "" : vcOutputFile;
        originInputFile = (i & 2) != 0 ? "" : originInputFile;
        speakerId = (i & 4) != 0 ? "" : speakerId;
        effect = (i & 8) != 0 ? new Effect(null, 1, null) : effect;
        effectId = (i & 32) != 0 ? "" : effectId;
        svcFrom = (i & 64) != 0 ? "" : svcFrom;
        if ((i & 128) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        o.LJIIIZ(vcOutputFile, "vcOutputFile");
        o.LJIIIZ(originInputFile, "originInputFile");
        o.LJIIIZ(speakerId, "speakerId");
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(svcFrom, "svcFrom");
        this.LJLIL = vcOutputFile;
        this.LJLILLLLZI = originInputFile;
        this.LJLJI = speakerId;
        this.LJLJJI = effect;
        this.LJLJJL = false;
        this.LJLJJLL = effectId;
        this.LJLJL = svcFrom;
        this.LJLJLJ = f;
        this.LJLJLLL = false;
    }
}
