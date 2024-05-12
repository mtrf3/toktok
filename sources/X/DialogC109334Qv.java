package X;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC109334Qv extends DialogC62475OfX {
    public final Activity LJLLJ;
    public final ImChannel LJLLL;
    public final C3VM LJLLLL;

    @Override // X.DialogC62475OfX, X.DialogC62478Ofa, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        View decorView;
        super.onCreate(bundle);
        Window window = getWindow();
        C4RB c4rb = null;
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(4);
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        boolean LIZIZ = C78966Uyw.LJJIJ().LIZIZ();
        if (this.LJLJJL.LJIIJJI && !LIZIZ) {
            Activity activity = this.LJLLJ;
            View findViewById = findViewById(R.id.jub);
            o.LJI(findViewById);
            View findViewById2 = findViewById(R.id.ju5);
            o.LJI(findViewById2);
            View findViewById3 = findViewById(R.id.ju9);
            o.LJI(findViewById3);
            BaseSharePackage baseSharePackage = this.LJLJJL.LJIIJ;
            o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
            C4RD c4rd = new C4RD(new C4RE(activity, this, (ViewGroup) findViewById, (ViewGroup) findViewById2, findViewById3, (SharePackage) baseSharePackage, this.LJLJJL.LJIILJJIL));
            InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            Activity activity2 = this.LJLLJ;
            View findViewById4 = findViewById(R.id.jum);
            o.LJI(findViewById4);
            View findViewById5 = findViewById(R.id.ju6);
            o.LJI(findViewById5);
            View findViewById6 = findViewById(R.id.ju_);
            o.LJI(findViewById6);
            BaseSharePackage baseSharePackage2 = this.LJLJJL.LJIIJ;
            o.LJII(baseSharePackage2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
            View findViewById7 = findViewById(R.id.juh);
            o.LJI(findViewById7);
            View findViewById8 = findViewById(R.id.jul);
            o.LJI(findViewById8);
            C62387Oe7 c62387Oe7 = this.LJLJJL;
            shareService.LJIJJ(new C4OO(activity2, (SharePackage) baseSharePackage2, (ViewGroup) findViewById4, (ViewGroup) findViewById5, (FrameLayout) findViewById6, (PNP) findViewById7, (TextView) findViewById8, c62387Oe7.LJIJJ, c62387Oe7.LIZ), c4rd);
            ImChannel imChannel = this.LJLLL;
            if (imChannel != null) {
                imChannel.getClass();
            }
        } else {
            ImChannel imChannel2 = this.LJLLL;
            if (imChannel2 != null) {
                imChannel2.LJLJI = false;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("config has supportIm: ");
        LIZ.append(this.LJLJJL.LJIIJJI);
        LIZ.append(", topView is null: ");
        if (this.LJLJJL.LJIIL == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(", has channels size: ");
        LIZ.append(this.LJLJJL.LIZ);
        LIZ.append(", has actions size: ");
        LIZ.append(this.LJLJJL.LIZJ);
        C36922EeM.LIZLLL(2, "CommonShareDialog", X1D.LIZIZ(LIZ));
        ImChannel imChannel3 = this.LJLLL;
        if (imChannel3 != null) {
            C62387Oe7 c62387Oe72 = this.LJLJJL;
            if (c62387Oe72 != null) {
                c4rb = c62387Oe72.LJIILJJIL;
            }
            imChannel3.LJLJJI = c4rb;
        }
        View findViewById9 = findViewById(R.id.juh);
        if (findViewById9 != null) {
            IMService.createIIMServicebyMonsterPlugin(false).getPerformanceService().LIZIZ(findViewById9, new InterfaceC98193tH() { // from class: X.4PI
                public long LIZ = -1;

                @Override // X.InterfaceC98193tH
                public final void LIZ() {
                    long j;
                    if (this.LIZ > 0) {
                        j = SystemClock.uptimeMillis() - this.LIZ;
                    } else {
                        j = -1;
                    }
                    DialogC109334Qv.this.LJLLLL.LIZ(C4PG.LJ, new C30C(j));
                }

                @Override // X.InterfaceC98193tH
                public final void LIZIZ() {
                    this.LIZ = SystemClock.uptimeMillis();
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC109334Qv(Activity activity, C62387Oe7 c62387Oe7, int i) {
        super(activity, i, c62387Oe7);
        boolean z;
        o.LJIIIZ(activity, "activity");
        this.LJLLJ = activity;
        this.LJLLLL = IMService.createIIMServicebyMonsterPlugin(false).getPerformanceService().LIZJ();
        List<InterfaceC62225ObV> list = c62387Oe7.LIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC62225ObV interfaceC62225ObV : list) {
            if (interfaceC62225ObV instanceof ImChannel) {
                arrayList.add(interfaceC62225ObV);
            }
        }
        if (arrayList.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object obj = ListProtector.get(arrayList, 0);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.channel.ImChannel");
            this.LJLLL = (ImChannel) obj;
        }
        if (this.LJLLL != null && C78966Uyw.LJJIJ().LIZIZ() && ((RBX) HG3.LJIILL()).isLogin()) {
            List<InterfaceC62225ObV> list2 = c62387Oe7.LIZ;
            ImChannel imChannel = this.LJLLL;
            o.LJI(imChannel);
            list2.remove(imChannel);
            this.LJLLL = null;
        }
        Window window = getWindow();
        if (window != null) {
            LTT.LJFF(window, -16777216, false);
        }
        C54502LaE.LIZLLL("share_panel", null, 6);
        this.LJLLLL.LIZIZ(C4PG.LJ, true);
    }
}
