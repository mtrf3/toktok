package com.bytedance.android.live.broadcast.mirror;

import X.ActivityC45651qj;
import X.BZI;
import X.C0JV;
import X.C0JW;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C23010vJ;
import X.C28787BRn;
import X.C29S;
import X.C30326BvG;
import X.C3C5;
import X.C47071t1;
import X.C76800UCe;
import X.C86881Y7x;
import X.C90903hW;
import X.InterfaceC32901Qw;
import X.InterfaceC86149XrV;
import X.V10;
import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.mirror.widget.GameCastWiredWidget;
import com.bytedance.android.live.broadcast.mirror.widget.GameCastWirelessWidget;
import com.bytedance.android.livesdk.livesetting.game.LiveGameCastSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes.dex */
public final class GameCastChooseFragment extends BaseFragment implements InterfaceC86149XrV, InterfaceC32901Qw {
    public RecyclableWidgetManager LJLIL;
    public GameCastWiredWidget LJLILLLLZI;
    public GameCastWirelessWidget LJLJI;
    public View LJLJJI;
    public View LJLJJL;

    @Override // X.InterfaceC86149XrV
    public final void finish() {
    }

    @Override // X.InterfaceC86149XrV
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    @Override // X.InterfaceC86149XrV
    public final boolean onBackPressed() {
        return false;
    }

    public GameCastChooseFragment() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        RecyclableWidgetManager recyclableWidgetManager = this.LJLIL;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.unload(this.LJLILLLLZI);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.LJLIL;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.unload(this.LJLJI);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.avl);
        this.LJLJJI = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 27), findViewById);
        }
        LiveGameCastSetting liveGameCastSetting = LiveGameCastSetting.INSTANCE;
        if (liveGameCastSetting.disAble()) {
            return;
        }
        this.LJLIL = RecyclableWidgetManager.of(this, view, LiveWidgetProviderProxy.Companion.getInstance(), C30326BvG.LIZ);
        this.LJLJJL = view.findViewById(R.id.n9u);
        if (liveGameCastSetting.wiredCast()) {
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = new GameCastWiredWidget(getId(), getArguments());
            }
            RecyclableWidgetManager recyclableWidgetManager = this.LJLIL;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(R.id.b6h, this.LJLILLLLZI);
            }
        }
        if (liveGameCastSetting.wirelessCast()) {
            if (this.LJLJI == null) {
                this.LJLJI = new GameCastWirelessWidget(getId(), getArguments());
            }
            RecyclableWidgetManager recyclableWidgetManager2 = this.LJLIL;
            if (recyclableWidgetManager2 != null) {
                recyclableWidgetManager2.load(R.id.b6i, this.LJLJI);
            }
        }
        if ((!liveGameCastSetting.wiredCast() || !liveGameCastSetting.wirelessCast()) && (view2 = this.LJLJJL) != null) {
            view2.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.m1u);
        o.LJIIIIZZ(findViewById2, "view.findViewById<TextView>(R.id.tv_cast_step1)");
        TextView textView = (TextView) findViewById2;
        String str2 = getString(R.string.le7) + "\n" + getString(R.string.le4) + "\n";
        o.LJIIIIZZ(str2, "StringBuilder(getString(…)\n            .toString()");
        String LIZ = C86881Y7x.LIZIZ().LIZ("pm_mt_gamelive_cast_edu_download2");
        if (LIZ == null) {
            LIZ = textView.getResources().getString(R.string.le5);
            o.LJIIIIZZ(LIZ, "resources.getString(\n   …_download2,\n            )");
        }
        int LJJLIIIJL = s.LJJLIIIJL(LIZ, "WWW", 0, true, 2) + str2.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i0.LJFF(str2, LIZ));
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: X.0Jd
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        }, LJJLIIIJL, spannableStringBuilder.length(), 33);
        C23010vJ.LIZJ(textView.getContext(), spannableStringBuilder, LJJLIIIJL, spannableStringBuilder.length(), 33, 5, 600);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.a5q)), LJJLIIIJL, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        ((TextView) view.findViewById(R.id.m1v)).setText(getString(R.string.le8) + "\n" + getString(R.string.le6));
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("screen_cast_type_from");
        } else {
            str = null;
        }
        C0JW c0jw = C0JW.LIZ;
        Context context = getContext();
        c0jw.getClass();
        if (context != null && Build.VERSION.SDK_INT <= 28) {
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.l_s);
            c47071t1.LJII(C15380j0.LJIILJJIL(R.string.l_q));
            c47071t1.LJIIJJI(R.string.l_r);
            c47071t1.LJIILJJIL = false;
            C0JW.LIZIZ(c47071t1.LIZ());
        }
        if (str == null) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_screencasting_type_show");
        LIZ2.LJIJJ(Long.valueOf(C0JV.LIZ()), "anchor_id");
        LIZ2.LJIJJ(str, "enter_from");
        LIZ2.LJIJJ("live_studio", "live_type");
        LIZ2.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.doc, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
