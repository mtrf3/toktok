package com.ss.android.ugc.aweme.topic.review.panel;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C56K;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C78983UzD;
import X.C79045V0n;
import X.C7UO;
import X.C7UP;
import X.C84G;
import X.C90193gN;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.FMX;
import X.InterfaceC187177Wf;
import X.OSZ;
import X.SY4;
import X.T5T;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.IDObjectS176S0100000_3;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicReviewPanel extends BaseFragment {
    public static final /* synthetic */ int LJLLI = 0;
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;
    public Integer LJLJI;
    public TopicReview LJLJJI;
    public C252709vu LJLJJL;
    public C84G LJLJJLL;
    public T5T LJLJL;
    public TuxTextView LJLJLJ;
    public SY4 LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    static {
        new C7UO();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public TopicReviewPanel() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicReviewVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1113);
        C7UP c7up = C7UP.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7up, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7up, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Al() {
        /*
            r8 = this;
            X.84G r0 = r8.LJLJJLL
            java.lang.String r7 = "ratingBar"
            r6 = 0
            if (r0 == 0) goto L9f
            float r1 = r0.getRatingValue()
            r0 = 0
            r3 = 1
            r4 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = 1
        L13:
            java.lang.String r5 = "submitButton"
            if (r0 == 0) goto L25
            X.SY4 r0 = r8.LJLJLLL
            if (r0 == 0) goto L21
            r0.setEnabled(r4)
            return
        L1f:
            r0 = 0
            goto L13
        L21:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        L25:
            com.ss.android.ugc.aweme.topic.review.model.TopicReview r2 = r8.LJLJJI
            if (r2 == 0) goto L64
            X.84G r0 = r8.LJLJJLL
            if (r0 == 0) goto L9b
            float r0 = r0.getRatingValue()
            int r1 = X.O6R.LJJIIZ(r0)
            int r0 = r2.getTopicRating()
            if (r1 != r0) goto L64
            r0 = 1
        L3c:
            java.lang.String r2 = "editText"
            if (r0 == 0) goto L6e
            X.T5T r0 = r8.LJLJL
            if (r0 == 0) goto L6a
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.topic.review.model.TopicReview r0 = r8.LJLJJI
            if (r0 == 0) goto L62
            java.lang.String r0 = r0.getText()
        L54:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L6e
            X.SY4 r0 = r8.LJLJLLL
            if (r0 == 0) goto L66
            r0.setEnabled(r4)
            return
        L62:
            r0 = r6
            goto L54
        L64:
            r0 = 0
            goto L3c
        L66:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        L6a:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r6
        L6e:
            X.T5T r0 = r8.LJLJL
            if (r0 == 0) goto L97
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L96
            int r2 = r0.length()
            X.SY4 r1 = r8.LJLJLLL
            if (r1 == 0) goto L92
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 > r0) goto L90
            boolean r0 = r8.vl()
            if (r0 == 0) goto L8c
            if (r2 == 0) goto L90
        L8c:
            r1.setEnabled(r3)
            return
        L90:
            r3 = 0
            goto L8c
        L92:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        L96:
            return
        L97:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r6
        L9b:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r6
        L9f:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel.Al():void");
    }

    public final boolean vl() {
        String text;
        TopicReview topicReview = this.LJLJJI;
        if (topicReview == null || (text = topicReview.getText()) == null || text.length() <= 0) {
            return false;
        }
        return true;
    }

    public final TopicReviewVM wl() {
        return (TopicReviewVM) this.LJLIL.getValue();
    }

    public final void xl() {
        Integer LJI;
        T5T t5t = this.LJLJL;
        if (t5t != null) {
            Editable text = t5t.getText();
            if (text != null) {
                int length = text.length();
                Context context = getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.e7, context)) != null) {
                    int intValue = LJI.intValue();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String valueOf = String.valueOf(length);
                    spannableStringBuilder.append((CharSequence) valueOf).append((CharSequence) "/").append((CharSequence) "500");
                    int i = 0;
                    if (length > 500 || (vl() && length == 0)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(intValue), 0, valueOf.length(), 17);
                    }
                    TuxTextView tuxTextView = this.LJLJLJ;
                    if (tuxTextView != null) {
                        tuxTextView.setText(spannableStringBuilder);
                        TuxTextView tuxTextView2 = this.LJLJLJ;
                        if (tuxTextView2 != null) {
                            if (length <= 0 && !vl()) {
                                i = 8;
                            }
                            tuxTextView2.setVisibility(i);
                            return;
                        }
                        o.LJIJI("lengthHint");
                        throw null;
                    }
                    o.LJIJI("lengthHint");
                    throw null;
                }
                return;
            }
            return;
        }
        o.LJIJI("editText");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        T5T t5t = this.LJLJL;
        if (t5t != null) {
            KeyboardUtils.LIZIZ(t5t);
            KeyboardUtils.LJ(3, 15, mo49getActivity());
        } else {
            o.LJIJI("editText");
            throw null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FMX.LJIIL("enter_topic_review_panel", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(new OSZ("enter_from", "topic_detail"), new OSZ("enter_method", ((LinkedHashMap) wl().LJLJI).get("enter_method")), new OSZ("previous_page", ((LinkedHashMap) wl().LJLJI).get("previous_page")), new OSZ("category", C78983UzD.LJJLIIIJ(wl().LJLILLLLZI)), new OSZ("topic_id", wl().LJLIL), new OSZ("topic_title", ((LinkedHashMap) wl().LJLJI).get("topic_title"))), new LinkedHashMap()));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TopicReview topicReview;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLILLLLZI = arguments.getBoolean("auto_focus", this.LJLILLLLZI);
            Integer valueOf = Integer.valueOf(arguments.getInt("initial_rating"));
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            this.LJLJI = valueOf;
            Serializable serializable = arguments.getSerializable("initial_review");
            if (serializable instanceof TopicReview) {
                topicReview = (TopicReview) serializable;
            } else {
                topicReview = null;
            }
            this.LJLJJI = topicReview;
        }
        View findViewById = view.findViewById(R.id.gwg);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.nav_bar)");
        this.LJLJJL = (C252709vu) findViewById;
        View findViewById2 = view.findViewById(R.id.in_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.rating_bar)");
        this.LJLJJLL = (C84G) findViewById2;
        View findViewById3 = view.findViewById(R.id.cps);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.edit_text)");
        this.LJLJL = (T5T) findViewById3;
        View findViewById4 = view.findViewById(R.id.fq1);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.length_hint)");
        this.LJLJLJ = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.kpl);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.submit_button)");
        this.LJLJLLL = (SY4) findViewById5;
        C252709vu c252709vu = this.LJLJJL;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            String string = c252709vu.getContext().getString(R.string.cd_);
            o.LJIIIIZZ(string, "context.getString(R.stri…ereview_ratepopup_header)");
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS153S0100000_3(this, 1112));
            c235119Kp.LIZIZ(LIZJ);
            c252709vu.setNavActions(c235119Kp);
            c252709vu.LJIILJJIL(true);
            T5T t5t = this.LJLJL;
            if (t5t != null) {
                t5t.addTextChangedListener(new IDObjectS176S0100000_3(this, 9));
                SY4 sy4 = this.LJLJLLL;
                if (sy4 != null) {
                    C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 163));
                    TopicReview topicReview2 = this.LJLJJI;
                    if (topicReview2 != null) {
                        C84G c84g = this.LJLJJLL;
                        if (c84g != null) {
                            c84g.setRatingValue(topicReview2.getTopicRating());
                            String text = topicReview2.getText();
                            if (text != null) {
                                T5T t5t2 = this.LJLJL;
                                if (t5t2 != null) {
                                    t5t2.setText(text);
                                } else {
                                    o.LJIJI("editText");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("ratingBar");
                            throw null;
                        }
                    }
                    Integer num = this.LJLJI;
                    if (num != null) {
                        int intValue = num.intValue();
                        C84G c84g2 = this.LJLJJLL;
                        if (c84g2 != null) {
                            c84g2.setRatingValue(intValue);
                        } else {
                            o.LJIJI("ratingBar");
                            throw null;
                        }
                    }
                    xl();
                    Al();
                    C56K c56k = new C56K();
                    C84G c84g3 = this.LJLJJLL;
                    if (c84g3 != null) {
                        c56k.element = c84g3.getRatingValue();
                        C84G c84g4 = this.LJLJJLL;
                        if (c84g4 != null) {
                            c84g4.setOnStarChanged$topic_release(new AqS134S0200000_3(c56k, this, 162));
                            new KeyBoardMonitor(this).LIZ(view, new InterfaceC187177Wf() { // from class: X.7UN
                                @Override // X.InterfaceC187177Wf
                                public final void LLLLLILLIL() {
                                    DialogFragment dialogFragment;
                                    Dialog dialog;
                                    Fragment parentFragment = TopicReviewPanel.this.getParentFragment();
                                    if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null && (dialog = dialogFragment.getDialog()) != null) {
                                        dialog.setCanceledOnTouchOutside(false);
                                    }
                                }

                                @Override // X.InterfaceC187177Wf
                                public final void S2() {
                                    DialogFragment dialogFragment;
                                    Dialog dialog;
                                    Fragment parentFragment = TopicReviewPanel.this.getParentFragment();
                                    if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null && (dialog = dialogFragment.getDialog()) != null) {
                                        dialog.setCanceledOnTouchOutside(true);
                                    }
                                }
                            });
                            if (C90193gN.LIZ()) {
                                T5T t5t3 = this.LJLJL;
                                if (t5t3 != null) {
                                    t5t3.setGravity(5);
                                } else {
                                    o.LJIJI("editText");
                                    throw null;
                                }
                            }
                            if (this.LJLILLLLZI) {
                                view.postDelayed(new ARunnableS39S0100000_3(this, 96), 100L);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("ratingBar");
                        throw null;
                    }
                    o.LJIJI("ratingBar");
                    throw null;
                }
                o.LJIJI("submitButton");
                throw null;
            }
            o.LJIJI("editText");
            throw null;
        }
        o.LJIJI("navBar");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.css, viewGroup, false);
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
