package X;

import Y.ACListenerS23S0100000_3;
import Y.IDDListenerS143S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS1S1001000_3;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("now_widget_guide")
/* renamed from: X.7pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197957pn extends AbstractC56325M8r<DialogFragment> {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final UrlModel LJLJI;
    public final int LJLJJI = 2520;

    @Override // X.InterfaceC55641Lsb
    public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
        return null;
    }

    @Override // X.M74
    public final boolean canShow() {
        AbstractC193937jJ abstractC193937jJ;
        String str;
        if (o.LJ(this.LJLIL, "inbox_top_cell")) {
            return true;
        }
        Activity topActivity = ActivityStack.getTopActivity();
        o.LJIIIIZZ(topActivity, "getTopActivity()");
        Integer LIZJ = C2WW.LIZJ();
        if ((LIZJ == null || LIZJ.intValue() <= 0) && ((IAppWidgetService) C197357op.LIZ.getValue()).LJI(EF7.LIZIZ()) && (abstractC193937jJ = (AbstractC193937jJ) ORZ.LLFFF((Iterable) C196267n4.LIZ.getValue())) != null && abstractC193937jJ.LJ() && !C198017pt.LIZ().getBoolean("is_widget_installed", false)) {
            if (C198017pt.LIZ().getBoolean("has_installed_widget_before", false)) {
                if (!C198017pt.LIZ().getBoolean("sheet_has_shown_after_uninstall", false)) {
                    C198017pt.LIZ().storeBoolean("sheet_has_shown_after_uninstall", true);
                    return true;
                }
            } else if (C57105Mb7.LJII(Long.valueOf(C198017pt.LIZ().getLong("sheet_last_shown_time", 0L))) >= 1 && C198017pt.LIZ().getInt("sheet_shown_count", 0) < ((Number) C198087q0.LIZ.getValue()).intValue()) {
                int LJII = C57105Mb7.LJII(Long.valueOf(C198017pt.LIZ().getLong("sheet_interval_start", 0L)));
                int i = C198017pt.LIZ().getInt("sheet_interval_shown_count", 0);
                if (LJII >= 5 || i < 2) {
                    if (AnonymousClass636.LJIILJJIL(topActivity)) {
                        str = "widget_intro_dark";
                    } else {
                        str = "widget_intro_light";
                    }
                    if (C197357op.LIZIZ(str).exists()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        String str;
        o.LJIIIZ(context, "context");
        final ActivityC45651qj LIZJ = context.LIZJ();
        TuxSheet tuxSheet = null;
        final C1AH c1ah = null;
        if (LIZJ != null) {
            final View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZJ), R.layout.bym, null, false);
            C1AH c1ah2 = (C1AH) LLLLIILL.findViewById(R.id.e0t);
            if (c1ah2 != null) {
                c1ah2.setVisibility(0);
                c1ah = c1ah2;
            }
            TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.f0h);
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(LLLLIILL, 337));
            }
            SmartImageView smartImageView = (SmartImageView) LLLLIILL.findViewById(R.id.f43);
            if (smartImageView != null) {
                Context context2 = smartImageView.getContext();
                o.LJIIIIZZ(context2, "context");
                if (AnonymousClass636.LJIILJJIL(context2)) {
                    str = "widget_intro_dark";
                } else {
                    str = "widget_intro_light";
                }
                W5F LJI = W5U.LJI(C197357op.LIZIZ(str));
                LJI.LJJIIJ = smartImageView;
                LJI.LIZLLL(new AbstractC72439Sbr() { // from class: X.7pq
                    @Override // X.InterfaceC70769Rq1
                    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                    }

                    @Override // X.InterfaceC70769Rq1
                    public final void s2(android.net.Uri uri, View view, Throwable th) {
                        String str2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("error to load widget intro resource, msg: ");
                        if (th != null) {
                            str2 = th.getMessage();
                        } else {
                            str2 = null;
                        }
                        LIZ.append(str2);
                        C7XD.LIZIZ("NowWidgetGuideTask", X1D.LIZIZ(LIZ));
                        C1AH c1ah3 = C1AH.this;
                        if (c1ah3 == null) {
                            return;
                        }
                        c1ah3.setVisibility(4);
                    }
                });
            }
            final SmartImageView smartImageView2 = (SmartImageView) LLLLIILL.findViewById(R.id.f45);
            if (smartImageView2 != null) {
                smartImageView2.setLayoutDirection(0);
                final UrlModel urlModel = this.LJLJI;
                if (urlModel != null) {
                    final int[] iArr = {C7MY.LIZIZ(93), C7MY.LIZIZ(93)};
                    final boolean z = this.LJLILLLLZI;
                    final float LJIIZILJ = C32151Nz.LJIIZILJ(10);
                    W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                    LJII.LIZJ = smartImageView2.getContext();
                    LJII.LJIJI = Bitmap.Config.ARGB_8888;
                    AbstractC85293Wj abstractC85293Wj = new AbstractC85293Wj() { // from class: X.7q2
                        @Override // X.InterfaceC78660Uu0
                        public final void LIZIZ(Bitmap bitmap) {
                            if (bitmap == null) {
                                return;
                            }
                            AppWidgetServiceImpl.LJIJI().LJIIZILJ(bitmap, iArr, z, LJIIZILJ, new AqS169S0100000_3(smartImageView2, 1029));
                        }

                        @Override // X.InterfaceC78660Uu0
                        public final void onFailed(Throwable th) {
                            if (th == null) {
                                th = new IllegalStateException(th);
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("error to load bitmap of url: ");
                            LIZ.append(urlModel);
                            C7XD.LIZJ("NowWidgetGuideManager", X1D.LIZIZ(LIZ), th);
                        }
                    };
                    if (C210188Ms.LIZLLL()) {
                        LJII.LJIIJJI(abstractC85293Wj);
                    } else {
                        LJII.LJIIIZ(abstractC85293Wj);
                    }
                }
            }
            final SY4 sy4 = (SY4) LLLLIILL.findViewById(R.id.wf);
            if (sy4 != null) {
                C16880lQ.LJIIJ(new C98T() { // from class: X.7po
                    @Override // X.C98T
                    public final void LIZ(View view) {
                        if (view != null) {
                            C196157mt.LJFF(C197957pn.this.LJLIL, "try_widget");
                            C26045AKb c26045AKb = new C26045AKb(LIZJ);
                            c26045AKb.LJIIIIZZ(R.string.y6);
                            c26045AKb.LJIIJ();
                            IAppWidgetService LJIJI = AppWidgetServiceImpl.LJIJI();
                            Context context3 = sy4.getContext();
                            o.LJIIIIZZ(context3, "context");
                            LJIJI.LJIILL(context3);
                            View view2 = LLLLIILL;
                            o.LJIIIIZZ(view2, "view");
                            ASQ.LIZLLL(LLLLIILL, C198047pw.LIZ);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, sy4);
            }
            tuxSheet = C249109q6.LIZ(0).LIZ;
            tuxSheet.LJLLI = LLLLIILL;
            tuxSheet.LJLILLLLZI = new IDDListenerS143S0100000_3(this, 8);
            C1DG.LJII(LIZJ, "activity.supportFragmentManager", tuxSheet, "NowWidgetGuideSheet");
            if (!o.LJ(this.LJLIL, "inbox_top_cell")) {
                C198017pt.LIZ().storeLong("sheet_last_shown_time", System.currentTimeMillis());
                C198017pt.LIZ().storeInt("sheet_shown_count", C198017pt.LIZ().getInt("sheet_shown_count", 0) + 1);
                int LJII2 = C57105Mb7.LJII(Long.valueOf(C198017pt.LIZ().getLong("sheet_interval_start", 0L)));
                int i = C198017pt.LIZ().getInt("sheet_interval_shown_count", 0);
                if (LJII2 > 5 || i == 0) {
                    C198017pt.LIZ().storeLong("sheet_interval_start", System.currentTimeMillis());
                    C198017pt.LIZ().storeInt("sheet_interval_shown_count", 1);
                } else {
                    C198017pt.LIZ().storeInt("sheet_interval_shown_count", i + 1);
                }
            }
            String triggerType = this.LJLIL;
            o.LJIIIZ(triggerType, "triggerType");
            C7MK.LJI("now_widget_guide_show", new AqS1S1001000_3(triggerType, 0));
        }
        return tuxSheet;
    }

    public C197957pn(UrlModel urlModel, String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = urlModel;
    }
}
