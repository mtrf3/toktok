package com.ss.android.ugc.aweme.service.perfetservice;

import X.C162476Zf;
import X.C16880lQ;
import X.C60032Xf;
import X.C75012wz;
import X.C86729Y2b;
import X.ELH;
import X.ELN;
import X.ELP;
import X.EnumC86730Y2c;
import X.IF2;
import X.ILM;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.Y26;
import X.Y2G;
import X.Y2H;
import X.Y2I;
import X.Y2J;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfCaptionFirstDisplayEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfCaptionLoadStartEvent;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ICLAPerfETServiceImpl implements ICLAPerfETService {
    public static final /* synthetic */ int LJII = 0;
    public C75012wz LIZ;
    public InterfaceC65784Pro<C75012wz> LIZIZ;
    public Y2I LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final IF2 LJI = IF2.LJLIL;

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void onFirstFrameRendered() {
        this.LJ = true;
        Y2I y2i = this.LIZJ;
        if (y2i != null) {
            y2i.LJFF = y2i.LIZLLL.invoke();
        }
    }

    static {
        C16880lQ.LJLLJ(ICLAPerfETServiceImpl.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LIZ(String str) {
        if (!this.LIZLLL) {
            int i = 0;
            if (str.length() > 0) {
                this.LIZLLL = true;
                Y2I y2i = this.LIZJ;
                if (y2i != null) {
                    Y2J y2j = y2i.LJI;
                    Long l = y2i.LJFF;
                    if (l != null) {
                        i = (int) (y2i.LIZLLL.invoke().longValue() - l.longValue());
                    }
                    y2j.LIZIZ(new C60032Xf(i));
                    Y2G.LIZLLL(ClaPerfCaptionFirstDisplayEvent.class, y2i.LJI);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LJ(AqS165S0100000_15 aqS165S0100000_15) {
        this.LIZ = null;
        this.LIZIZ = aqS165S0100000_15;
        this.LIZJ = null;
        this.LJ = false;
        this.LIZLLL = false;
        this.LJFF = false;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final Y2H LIZIZ(String targetLang, Y26 triggerMethod) {
        C75012wz c75012wz;
        o.LJIIIZ(targetLang, "targetLang");
        o.LJIIIZ(triggerMethod, "triggerMethod");
        if (this.LIZ == null) {
            InterfaceC65784Pro<C75012wz> interfaceC65784Pro = this.LIZIZ;
            if (interfaceC65784Pro != null) {
                c75012wz = interfaceC65784Pro.invoke();
            } else {
                c75012wz = null;
            }
            this.LIZ = c75012wz;
        }
        return new Y2H(this.LIZ, new ELH(targetLang, triggerMethod.getValue()), this.LJI);
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LIZJ(String subtitleId, String targetLang, String str, ELN captionType, EnumC86730Y2c triggerMethod) {
        OSZ osz;
        C75012wz c75012wz;
        o.LJIIIZ(subtitleId, "subtitleId");
        o.LJIIIZ(targetLang, "targetLang");
        o.LJIIIZ(captionType, "captionType");
        o.LJIIIZ(triggerMethod, "triggerMethod");
        if (this.LJFF && triggerMethod != EnumC86730Y2c.SWITCH_LANGUAGE) {
            return;
        }
        this.LJFF = true;
        int i = C86729Y2b.LIZ[triggerMethod.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    Boolean bool = Boolean.FALSE;
                    osz = new OSZ(bool, bool);
                } else {
                    throw new C162476Zf();
                }
            } else {
                Boolean bool2 = Boolean.TRUE;
                osz = new OSZ(bool2, bool2);
            }
        } else {
            osz = new OSZ(Boolean.TRUE, Boolean.FALSE);
        }
        boolean booleanValue = ((Boolean) osz.getFirst()).booleanValue();
        boolean booleanValue2 = ((Boolean) osz.getSecond()).booleanValue();
        Y2I y2i = this.LIZJ;
        if (y2i != null) {
            y2i.LIZ(ILM.FAILURE, null, null, null, null);
        }
        if (this.LIZ == null) {
            InterfaceC65784Pro<C75012wz> interfaceC65784Pro = this.LIZIZ;
            if (interfaceC65784Pro != null) {
                c75012wz = interfaceC65784Pro.invoke();
            } else {
                c75012wz = null;
            }
            this.LIZ = c75012wz;
        }
        Y2I y2i2 = new Y2I(this.LIZ, new ELP(subtitleId, targetLang, booleanValue ? 1 : 0, str, captionType.getValue(), triggerMethod.getValue(), booleanValue2 ? 1 : 0), this.LJ, this.LJI);
        if (y2i2.LIZJ) {
            y2i2.LJFF = y2i2.LIZLLL.invoke();
        }
        Y2G.LIZLLL(ClaPerfCaptionLoadStartEvent.class, y2i2.LJI);
        this.LIZJ = y2i2;
    }

    @Override // com.ss.android.ugc.aweme.service.ICLAPerfETService
    public final void LIZLLL(ILM resultCode, Integer num, Integer num2, Integer num3, Integer num4) {
        o.LJIIIZ(resultCode, "resultCode");
        Y2I y2i = this.LIZJ;
        if (y2i != null) {
            y2i.LIZ(resultCode, num, num2, num3, num4);
        }
    }
}
