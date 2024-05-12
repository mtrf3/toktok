package com.ss.android.ugc.aweme.shortvideo.image;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C119224m6;
import X.C145995oB;
import X.C162356Yt;
import X.C165706es;
import X.C16880lQ;
import X.C19N;
import X.C1JI;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C40981G6n;
import X.C41315GJj;
import X.C41535GRv;
import X.C42010GeE;
import X.C42011GeF;
import X.C42012GeG;
import X.C42014GeI;
import X.C42020GeO;
import X.C44172HVg;
import X.C45631qh;
import X.C58B;
import X.C60903NvH;
import X.C62822Ol8;
import X.C68322mC;
import X.C76800UCe;
import X.C78866UxK;
import X.C7MY;
import X.C83547Wqd;
import X.C90193gN;
import X.GSI;
import X.GSR;
import X.GXR;
import X.H7R;
import X.IAZ;
import X.InterfaceC65784Pro;
import X.KL2;
import X.O6R;
import X.SY4;
import X.ViewOnTouchListenerC42013GeH;
import X.WM7;
import Y.ACListenerS27S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS38S0210000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class ExpandedTitleModule implements GenericLifecycleObserver {
    public final VideoPublishEditModel LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final View LJLJI;
    public final ActivityC45651qj LJLJJI;
    public final C45631qh LJLJJL;
    public final C119224m6 LJLJJLL;
    public final ViewGroup LJLJL;
    public final View LJLJLJ;
    public final EditText LJLJLLL;
    public final TextView LJLL;
    public final GSR LJLLI;
    public final SY4 LJLLILLLL;
    public final TuxIconView LJLLJ;
    public final ViewGroup LJLLL;
    public final TextView LJLLLL;
    public final IAZ LJLLLLLL;
    public final View LJLZ;
    public final View LJZ;
    public final int LJZI;
    public int LJZL;
    public final C62822Ol8 LL;
    public final int LLD;
    public int LLF;
    public final boolean LLFF;
    public final long LLFFF;
    public final int LLFII;
    public int LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public boolean LLIIIL;
    public final SafeHandler LLIIIZ;
    public final int LLIIJI;
    public final ViewGroup LLIIJLIL;
    public final ViewGroup LLIIL;
    public final ViewGroup LLIILII;
    public final TextView LLIILZL;
    public final TextView LLIIZ;
    public final View LLIL;
    public final View LLILII;
    public final InputMethodManager LLILIL;
    public final C83547Wqd LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public final ExpandTextViewModel LLILLL;
    public final C62822Ol8 LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final ARunnableS43S0100000_7 LLIZLLLIL;
    public int LLJ;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LLI = false;
        this.LLIIIILZ = 0;
        this.LLILLIZIL = false;
        this.LLIZ = 3;
        this.LLILL.LIZIZ = 0;
        if (LJ()) {
            this.LLIFFJFJJ = false;
            if (!LJIIIZ()) {
                this.LLIIIZ.postDelayed(new ARunnableS43S0100000_7(this, 28), 500L);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    public final void LIZLLL() {
        InputMethodManager inputMethodManager;
        if (this.LJLJJI.getCurrentFocus() != null && this.LLILLIZIL && (inputMethodManager = this.LLILIL) != null) {
            inputMethodManager.hideSoftInputFromWindow(this.LJLLI.getWindowToken(), 0);
        }
    }

    public final boolean LJ() {
        int i = this.LLJ;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        EditText editText;
        if (this.LJLJLLL.hasFocus()) {
            editText = this.LJLJLLL;
        } else {
            editText = this.LJLLI;
        }
        editText.requestFocus();
        InputMethodManager inputMethodManager = this.LLILIL;
        if (inputMethodManager == null || !inputMethodManager.showSoftInput(editText, 2)) {
            return false;
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        this.LLILL.LIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (LJ()) {
            this.LLIFFJFJJ = true;
            LIZLLL();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.GeI] */
    /* JADX WARN: Type inference failed for: r3v13, types: [kotlin.jvm.internal.AqS157S0100000_7, T] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.internal.AqS157S0100000_7, T] */
    public final void LIZ(int i) {
        int LIZIZ;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        String str;
        if (this.LLJ == i) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = C42014GeI.LJLIL;
        int i7 = 8;
        int i8 = -1;
        if (this.LLJ == 1) {
            this.LLIIII = this.LLII - this.LLIIIILZ;
            this.LLIIIJ = this.LJLLLLLL.getScrollY();
            this.LJZL = this.LJLJJL.getHeight();
            TextView descCharacterLimit = this.LJLLLL;
            o.LJIIIIZZ(descCharacterLimit, "descCharacterLimit");
            C1JI.LJJIJ(descCharacterLimit, this.LJLLI.hasFocus());
            i2 = LIZJ(i);
            LIZIZ = LIZIZ(i2);
            if (GSI.LIZ()) {
                c68322mC.element = new AqS157S0100000_7(this, 217);
                i3 = 0;
                i4 = 0;
                i8 = i2;
                i2 = this.LLF;
            } else {
                i3 = ((Number) this.LL.getValue()).intValue();
                i4 = (int) KL2.LIZJ(this.LJLJJI, 8.0f);
            }
            LJIIJ(i);
            if ((this.LLFF || (C41535GRv.LIZ() && (str = this.LJLIL.heading) != null && str.length() != 0)) && this.LJLJLJ.getVisibility() == 8) {
                this.LJLJLJ.setVisibility(0);
                this.LJLIL.getImageAlbumData().getImageUiBusinessData().setHasShowedTitle(true);
            }
            if (i == 3) {
                this.LJZ.setVisibility(0);
            }
        } else if (i == 1) {
            this.LJZ.setVisibility(8);
            this.LLF = this.LJLJL.getHeight();
            IAZ iaz = this.LJLLLLLL;
            if (this.LLIIJLIL.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            iaz.setForbidScroll(z);
            i2 = this.LLD;
            if (GSI.LIZ()) {
                i8 = this.LJZL;
                c68322mC.element = new AqS157S0100000_7(this, 218);
            }
            i3 = this.LLIIIJ;
            String obj = this.LJLJLLL.getText().toString();
            if (obj == null || ujb.o.LJJJJJL(obj)) {
                LIZIZ = this.LLD;
            } else {
                LIZIZ = this.LLD - ((int) KL2.LIZJ(this.LJLJJI, 33.0f));
            }
            LJIIJ(i);
            if (ujb.o.LJJJJJL(this.LJLJLLL.getText().toString())) {
                this.LJLJLJ.setVisibility(8);
            }
            if (this.LLJ == 3) {
                this.LJZ.setVisibility(8);
            }
            i4 = 0;
        } else {
            int LIZJ = LIZJ(i);
            LIZIZ = LIZIZ(LIZJ);
            if (GSI.LIZ()) {
                i2 = this.LJLJJLL.getHeight();
                i8 = LIZJ;
            } else {
                i2 = LIZJ;
            }
            i3 = -1;
            i4 = -1;
        }
        if (this.LLJ == 1) {
            z2 = true;
            View view = this.LJLZ;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            z2 = false;
        }
        this.LLILLL.LJLJJL.setValue(Boolean.valueOf(z2));
        SY4 sy4 = this.LJLLILLLL;
        if (!z2) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        sy4.setVisibility(i5);
        TuxIconView tuxIconView = this.LJLLJ;
        if (z2) {
            i7 = 0;
        }
        tuxIconView.setVisibility(i7);
        AqS38S0210000_7 aqS38S0210000_7 = new AqS38S0210000_7(z2, (boolean) this, (ExpandedTitleModule) c68322mC, (C68322mC<InterfaceC65784Pro<C76800UCe>>) 1);
        int height = this.LJLJJLL.getHeight();
        int height2 = this.LJLJJL.getHeight();
        int scrollY = this.LJLLLLLL.getScrollY();
        int minHeight = this.LJLLI.getMinHeight();
        if (i2 >= 0) {
            i6 = i2;
        } else {
            i6 = height;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(height, i6);
        ofInt.setDuration(this.LLFFF);
        ofInt.addUpdateListener(new C42012GeG(height, i2, this, i8, height2, i3, scrollY));
        ofInt.addListener(new C42011GeF(LIZIZ, minHeight, this, aqS38S0210000_7, i4));
        ofInt.start();
        this.LLJ = i;
    }

    public final int LIZIZ(int i) {
        int i2;
        if (GSI.LIZ() && (i2 = this.LLD) >= (i = i - ((Number) this.LL.getValue()).intValue())) {
            i = i2;
        }
        return i - this.LLFII;
    }

    public final int LIZJ(int i) {
        int LIZIZ;
        int i2 = 0;
        if (this.LJLLLL.getVisibility() != 8) {
            if (this.LJLLLL.getHeight() > 0) {
                LIZIZ = this.LJLLLL.getHeight();
            } else {
                LIZIZ = C7MY.LIZIZ(16);
            }
            TextView descCharacterLimit = this.LJLLLL;
            o.LJIIIIZZ(descCharacterLimit, "descCharacterLimit");
            ViewGroup.LayoutParams layoutParams = descCharacterLimit.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i2 = marginLayoutParams.topMargin;
            }
            i2 += LIZIZ;
        }
        if (i != 2) {
            if (i != 3) {
                if (GSI.LIZ()) {
                    return this.LJZL;
                }
                return this.LLD;
            }
            if (GSI.LIZ()) {
                return this.LLIIII - this.LLIIJI;
            }
            return (int) (this.LLIIII * 0.6d);
        }
        return (this.LLIIII - this.LJZI) - i2;
    }

    public final void LJI(boolean z) {
        this.LJZ.setVisibility(8);
        if (z) {
            int i = this.LLJ;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.LJZ.setVisibility(0);
                    return;
                } else {
                    LIZ(3);
                    if (this.LLIIJLIL.getVisibility() != 0) {
                        return;
                    }
                    this.LJZ.setVisibility(0);
                    return;
                }
            }
            this.LJLLLLLL.setForbidScroll(true);
            return;
        }
        int i2 = this.LLJ;
        if (i2 != 1) {
            if (i2 != 3) {
                return;
            }
            LIZ(2);
            return;
        }
        this.LJLLLLLL.setForbidScroll(false);
    }

    public final void LJIIIIZZ(boolean z) {
        View view;
        AbstractC029409q adapter;
        if (z) {
            RecyclerView recyclerView = (RecyclerView) this.LLILZ.getValue();
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 0) {
                recyclerView.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = (View) this.LLILZ.getValue();
        if (view2 == null || view2.getVisibility() != 0 || (view = (View) this.LLILZ.getValue()) == null) {
            return;
        }
        view.setVisibility(4);
    }

    public final void LJIIJ(int i) {
        View view;
        int i2 = 0;
        if (i == 1) {
            ViewGroup viewGroup = this.LLIIJLIL;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = this.LLFZ;
            marginLayoutParams.bottomMargin = 0;
            viewGroup.setLayoutParams(marginLayoutParams);
            C41315GJj.LIZ(viewGroup);
            C41315GJj.LIZ(this.LLIILZL);
            C41315GJj.LIZ(this.LLIIZ);
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.LLIIJLIL.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = LIZJ(3) + ((int) KL2.LIZJ(this.LJLJJI, 9.0f));
            if (C162356Yt.LIZ() && (view = this.LLIL) != null) {
                int i3 = marginLayoutParams2.topMargin;
                int measuredHeight = view.getMeasuredHeight();
                View view2 = this.LLILII;
                if (view2 != null) {
                    i2 = view2.getMeasuredHeight();
                }
                marginLayoutParams2.topMargin = measuredHeight + i2 + i3;
            }
            marginLayoutParams2.bottomMargin = this.LLIIIILZ;
            this.LLIIJLIL.setLayoutParams(marginLayoutParams2);
            ViewGroup viewGroup2 = this.LLIIJLIL;
            if (viewGroup2 != null) {
                C41315GJj.LJ(null, viewGroup2);
            }
            TextView textView = this.LLIILZL;
            if (textView != null) {
                C41315GJj.LJ(null, textView);
            }
            TextView textView2 = this.LLIIZ;
            if (textView2 != null) {
                C41315GJj.LJ(null, textView2);
            }
        }
        this.LLIIL.setOnTouchListener(ViewOnTouchListenerC42013GeH.LJLIL);
    }

    public final void LJIIJJI(int i) {
        ViewGroup.LayoutParams layoutParams = this.LJLJJLL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = i;
        this.LJLJJLL.setLayoutParams(marginLayoutParams);
        this.LJLLI.requestLayout();
    }

    public final void LJFF(boolean z, boolean z2) {
        Object obj;
        String str;
        List<SingleImageData> imageList;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_post_page");
        c145995oB.LJI("shoot_way", this.LJLIL.mShootWay);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(this.LJLIL));
        c145995oB.LJI("content_type", H7R.LJIIIZ(this.LJLIL));
        c145995oB.LJI("creation_id", this.LJLIL.getCreationId());
        c145995oB.LJI("mix_type", "photo");
        c145995oB.LIZ(1, "is_multi_content");
        ImageAlbumData imageAlbumData = this.LJLIL.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            obj = Integer.valueOf(imageList.size());
        } else {
            obj = null;
        }
        c145995oB.LIZJ(obj, "pic_cnt");
        if (z) {
            str = "zoom_in";
        } else {
            str = "zoom_out";
        }
        c145995oB.LJI("to_status", str);
        c145995oB.LIZ(z2 ? 1 : 0, "is_effective");
        c145995oB.LJI("author_id", C44172HVg.LJIJ.getCurrentUserID());
        GXR.LIZ("click_full_screen_input_button", c145995oB.LIZ);
    }

    public final void LJII(int i, int i2) {
        if (C90193gN.LIZIZ(this.LJLJJI)) {
            String string = C60903NvH.LJ.getResources().getString(R.string.jk5, Integer.valueOf(i2), Integer.valueOf(i));
            o.LJIIIIZZ(string, "getApp().resources.getSt…t, maxLength, textLength)");
            SpannableString spannableString = new SpannableString(string);
            if (i > i2) {
                spannableString.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.e7, this.LJLJJI)), s.LJJLIIIJL(spannableString, "/", 0, false, 6) + 1, spannableString.length(), 18);
            }
            this.LJLLLL.setText(spannableString);
        } else {
            String string2 = C60903NvH.LJ.getResources().getString(R.string.jk5, Integer.valueOf(i), Integer.valueOf(i2));
            o.LJIIIIZZ(string2, "getApp().resources.getSt…t, textLength, maxLength)");
            SpannableString spannableString2 = new SpannableString(string2);
            if (i > i2) {
                spannableString2.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.e7, this.LJLJJI)), 0, s.LJJLIIIJL(spannableString2, "/", 0, false, 6), 18);
            }
            this.LJLLLL.setText(spannableString2);
        }
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    public ExpandedTitleModule(WM7 rootScene, VideoPublishEditModel mModel, ViewGroup viewGroup, View fragmentRootView) {
        InputMethodManager inputMethodManager;
        int i;
        int i2;
        float LIZJ;
        String str;
        String str2;
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(fragmentRootView, "fragmentRootView");
        this.LJLIL = mModel;
        this.LJLILLLLZI = viewGroup;
        this.LJLJI = fragmentRootView;
        ActivityC45651qj LIZLLL = SceneExtensionsKt.LIZLLL(rootScene);
        this.LJLJJI = LIZLLL;
        this.LJLJJL = (C45631qh) viewGroup.findViewById(R.id.ei8);
        C119224m6 c119224m6 = (C119224m6) viewGroup.findViewById(R.id.cpw);
        c119224m6.getLayoutParams().height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(((Number) C42020GeO.LIZ.getValue()).doubleValue())));
        this.LJLJJLL = c119224m6;
        this.LJLJL = (ViewGroup) viewGroup.findViewById(R.id.cpx);
        this.LJLJLJ = viewGroup.findViewById(R.id.l_j);
        this.LJLJLLL = (EditText) viewGroup.findViewById(R.id.cqv);
        this.LJLL = (TextView) viewGroup.findViewById(R.id.l_f);
        GSR gsr = (GSR) viewGroup.findViewById(R.id.cqu);
        this.LJLLI = gsr;
        SY4 sy4 = (SY4) viewGroup.findViewById(R.id.com);
        this.LJLLILLLL = sy4;
        TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.cod);
        this.LJLLJ = tuxIconView;
        ViewGroup addExtraLayout = (ViewGroup) viewGroup.findViewById(R.id.fgk);
        this.LJLLL = addExtraLayout;
        this.LJLLLL = (TextView) viewGroup.findViewById(R.id.c79);
        this.LJLLLLLL = (IAZ) fragmentRootView.findViewById(R.id.ifg);
        this.LJLZ = fragmentRootView.findViewById(R.id.k8c);
        View findViewById = viewGroup.findViewById(R.id.eh6);
        o.LJIIIIZZ(findViewById, "editorLayout.findViewByI…image_header_bottom_line)");
        this.LJZ = findViewById;
        this.LJZI = (int) KL2.LIZJ(LIZLLL, 60.0f);
        this.LL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 220));
        this.LLD = c119224m6.getLayoutParams().height;
        this.LLF = -1;
        boolean LJ = C19N.LJ("photo_mode_publish_title", false);
        this.LLFF = LJ;
        this.LLFFF = 250L;
        this.LLFZ = (int) KL2.LIZJ(LIZLLL, 254.0f);
        this.LLII = -1;
        this.LLIIII = -1;
        this.LLIIIZ = new SafeHandler(rootScene);
        this.LLIIJI = C7MY.LIZIZ(168);
        View findViewById2 = fragmentRootView.findViewById(R.id.e2r);
        o.LJIIIIZZ(findViewById2, "fragmentRootView.findVie…yId(R.id.hashtag_content)");
        this.LLIIJLIL = (ViewGroup) findViewById2;
        View findViewById3 = fragmentRootView.findViewById(R.id.kfq);
        o.LJIIIIZZ(findViewById3, "fragmentRootView.findVie…R.id.status_view_wrapper)");
        this.LLIIL = (ViewGroup) findViewById3;
        View findViewById4 = fragmentRootView.findViewById(R.id.ap_);
        o.LJIIIIZZ(findViewById4, "fragmentRootView.findVie…Id(R.id.bottom_container)");
        this.LLIILII = (ViewGroup) findViewById4;
        View findViewById5 = fragmentRootView.findViewById(R.id.a9c);
        o.LJIIIIZZ(findViewById5, "fragmentRootView.findViewById(R.id.at_friends)");
        this.LLIILZL = (TextView) findViewById5;
        View findViewById6 = fragmentRootView.findViewById(R.id.wd);
        o.LJIIIIZZ(findViewById6, "fragmentRootView.findViewById(R.id.add_videos)");
        TextView textView = (TextView) findViewById6;
        this.LLIIZ = textView;
        this.LLIL = fragmentRootView.findViewById(R.id.le7);
        this.LLILII = fragmentRootView.findViewById(R.id.jbo);
        Object LLILLJJLI = C16880lQ.LLILLJJLI(LIZLLL, "input_method");
        if (LLILLJJLI instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) LLILLJJLI;
        } else {
            inputMethodManager = null;
        }
        this.LLILIL = inputMethodManager;
        C83547Wqd LJIIJ = C78866UxK.LJIIJ(LIZLLL);
        this.LLILL = LJIIJ;
        this.LLILLL = (ExpandTextViewModel) C165706es.LJIIIIZZ(rootScene, null, null, 6).get(ExpandTextViewModel.class);
        this.LLILZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 219));
        this.LLIZ = 3;
        C42010GeE c42010GeE = new C42010GeE(this);
        this.LLIZLLLIL = new ARunnableS43S0100000_7(this, 27);
        this.LLJ = 1;
        if (!LJ || (str2 = mModel.heading) == null || ujb.o.LJJJJJL(str2)) {
            i = c119224m6.getLayoutParams().height;
        } else {
            i = c119224m6.getLayoutParams().height - ((int) KL2.LIZJ(LIZLLL, 33.0f));
        }
        gsr.setMinHeight(i);
        gsr.LLIZ = false;
        boolean LIZ = C58B.LIZ();
        if (C40981G6n.LIZ()) {
            if (LIZ) {
                i2 = R.drawable.a5z;
            } else {
                i2 = R.drawable.a5y;
            }
        } else if (LIZ) {
            i2 = R.drawable.a5k;
        } else {
            i2 = R.drawable.a5j;
        }
        sy4.setBackgroundResource(i2);
        tuxIconView.setBackgroundResource(i2);
        if (C19N.LJ("photo_mode_publish_expand", false)) {
            sy4.setVisibility(0);
        }
        C16880lQ.LJJIZ(sy4, new ACListenerS27S0100000_7(this, 95));
        C16880lQ.LJJJ(tuxIconView, new ACListenerS27S0100000_7(this, 96));
        if (mModel.creativeModel.editPostModel != null) {
            o.LJIIIIZZ(addExtraLayout, "addExtraLayout");
            C26338AVi.LJI(addExtraLayout, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), false, 23);
        }
        if (LJ || (C41535GRv.LIZ() && (str = mModel.heading) != null && str.length() != 0)) {
            if (GSI.LIZ()) {
                LIZJ = KL2.LIZJ(LIZLLL, 31.0f);
            } else {
                LIZJ = KL2.LIZJ(LIZLLL, 41.0f);
            }
            this.LLFII = (int) LIZJ;
        }
        LJIIJ.LIZIZ(c42010GeE);
        rootScene.getLifecycle().addObserver(this);
        fragmentRootView.post(new ARunnableS43S0100000_7(this, 26));
        C41315GJj.LIZ(textView);
        LJIIJ(1);
    }
}
