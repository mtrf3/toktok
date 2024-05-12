package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Hqv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45345Hqv implements WaterMarkListener {
    public final /* synthetic */ C45344Hqu LIZ;

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onCancel() {
        C45344Hqu c45344Hqu = this.LIZ;
        Aweme aweme = c45344Hqu.LLF;
        if (aweme != null) {
            C44938HkM.LJFF(C45382HrW.LIZJ(3, aweme, 0, c45344Hqu.LLIIJI, c45344Hqu.LLIIJLIL, 4), "");
            if (C44938HkM.LIZLLL) {
                C39579Fg7.LJIL(this.LIZ.LJLJJLL);
                this.LIZ.LJIIIIZZ();
                C44938HkM.LIZLLL = false;
                return;
            }
            return;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onStart() {
    }

    public C45345Hqv(C45344Hqu c45344Hqu) {
        this.LIZ = c45344Hqu;
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onError(int i) {
        C45344Hqu c45344Hqu = this.LIZ;
        c45344Hqu.LLILLIZIL = 2;
        c45344Hqu.LLILLJJLI = Integer.valueOf(i);
        this.LIZ.LLILLL = "water_mark";
        C58604MzI.LIZIZ.waterMarkEnd();
        C44938HkM.LIZJ = false;
        C45344Hqu c45344Hqu2 = this.LIZ;
        c45344Hqu2.LLD = i;
        Aweme aweme = c45344Hqu2.LLF;
        if (aweme != null) {
            C44938HkM.LJFF(C45382HrW.LIZJ(5, aweme, 0, c45344Hqu2.LLIIJI, c45344Hqu2.LLIIJLIL, 4), "");
            C45344Hqu c45344Hqu3 = this.LIZ;
            GScope gScope = GScope.LJLIL;
            c45344Hqu3.getClass();
            V16.LJL(gScope, null, Long.valueOf(System.currentTimeMillis()), 0, 1);
            InterfaceC45358Hr8 interfaceC45358Hr8 = this.LIZ.LLIFFJFJJ;
            if (interfaceC45358Hr8 != null) {
                interfaceC45358Hr8.LIZ(0);
            }
            RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_error");
            C45344Hqu c45344Hqu4 = this.LIZ;
            String str = c45344Hqu4.LJLJJL;
            String str2 = c45344Hqu4.LJLJJLL;
            Aweme aweme2 = c45344Hqu4.LLF;
            if (aweme2 != null) {
                C45347Hqx.LIZJ(str, aweme2, str2);
                if (C44938HkM.LIZLLL) {
                    C39579Fg7.LJIL(this.LIZ.LJLJJLL);
                    this.LIZ.LJIIIIZZ();
                    C44938HkM.LIZLLL = false;
                    return;
                }
                this.LIZ.LJI(false);
                return;
            }
            o.LJIJI("mAweme");
            throw null;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onProgress(int i) {
        int i2;
        C45344Hqu c45344Hqu = this.LIZ;
        C45351Hr1 c45351Hr1 = c45344Hqu.LLFII;
        if (c45351Hr1 != null) {
            i2 = c45351Hr1.LIZ(EnumC45352Hr2.VIDEO_WATER_TYPE, i);
        } else {
            i2 = 0;
        }
        c45344Hqu.LJLJLLL = i2;
        C45344Hqu c45344Hqu2 = this.LIZ;
        Aweme aweme = c45344Hqu2.LLF;
        if (aweme != null) {
            C44938HkM.LJFF(C45382HrW.LIZIZ(2, aweme, c45344Hqu2.LJLJLLL, c45344Hqu2.LLIIJI, c45344Hqu2.LLIIJLIL), this.LIZ.LLIIJI);
            C45344Hqu c45344Hqu3 = this.LIZ;
            int i3 = c45344Hqu3.LJLJLLL;
            if (i3 >= 100) {
                c45344Hqu3.LJLJLLL = 100;
            } else if (i3 < 0) {
                c45344Hqu3.LJLJLLL = 0;
            }
            C38816FLg.LIZJ(c45344Hqu3.LLILZ);
            return;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onSuccess(String path) {
        o.LJIIIZ(path, "path");
        C44938HkM.LIZJ = false;
        if (C44938HkM.LIZLLL) {
            C44938HkM.LIZLLL = false;
            return;
        }
        C58604MzI.LIZIZ.waterMarkEnd();
        C45344Hqu c45344Hqu = this.LIZ;
        GScope gScope = GScope.LJLIL;
        c45344Hqu.getClass();
        V16.LJL(gScope, null, Long.valueOf(System.currentTimeMillis()), 1, 1);
        InterfaceC45358Hr8 interfaceC45358Hr8 = this.LIZ.LLIFFJFJJ;
        if (interfaceC45358Hr8 != null) {
            interfaceC45358Hr8.LIZ(1);
        }
        RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_success");
        C45344Hqu c45344Hqu2 = this.LIZ;
        Aweme aweme = c45344Hqu2.LLF;
        if (aweme != null) {
            if (c45344Hqu2.LJIIL(aweme, c45344Hqu2.LJLLILLLL) && !this.LIZ.LJIILIIL()) {
                this.LIZ.LJI(false);
                return;
            } else {
                this.LIZ.LJII();
                return;
            }
        }
        o.LJIJI("mAweme");
        throw null;
    }
}
