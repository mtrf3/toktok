package com.ss.android.ugc.aweme.commerce.tools.music;

import X.BAK;
import X.C04330Ez;
import X.C116484hg;
import X.C162476Zf;
import X.C188727au;
import X.C1DF;
import X.C221108m2;
import X.C26227ARb;
import X.C3AW;
import X.C41446GOk;
import X.C42490Gly;
import X.C42492Gm0;
import X.C42493Gm1;
import X.C42497Gm5;
import X.C42498Gm6;
import X.C42902Gsc;
import X.C42904Gse;
import X.C44384HbQ;
import X.C57512Nn;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C77117UOj;
import X.C78915Uy7;
import X.EnumC42489Glx;
import X.FMX;
import X.GF0;
import X.InterfaceC41449GOn;
import X.InterfaceC41450GOo;
import X.InterfaceC41451GOp;
import X.InterfaceC42491Glz;
import X.InterfaceC74236TBo;
import X.OF1;
import X.TBT;
import X.UC0;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS42S0200000_7;
import Y.AObserverS69S0100000_1;
import Y.AObserverS75S0100000_7;
import Y.IDCListenerS283S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.tools.music.viewmodel.CommerceMusicLegalViewModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class CommerceMusicPublishModule implements GF0 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final InterfaceC42491Glz LJLIL;
    public final OF1 LJLILLLLZI;
    public final OF1 LJLJI;
    public final OF1 LJLJJI;
    public final C62822Ol8 LJLJJL;

    static {
        TBT tbt = new TBT(CommerceMusicPublishModule.class, "fragment", "getFragment()Landroidx/fragment/app/Fragment;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(CommerceMusicPublishModule.class, "isKccNoticeShow", "isKccNoticeShow()Z", 0, c65351Pkp), C61845OOz.LIZJ(CommerceMusicPublishModule.class, "commerceModel", "getCommerceModel()Lcom/ss/android/ugc/aweme/commerce/tools/common/CommerceToolsModel;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC40967G5z
    public final void LIZ() {
    }

    @Override // X.InterfaceC40998G7e
    public final void P0() {
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        ((InterfaceC41449GOn) L9()).LJIIJJI(this);
        ((InterfaceC41451GOp) L9()).getLifecycleOwner().getLifecycle().addObserver(this);
    }

    @Override // X.GF0, X.InterfaceC41448GOm
    public final void onCreate() {
        C41446GOk.onCreate(this);
        ((CommerceMusicLegalViewModel) this.LJLJJL.getValue()).LJLJJI.observe(this.LJLIL.getLifecycleOwner(), new AObserverS75S0100000_7(this, 6));
        ((LiveData) ((CommerceMusicLegalViewModel) this.LJLJJL.getValue()).LJLJI.getValue()).observe(this.LJLIL.getLifecycleOwner(), new AObserverS75S0100000_7(this, 7));
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    @Override // X.GF0, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C41446GOk.onDestroy(this);
    }

    @Override // X.GF0, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C41446GOk.onPause(this);
    }

    @Override // X.GF0, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C41446GOk.onResume(this);
    }

    @Override // X.GF0, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C41446GOk.onStart(this);
    }

    @Override // X.GF0, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C41446GOk.onStop(this);
    }

    public CommerceMusicPublishModule(InterfaceC42491Glz depend) {
        o.LJIIIZ(depend, "depend");
        this.LJLIL = depend;
        this.LJLILLLLZI = C1DF.LJJIFFI(this, C42493Gm1.LJLIL);
        this.LJLJI = C1DF.LJJIFFI(this, C42492Gm0.LJLIL);
        this.LJLJJI = C1DF.LJJIFFI(this, C42490Gly.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0200000_7(this, new AqS157S0100000_7(this, 68), 16));
    }

    @Override // X.InterfaceC40998G7e
    public final boolean Nb0(InterfaceC41450GOo action) {
        o.LJIIIZ(action, "action");
        CommerceMusicLegalViewModel commerceMusicLegalViewModel = (CommerceMusicLegalViewModel) this.LJLJJL.getValue();
        Context LLIILZL = C44384HbQ.LLIILZL(this);
        C42904Gse c42904Gse = new C42904Gse(action);
        C42902Gsc c42902Gsc = new C42902Gsc(action);
        commerceMusicLegalViewModel.getClass();
        if (!o.LJ(((LiveData) commerceMusicLegalViewModel.LJLJJL.getValue()).getValue(), Boolean.FALSE)) {
            C188727au c188727au = new C188727au();
            Boolean value = commerceMusicLegalViewModel.LJLJJI.getValue();
            Boolean bool = Boolean.TRUE;
            c188727au.LJFF(Boolean.valueOf(o.LJ(value, bool)), "checked");
            FMX.LJIIL("ba_click_post_with_ugc", c188727au.LIZ);
            if (o.LJ(commerceMusicLegalViewModel.LJLJJI.getValue(), bool)) {
                C116484hg.LIZ("source", EnumC42489Glx.POST_PAGE.getValue(), "ba_publish_with_ugc");
            } else {
                int i = C42497Gm5.LIZ[C42498Gm6.LIZ().pressPostAction.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new C162476Zf();
                        }
                    } else {
                        C116484hg.LIZ("page", EnumC42489Glx.POST_PAGE.getValue(), "ba_click_post_without_confirmation_reminder");
                        Fragment fragment = commerceMusicLegalViewModel.LJLIL.getFragment();
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(R.string.ij);
                        C78915Uy7.LJJIJIIJI(fragment, 2040, creativeToastBuilder);
                        c42902Gsc.invoke();
                    }
                } else {
                    C116484hg.LIZ("page", EnumC42489Glx.DIALOG.getValue(), "ba_click_post_without_confirmation_reminder");
                    C26227ARb LIZ = C3AW.LIZ(LLIILZL);
                    LIZ.LJ(R.string.ii);
                    LIZ.LIZ(R.string.if);
                    C77117UOj.LJIL(LIZ, LLIILZL.getString(R.string.ih), new AqS170S0100000_4(LLIILZL, 1286));
                    UC0.LIZJ(LIZ, new AqS111S0300000_7(commerceMusicLegalViewModel, c42904Gse, c42902Gsc, 33));
                    LIZ.LJ = new IDCListenerS283S0100000_7(new AqS173S0100000_7(c42902Gsc, 351), 6);
                    LIZ.LIZJ(new AqS173S0100000_7(c42902Gsc, 352));
                    LIZ.LJI().LIZLLL();
                }
                return action.getIntercepted();
            }
        }
        action.LIZ();
        return false;
    }

    @Override // X.InterfaceC40967G5z
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(R.id.gud);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.music_usage_legal_ll)");
        BAK bak = new BAK((ViewStub) findViewById);
        OF1 of1 = this.LJLILLLLZI;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJLJJLL;
        Fragment fragment = (Fragment) of1.LIZ(this, interfaceC74236TBoArr[0]);
        CommerceMusicLegalViewModel viewModel = (CommerceMusicLegalViewModel) this.LJLJJL.getValue();
        boolean booleanValue = ((Boolean) this.LJLJI.LIZ(this, interfaceC74236TBoArr[1])).booleanValue();
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(viewModel, "viewModel");
        C57512Nn c57512Nn = (C57512Nn) bak.LIZ;
        if (c57512Nn != null) {
            ((LiveData) viewModel.LJLJJL.getValue()).observe(fragment, new AObserverS69S0100000_1(c57512Nn, 122));
            viewModel.LJLJJI.observe(fragment, new AObserverS69S0100000_1(c57512Nn, 123));
            if (booleanValue) {
                TuxTextView tuxTextView = (TuxTextView) c57512Nn.LIZ(R.id.gqc);
                o.LJII(tuxTextView, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                tuxTextView.setTuxFont(81);
            }
            TextView textView = (TextView) c57512Nn.LIZ(R.id.gqc);
            String string2 = c57512Nn.getResources().getString(R.string.p70);
            o.LJIIIIZZ(string2, "resources.getString(R.st…_confirmation_music_show)");
            String string3 = c57512Nn.getResources().getString(R.string.p71);
            o.LJIIIIZZ(string3, "resources.getString(R.st…confirmation_music_terms)");
            String lowerCase = string3.toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            if (s.LJJJLZIJ(string2, lowerCase, false)) {
                String lowerCase2 = string3.toLowerCase();
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
                string = ujb.o.LJJJJZ(string2, lowerCase2, string3, false);
            } else {
                string = c57512Nn.getResources().getString(R.string.p70, string3);
                o.LJIIIIZZ(string, "{\n            resources.…show, usageStr)\n        }");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            final int LIZIZ = C04330Ez.LIZIZ(c57512Nn.getContext(), R.color.ck);
            spannableStringBuilder.setSpan(new ClickableSpan(LIZIZ) { // from class: X.9zK
                public final int LJLIL;

                {
                    this.LJLIL = LIZIZ;
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    o.LJIIIZ(widget, "widget");
                    if (widget instanceof TextView) {
                        ((TextView) widget).setHighlightColor(0);
                    }
                    Context context = widget.getContext();
                    o.LJIIIIZZ(context, "widget.context");
                    A2E.LIZ(context, "post_page");
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setColor(this.LJLIL);
                    ds.setUnderlineText(false);
                    T5S t5s = new T5S();
                    t5s.LIZ(82);
                    ds.setTypeface(t5s.getTypeface());
                }
            }, Math.max(string.length() - string3.length(), 0), string.length(), 18);
            textView.setText(spannableStringBuilder);
            ((TextView) c57512Nn.LIZ(R.id.gqc)).setMovementMethod(LinkMovementMethod.getInstance());
            ((TextView) c57512Nn.LIZ(R.id.gqc)).setHighlightColor(0);
            c57512Nn.LIZ(R.id.bqx).setClickable(false);
            c57512Nn.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS42S0200000_7(viewModel, fragment, 43)));
        }
    }
}
