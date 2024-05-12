package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.AbstractC030109x;
import X.AbstractC156316Bn;
import X.AbstractC28931Bp;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C0A6;
import X.C10A;
import X.C120994ox;
import X.C122784rq;
import X.C127594zb;
import X.C1280450u;
import X.C132005Ga;
import X.C132145Go;
import X.C132155Gp;
import X.C13860gY;
import X.C139795eB;
import X.C141335gf;
import X.C151035wJ;
import X.C152375yT;
import X.C152515yh;
import X.C161806Wq;
import X.C16880lQ;
import X.C221108m2;
import X.C223338pd;
import X.C26231ARf;
import X.C29S;
import X.C3C5;
import X.C40675Fxn;
import X.C47919IrL;
import X.C58B;
import X.C5FC;
import X.C5G0;
import X.C5K1;
import X.C62822Ol8;
import X.C69W;
import X.C69Z;
import X.C6B8;
import X.C6YK;
import X.C74275TDb;
import X.C76800UCe;
import X.C78841Uwv;
import X.C78926UyI;
import X.C79057V0z;
import X.C82949Wgz;
import X.C90903hW;
import X.EnumC126814yL;
import X.FMX;
import X.H78;
import X.H8F;
import X.X1D;
import X.XS7;
import X.XSB;
import Y.ACListenerS22S0100000_2;
import Y.AUListenerS94S0200000_2;
import Y.IDComparatorS30S0000000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class InlineCaptionFragment extends TTResourcePanelFragment<InlineCaptionViewModel> implements XSB {
    public final C5K1 LJLZ;
    public final C132005Ga LJZ;
    public final String LJZI;
    public final boolean LJZL;
    public final NLETrackSlot LL;
    public LinearLayout LLD;
    public TuxIconView LLF;
    public TuxIconView LLFF;
    public TuxTextView LLFFF;
    public View LLFII;
    public View LLFZ;
    public View LLI;
    public TuxIconView LLIFFJFJJ;
    public TuxIconView LLII;
    public TuxIconView LLIIII;
    public FrameLayout LLIIIILZ;
    public View LLIIIJ;
    public C161806Wq LLIIIL;
    public LinearLayout LLIIIZ;
    public TuxTextView LLIIJI;
    public TuxTextView LLIIJLIL;
    public TuxTextView LLIIL;
    public LinearLayout LLIILII;
    public C223338pd LLIILZL;
    public View LLIIZ;
    public View LLIL;
    public C69W LLILII;
    public EditCaptionScene.HighLightLayoutManager LLILIL;
    public IDlS62S0100000_2 LLILL;
    public String LLILLIZIL;
    public String LLILLJJLI;
    public SafeHandler LLILLL;
    public SafeHandler LLILZ;
    public C151035wJ LLILZIL;
    public final ArrayList<NLETrackSlot> LLILZLL;
    public final ArrayList<TextStickerData> LLIZ;
    public List<TextStickerData> LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public C82949Wgz LLJIJIL;
    public C82949Wgz LLJILJIL;
    public final C62822Ol8 LLJILJILJ;
    public C152375yT LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public C26231ARf LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public long LLJJIJIL;
    public final C62822Ol8 LLJJJ;
    public final C62822Ol8 LLJJJIL;
    public final ValueAnimator LLJJJJ;
    public final Map<Integer, View> LLJJJJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineCaptionFragment() {
        this((C5K1) null, (C132005Ga) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), false, 31);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "inline_caption";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJJJJJIL).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLJJJJJIL;
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

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.asc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 == true) goto L6;
     */
    @Override // X.XSB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D7() {
        /*
            r6 = this;
            java.lang.String r0 = "InlineCaptionFragment -> showRetryView"
            X.H78.LIZ(r0)
            X.ARf r0 = r6.LLJJIII
            if (r0 == 0) goto L7a
            boolean r1 = r0.LJII()
            r0 = 1
            if (r1 != r0) goto L7a
        L10:
            r5 = 0
            if (r0 == 0) goto L1c
            X.ARf r0 = r6.LLJJIII
            if (r0 == 0) goto L1a
            r0.LIZIZ(r5)
        L1a:
            r6.LLJJIII = r5
        L1c:
            r6.Ej()
            android.widget.LinearLayout r1 = r6.LLIILII
            if (r1 == 0) goto L94
            r0 = 8
            r1.setVisibility(r0)
            X.Wgz r0 = r6.LLJIJIL
            java.lang.String r4 = "mRetryView"
            if (r0 != 0) goto L41
            X.Wgz r3 = new X.Wgz
            android.widget.FrameLayout r2 = r6.LLIIIILZ
            if (r2 == 0) goto L8e
            android.widget.LinearLayout r1 = r6.LLIIIZ
            if (r1 == 0) goto L88
            android.view.View r0 = r6.LLIIZ
            if (r0 == 0) goto L84
            r3.<init>(r2, r1, r0)
            r6.LLJIJIL = r3
        L41:
            android.view.View r1 = r6.LLIIZ
            if (r1 == 0) goto L80
            r0 = 2131377180(0x7f0a3c1c, float:1.8374557E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            Y.ACListenerS22S0100000_2 r1 = new Y.ACListenerS22S0100000_2
            r0 = 66
            r1.<init>(r6, r0)
            X.C16880lQ.LJIJI(r2, r1)
            android.view.View r1 = r6.LLIIZ
            if (r1 == 0) goto L7c
            r0 = 2131363718(0x7f0a0786, float:1.8347253E38)
            android.view.View r2 = r1.findViewById(r0)
            Y.ACListenerS22S0100000_2 r1 = new Y.ACListenerS22S0100000_2
            r0 = 67
            r1.<init>(r6, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            X.Wgz r1 = r6.LLJIJIL
            if (r1 == 0) goto L79
            X.1Hm r0 = new X.1Hm
            r0.<init>()
            r1.LIZIZ(r0)
        L79:
            return
        L7a:
            r0 = 0
            goto L10
        L7c:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L80:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L84:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L88:
            java.lang.String r0 = "mLoadingArea"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L8e:
            java.lang.String r0 = "mSubtitlePlayContent"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L94:
            java.lang.String r0 = "mSubtitleLayout"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment.D7():void");
    }

    public final void Ej() {
        SafeHandler safeHandler = this.LLILLL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            this.LLJJJJ.cancel();
            SafeHandler safeHandler2 = this.LLILZ;
            if (safeHandler2 != null) {
                safeHandler2.removeCallbacksAndMessages(null);
                C223338pd c223338pd = this.LLIILZL;
                if (c223338pd != null) {
                    c223338pd.LIZJ();
                    LinearLayout linearLayout = this.LLIIIZ;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                        return;
                    } else {
                        o.LJIJI("mLoadingArea");
                        throw null;
                    }
                }
                o.LJIJI("mLoadingStatusView");
                throw null;
            }
            o.LJIJI("mTipsHandler");
            throw null;
        }
        o.LJIJI("mSafeHandler");
        throw null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        return C6YK.LIZ(new C139795eB(EnumC126814yL.EDIT_CAPTION.getNameId(), null, null, null, null, 30));
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        if (this.LLJJ || this.LLJJI) {
            return;
        }
        pm();
        C79057V0z.LJJJJL(Jl(), "quit_edit_caption", Boolean.TRUE);
        long LJJJI = C78926UyI.LJJJI(C79057V0z.LJIJJLI(Jl()));
        super.Sl();
        qm(LJJJI);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(InlineCaptionViewModel.class);
    }

    public final int mm() {
        C161806Wq c161806Wq = this.LLIIIL;
        if (c161806Wq != null) {
            if (c161806Wq.getAdapter() == null) {
                return -1;
            }
            C69W c69w = this.LLILII;
            if (c69w != null) {
                ArrayList<CaptionUtterance> arrayList = c69w.LJLIL;
                Iterator<CaptionUtterance> it = arrayList.iterator();
                while (it.hasNext()) {
                    CaptionUtterance next = it.next();
                    if (((int) next.LIZIZ()) != 0 || ((int) next.LIZ()) != this.LLJ) {
                        long LIZIZ = next.LIZIZ();
                        long LIZ = next.LIZ();
                        long j = this.LLJI;
                        if (LIZIZ <= j && j <= LIZ && next.LIZLLL().length() > 0) {
                            return arrayList.indexOf(next);
                        }
                    }
                }
                return 0;
            }
            o.LJIJI("mSubtitleAdapter");
            throw null;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 == true) goto L6;
     */
    @Override // X.XSB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qb() {
        /*
            r6 = this;
            java.lang.String r0 = "InlineCaptionFragment -> showExitView"
            X.H78.LIZ(r0)
            X.ARf r0 = r6.LLJJIII
            if (r0 == 0) goto L66
            boolean r1 = r0.LJII()
            r0 = 1
            if (r1 != r0) goto L66
        L10:
            r5 = 0
            if (r0 == 0) goto L1c
            X.ARf r0 = r6.LLJJIII
            if (r0 == 0) goto L1a
            r0.LIZIZ(r5)
        L1a:
            r6.LLJJIII = r5
        L1c:
            r6.Ej()
            android.widget.LinearLayout r1 = r6.LLIILII
            if (r1 == 0) goto L82
            r0 = 8
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r0 = r6.LLILLL
            if (r0 == 0) goto L7c
            r0.removeCallbacksAndMessages(r5)
            X.Wgz r4 = new X.Wgz
            android.widget.FrameLayout r3 = r6.LLIIIILZ
            if (r3 == 0) goto L76
            android.widget.LinearLayout r2 = r6.LLIIIZ
            if (r2 == 0) goto L70
            android.view.View r1 = r6.LLIL
            java.lang.String r0 = "mExitView"
            if (r1 == 0) goto L6c
            r4.<init>(r3, r2, r1)
            r6.LLJILJIL = r4
            android.view.View r1 = r6.LLIL
            if (r1 == 0) goto L68
            r0 = 2131363904(0x7f0a0840, float:1.834763E38)
            android.view.View r2 = r1.findViewById(r0)
            Y.ACListenerS22S0100000_2 r1 = new Y.ACListenerS22S0100000_2
            r0 = 64
            r1.<init>(r6, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            X.Wgz r1 = r6.LLJILJIL
            if (r1 == 0) goto L65
            X.1Hm r0 = new X.1Hm
            r0.<init>()
            r1.LIZIZ(r0)
        L65:
            return
        L66:
            r0 = 0
            goto L10
        L68:
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L6c:
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L70:
            java.lang.String r0 = "mLoadingArea"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L76:
            java.lang.String r0 = "mSubtitlePlayContent"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L7c:
            java.lang.String r0 = "mSafeHandler"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L82:
            java.lang.String r0 = "mSubtitleLayout"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment.qb():void");
    }

    public final void sm() {
        TuxIconView tuxIconView = this.LLIFFJFJJ;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
            TuxIconView tuxIconView2 = this.LLII;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
                TuxIconView tuxIconView3 = this.LLIIII;
                if (tuxIconView3 != null) {
                    tuxIconView3.setVisibility(0);
                    LinearLayout linearLayout = this.LLIILII;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                        LinearLayout linearLayout2 = this.LLIIIZ;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(8);
                            return;
                        } else {
                            o.LJIJI("mLoadingArea");
                            throw null;
                        }
                    }
                    o.LJIJI("mSubtitleLayout");
                    throw null;
                }
                o.LJIJI("mIvDelete");
                throw null;
            }
            o.LJIJI("mIvFont");
            throw null;
        }
        o.LJIJI("mIvEdit");
        throw null;
    }

    public final void xm() {
        TuxIconView tuxIconView = this.LLIFFJFJJ;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
            TuxIconView tuxIconView2 = this.LLII;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
                TuxIconView tuxIconView3 = this.LLIIII;
                if (tuxIconView3 != null) {
                    tuxIconView3.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("mIvDelete");
                    throw null;
                }
            }
            o.LJIJI("mIvFont");
            throw null;
        }
        o.LJIJI("mIvEdit");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        VideoPublishEditModel em = em();
        if (em != null) {
            FMX.LJIIL("save_subtitle", H8F.LJIILJJIL(1, em, ((InlineCaptionViewModel) Ml()).gv0(this.LLILLIZIL)).LIZ);
        }
        lm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lm() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment.lm():void");
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        H78.LIZ("InlineCaptionFragment -> onDestroy");
        if (C1280450u.LIZ()) {
            pm();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        H78.LIZ("InlineCaptionFragment -> onStop");
        if (this.LLJILLL != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (C47919IrL.LIZJ != null) {
                try {
                    C16880lQ.LJJLIIIJL(C16880lQ.LLLLL(mo49getActivity), C47919IrL.LIZJ);
                } catch (Exception unused) {
                }
            }
            this.LLJILLL = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pm() {
        XS7 xs7 = ((InlineCaptionViewModel) Ml()).LJLJJL;
        if (xs7 != null) {
            xs7.LIZ();
        }
        SafeHandler safeHandler = this.LLILLL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            this.LLJJJJ.cancel();
            SafeHandler safeHandler2 = this.LLILZ;
            if (safeHandler2 != null) {
                safeHandler2.removeCallbacksAndMessages(null);
                return;
            } else {
                o.LJIJI("mTipsHandler");
                throw null;
            }
        }
        o.LJIJI("mSafeHandler");
        throw null;
    }

    public final void A90(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLIFFJFJJ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
                TuxIconView tuxIconView2 = this.LLII;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                    TuxIconView tuxIconView3 = this.LLIIII;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setVisibility(8);
                        View view = this.LLFII;
                        if (view != null) {
                            view.setVisibility(0);
                            View view2 = this.LLFZ;
                            if (view2 != null) {
                                view2.setVisibility(4);
                                View view3 = this.LLI;
                                if (view3 != null) {
                                    view3.setVisibility(4);
                                    Runnable runnable = new Runnable() { // from class: X.5yS
                                        public int LJLIL;
                                        public final String[] LJLILLLLZI;

                                        public final void LIZ() {
                                            TuxTextView tuxTextView = InlineCaptionFragment.this.LLIIJLIL;
                                            if (tuxTextView != null) {
                                                String[] strArr = this.LJLILLLLZI;
                                                int i = this.LJLIL;
                                                this.LJLIL = i + 1;
                                                tuxTextView.setText(strArr[i]);
                                                this.LJLIL %= 2;
                                                SafeHandler safeHandler = InlineCaptionFragment.this.LLILZ;
                                                if (safeHandler != null) {
                                                    safeHandler.postDelayed(this, 5000L);
                                                    return;
                                                } else {
                                                    o.LJIJI("mTipsHandler");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("mLoadingHint");
                                            throw null;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean LIZ;
                                            try {
                                                LIZ();
                                            } finally {
                                                if (LIZ) {
                                                }
                                            }
                                        }

                                        {
                                            this.LJLILLLLZI = new String[]{InlineCaptionFragment.this.getString(R.string.bxb), InlineCaptionFragment.this.getString(R.string.bxc)};
                                        }
                                    };
                                    SafeHandler safeHandler = this.LLILZ;
                                    if (safeHandler != null) {
                                        safeHandler.post(runnable);
                                        this.LLJJJJ.start();
                                        LinearLayout linearLayout = this.LLIIIZ;
                                        if (linearLayout != null) {
                                            linearLayout.setVisibility(0);
                                            LinearLayout linearLayout2 = this.LLIILII;
                                            if (linearLayout2 != null) {
                                                linearLayout2.setVisibility(8);
                                                C223338pd c223338pd = this.LLIILZL;
                                                if (c223338pd != null) {
                                                    c223338pd.LIZIZ();
                                                    LinearLayout linearLayout3 = this.LLIIIZ;
                                                    if (linearLayout3 != null) {
                                                        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 65), linearLayout3.findViewById(R.id.b3r));
                                                        return;
                                                    } else {
                                                        o.LJIJI("mLoadingArea");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("mLoadingStatusView");
                                                throw null;
                                            }
                                            o.LJIJI("mSubtitleLayout");
                                            throw null;
                                        }
                                        o.LJIJI("mLoadingArea");
                                        throw null;
                                    }
                                    o.LJIJI("mTipsHandler");
                                    throw null;
                                }
                                o.LJIJI("mViewGradientBottonm");
                                throw null;
                            }
                            o.LJIJI("mViewGradientTop");
                            throw null;
                        }
                        o.LJIJI("mViewLine");
                        throw null;
                    }
                    o.LJIJI("mIvDelete");
                    throw null;
                }
                o.LJIJI("mIvFont");
                throw null;
            }
            o.LJIJI("mIvEdit");
            throw null;
        }
        xm();
        this.LLJJJJ.cancel();
        SafeHandler safeHandler2 = this.LLILZ;
        if (safeHandler2 != null) {
            safeHandler2.removeCallbacksAndMessages(null);
            C223338pd c223338pd2 = this.LLIILZL;
            if (c223338pd2 != null) {
                c223338pd2.LIZJ();
                LinearLayout linearLayout4 = this.LLIIIZ;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                    LinearLayout linearLayout5 = this.LLIILII;
                    if (linearLayout5 != null) {
                        linearLayout5.setVisibility(0);
                        LinearLayout linearLayout6 = this.LLIILII;
                        if (linearLayout6 != null) {
                            linearLayout6.setAlpha(1.0f);
                            return;
                        } else {
                            o.LJIJI("mSubtitleLayout");
                            throw null;
                        }
                    }
                    o.LJIJI("mSubtitleLayout");
                    throw null;
                }
                o.LJIJI("mLoadingArea");
                throw null;
            }
            o.LJIJI("mLoadingStatusView");
            throw null;
        }
        o.LJIJI("mTipsHandler");
        throw null;
    }

    @Override // X.XSB
    public final void e9(List<Utterance> caption) {
        long j;
        boolean z;
        String str;
        C6B8 c6b8;
        o.LJIIIZ(caption, "caption");
        NLEModel LJJI = C79057V0z.LJJI(Jl());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        XS7 xs7 = ((InlineCaptionViewModel) Ml()).LJLJJL;
        long j2 = 0;
        if (xs7 != null) {
            j = xs7.LJIILLIIL;
        } else {
            j = 0;
        }
        long j3 = elapsedRealtime - j;
        String lastDurationString = LJJI.getExtra("add_captions_duration");
        if (lastDurationString != null && lastDurationString.length() != 0) {
            o.LJIIIIZZ(lastDurationString, "lastDurationString");
            j2 = CastLongProtector.parseLong(lastDurationString);
        }
        LJJI.setExtra("add_captions_duration", String.valueOf(j2 + j3));
        C26231ARf c26231ARf = this.LLJJIII;
        if (c26231ARf != null && c26231ARf.LJII()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            C26231ARf c26231ARf2 = this.LLJJIII;
            if (c26231ARf2 != null) {
                c26231ARf2.LIZIZ(null);
            }
            this.LLJJIII = null;
        }
        XS7 xs72 = ((InlineCaptionViewModel) Ml()).LJLJJL;
        if (xs72 != null) {
            str = xs72.LJ;
        } else {
            str = null;
        }
        this.LLILLJJLI = str;
        VideoPublishEditModel em = em();
        if (em != null && (c6b8 = em.mSubtitleMusicChangeChecker) != null) {
            VideoPublishEditModel em2 = em();
            o.LJI(em2);
            c6b8.getData(em2);
        }
        A90(false);
        _$_findCachedViewById(R.id.c62).setVisibility(0);
        ArrayList<TextStickerData> arrayList = new ArrayList<>();
        String str3 = this.LLILLJJLI;
        XS7 xs73 = ((InlineCaptionViewModel) Ml()).LJLJJL;
        if (xs73 != null) {
            str2 = xs73.LJFF;
        }
        CaptionQueryInfo captionQueryInfo = new CaptionQueryInfo(str3, str2);
        for (Utterance utterance : caption) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                TextStickerData LJJJJ = C78841Uwv.LJJJJ(utterance, mo49getActivity, true);
                LJJJJ.setX(LJJJJ.getX() * this.LLJJIJI);
                LJJJJ.setY(LJJJJ.getY() * this.LLJJIJIIJIL);
                arrayList.add(LJJJJ);
            }
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(16));
        }
        this.LJLZ.LJ(this.LLILLIZIL, arrayList, captionQueryInfo);
        C79057V0z.LJJJJL(Jl(), "add_recognized_caption", arrayList);
        String str4 = this.LJZI;
        if (o.LJ(str4, "caption")) {
            InlineCaptionViewModel inlineCaptionViewModel = (InlineCaptionViewModel) Ml();
            if (inlineCaptionViewModel.LJLJJI.LIZ.isVisible()) {
                inlineCaptionViewModel.LJLJJI.LIZ.dismiss();
            }
            lm();
            return;
        }
        if (!o.LJ(str4, "bulk_editing")) {
            return;
        }
        om(arrayList);
    }

    public final void nm(boolean z) {
        float f;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        TuxTextView tuxTextView = this.LLFFF;
        if (tuxTextView != null) {
            tuxTextView.setAlpha(f);
            TuxIconView tuxIconView = this.LLF;
            if (tuxIconView != null) {
                tuxIconView.setAlpha(f);
                TuxIconView tuxIconView2 = this.LLFF;
                if (tuxIconView2 != null) {
                    tuxIconView2.setAlpha(f);
                    return;
                } else {
                    o.LJIJI("mIconRight");
                    throw null;
                }
            }
            o.LJIJI("mIconGlobe");
            throw null;
        }
        o.LJIJI("mTvLanguageName");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void om(java.util.List<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData> r101) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment.om(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        long j;
        ArrayList<CaptionUtterance> arrayList;
        CreativeModel creativeModel;
        super.onActivityCreated(bundle);
        H78.LIZ("InlineCaptionFragment -> onActivityCreated");
        ArrayList arrayList2 = null;
        boolean z = true;
        if (o.LJ(this.LJZI, "caption")) {
            A90(true);
            LinearLayout linearLayout = this.LLIILII;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                _$_findCachedViewById(R.id.c62).setVisibility(4);
                VideoPublishEditModel em = em();
                if (em != null && (creativeModel = em.creativeModel) != null) {
                    creativeModel.inlineCaptionModel = null;
                }
                this.LLIZ.clear();
                this.LLIZLLLIL = null;
                XS7 xs7 = ((InlineCaptionViewModel) Ml()).LJLJJL;
                if (xs7 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("InlineCaptionFragment -> showPreview -> currentLanguage = ");
                    LIZ.append(this.LLILLIZIL);
                    LIZ.append(", languageCode = ");
                    LIZ.append(((InlineCaptionViewModel) Ml()).gv0(this.LLILLIZIL));
                    H78.LIZ(X1D.LIZIZ(LIZ));
                    xs7.LJIILLIIL();
                    NLEModel LJJI = C79057V0z.LJJI(Jl());
                    if (C120994ox.LIZ(LJJI) != null) {
                        LJJI = NLEModel.dynamicCast(LJJI.deepClone());
                        o.LJIIIIZZ(LJJI, "this");
                        C122784rq.LIZLLL(LJJI);
                    }
                    xs7.LJIIJ(LJJI, ((InlineCaptionViewModel) Ml()).gv0(this.LLILLIZIL));
                    return;
                }
                return;
            }
            o.LJIJI("mSubtitleLayout");
            throw null;
        }
        _$_findCachedViewById(R.id.c62).setVisibility(0);
        sm();
        this.LLIZLLLIL = AnonymousClass636.LJIILLIIL(Jl(), Integer.valueOf(this.LLJJIJI), Integer.valueOf(this.LLJJIJIIJIL));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("InlineCaptionFragment -> mInitCaptionList == null: ");
        if (this.LLIZLLLIL != null) {
            z = false;
        }
        C13860gY.LIZIZ(LIZ2, z, LIZ2);
        if (this.LLIZLLLIL == null) {
            C5K1 c5k1 = this.LJLZ;
            String language = this.LLILLIZIL;
            c5k1.getClass();
            o.LJIIIZ(language, "language");
            CaptionCachesModel captionCachesModel = (CaptionCachesModel) ((HashMap) c5k1.LIZ).get(language);
            if (captionCachesModel != null && (arrayList = captionCachesModel.captionsList) != null) {
                arrayList2 = C78841Uwv.LJJJJI(arrayList);
            }
            this.LLIZLLLIL = arrayList2;
        }
        NLETrackSlot nLETrackSlot = this.LL;
        if (nLETrackSlot != null) {
            j = nLETrackSlot.getStartTime() / 1000;
        } else {
            j = 0;
        }
        this.LLJI = j;
        List<TextStickerData> list = this.LLIZLLLIL;
        if (list == null) {
            return;
        }
        om(list);
    }

    public final void qm(long j) {
        NLETrackSlot nLETrackSlot;
        EditorProContext Jl = Jl();
        NLETrack LIZLLL = C5FC.LIZLLL(C79057V0z.LJJI(Jl));
        if (LIZLLL != null) {
            Iterator<NLETrackSlot> it = LIZLLL.LJIILL().iterator();
            while (true) {
                if (it.hasNext()) {
                    nLETrackSlot = it.next();
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    long j2 = 1000;
                    if (nLETrackSlot2.getStartTime() - j2 < j && j < nLETrackSlot2.getEndTime() + j2) {
                        break;
                    }
                } else {
                    nLETrackSlot = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot3 = nLETrackSlot;
            if (nLETrackSlot3 != null) {
                C79057V0z.LJJJJL(Jl, "select_slot_event", new C127594zb(nLETrackSlot3, null, 14));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01bb, code lost:
    
        if (X.C138615cH.LIZ(X.C79057V0z.LJJI(Jl()), em()) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x027a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0241  */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.IrM, X.5yT] */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (onCreateView != null) {
            H78.LIZ("InlineCaptionFragment -> initView");
            o.LJIIIIZZ(onCreateView.findViewById(R.id.ks5), "rootView.findViewById(R.id.subtitle_play_title)");
            View findViewById = onCreateView.findViewById(R.id.g45);
            o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.ll_language)");
            this.LLD = (LinearLayout) findViewById;
            View findViewById2 = onCreateView.findViewById(R.id.m_g);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.tv_language_name)");
            this.LLFFF = (TuxTextView) findViewById2;
            View findViewById3 = onCreateView.findViewById(R.id.luq);
            o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.tux_icon_globe)");
            this.LLF = (TuxIconView) findViewById3;
            View findViewById4 = onCreateView.findViewById(R.id.lus);
            o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.tux_icon_right)");
            this.LLFF = (TuxIconView) findViewById4;
            TuxTextView tuxTextView = this.LLFFF;
            if (tuxTextView != null) {
                tuxTextView.setText(this.LLILLIZIL);
                View findViewById5 = onCreateView.findViewById(R.id.nar);
                o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.view_line)");
                this.LLFII = findViewById5;
                View findViewById6 = onCreateView.findViewById(R.id.nad);
                o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.id.view_gradient_top)");
                this.LLFZ = findViewById6;
                View findViewById7 = onCreateView.findViewById(R.id.nac);
                o.LJIIIIZZ(findViewById7, "rootView.findViewById(R.id.view_gradient_bottom)");
                this.LLI = findViewById7;
                View findViewById8 = onCreateView.findViewById(R.id.ecn);
                o.LJIIIIZZ(findViewById8, "rootView.findViewById(R.id.icon_subtitle_edit)");
                this.LLIFFJFJJ = (TuxIconView) findViewById8;
                View findViewById9 = onCreateView.findViewById(R.id.eco);
                o.LJIIIIZZ(findViewById9, "rootView.findViewById(R.….icon_subtitle_type_font)");
                this.LLII = (TuxIconView) findViewById9;
                View findViewById10 = onCreateView.findViewById(R.id.ecm);
                o.LJIIIIZZ(findViewById10, "rootView.findViewById(R.id.icon_subtitle_delete)");
                this.LLIIII = (TuxIconView) findViewById10;
                IDlS62S0100000_2 iDlS62S0100000_2 = new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 32);
                this.LLILL = iDlS62S0100000_2;
                TuxIconView tuxIconView = this.LLIIII;
                if (tuxIconView != null) {
                    C16880lQ.LJJJ(tuxIconView, iDlS62S0100000_2);
                    TuxIconView tuxIconView2 = this.LLIFFJFJJ;
                    if (tuxIconView2 != null) {
                        IDlS62S0100000_2 iDlS62S0100000_22 = this.LLILL;
                        if (iDlS62S0100000_22 != null) {
                            C16880lQ.LJJJ(tuxIconView2, iDlS62S0100000_22);
                            TuxIconView tuxIconView3 = this.LLII;
                            if (tuxIconView3 != null) {
                                IDlS62S0100000_2 iDlS62S0100000_23 = this.LLILL;
                                if (iDlS62S0100000_23 != null) {
                                    C16880lQ.LJJJ(tuxIconView3, iDlS62S0100000_23);
                                    LinearLayout linearLayout = this.LLD;
                                    if (linearLayout != null) {
                                        IDlS62S0100000_2 iDlS62S0100000_24 = this.LLILL;
                                        if (iDlS62S0100000_24 != null) {
                                            C16880lQ.LJIIZILJ(linearLayout, iDlS62S0100000_24);
                                            View findViewById11 = onCreateView.findViewById(R.id.krv);
                                            o.LJIIIIZZ(findViewById11, "rootView.findViewById(R.id.subtitle_content)");
                                            this.LLIIIILZ = (FrameLayout) findViewById11;
                                            View findViewById12 = onCreateView.findViewById(R.id.g82);
                                            o.LJIIIIZZ(findViewById12, "rootView.findViewById(R.id.loading_area)");
                                            this.LLIIIZ = (LinearLayout) findViewById12;
                                            View findViewById13 = onCreateView.findViewById(R.id.g8u);
                                            o.LJIIIIZZ(findViewById13, "rootView.findViewById(R.id.loading_progress)");
                                            this.LLIIJI = (TuxTextView) findViewById13;
                                            View findViewById14 = onCreateView.findViewById(R.id.g8j);
                                            o.LJIIIIZZ(findViewById14, "rootView.findViewById(R.id.loading_hint)");
                                            this.LLIIJLIL = (TuxTextView) findViewById14;
                                            View findViewById15 = onCreateView.findViewById(R.id.g8y);
                                            o.LJIIIIZZ(findViewById15, "rootView.findViewById(R.id.loading_status)");
                                            this.LLIILZL = (C223338pd) findViewById15;
                                            LinearLayout linearLayout2 = this.LLIIIZ;
                                            if (linearLayout2 != null) {
                                                View findViewById16 = linearLayout2.findViewById(R.id.b3r);
                                                o.LJIIIIZZ(findViewById16, "mLoadingArea.findViewById(R.id.cancel_btn)");
                                                this.LLIIL = (TuxTextView) findViewById16;
                                                LinearLayout linearLayout3 = this.LLIIIZ;
                                                if (linearLayout3 != null) {
                                                    linearLayout3.setVisibility(0);
                                                    LayoutInflater LLZIL = C16880lQ.LLZIL(mo49getActivity());
                                                    LinearLayout linearLayout4 = this.LLIIIZ;
                                                    if (linearLayout4 != null) {
                                                        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.cpk, linearLayout4, false);
                                                        o.LJIIIIZZ(LLLLIILL, "from(activity).inflate(R…ail, mLoadingArea, false)");
                                                        this.LLIIZ = LLLLIILL;
                                                        LayoutInflater LLZIL2 = C16880lQ.LLZIL(mo49getActivity());
                                                        LinearLayout linearLayout5 = this.LLIIIZ;
                                                        if (linearLayout5 != null) {
                                                            View LLLLIILL2 = C16880lQ.LLLLIILL(LLZIL2, R.layout.cpj, linearLayout5, false);
                                                            o.LJIIIIZZ(LLLLIILL2, "from(activity).inflate(R…pty, mLoadingArea, false)");
                                                            this.LLIL = LLLLIILL2;
                                                            if (C58B.LIZ()) {
                                                                TuxTextView tuxTextView2 = this.LLIIL;
                                                                if (tuxTextView2 != null) {
                                                                    tuxTextView2.setBackgroundResource(R.drawable.a21);
                                                                    View view = this.LLIIZ;
                                                                    if (view != null) {
                                                                        view.findViewById(R.id.aym).setBackgroundResource(R.drawable.a21);
                                                                        View view2 = this.LLIIZ;
                                                                        if (view2 != null) {
                                                                            view2.findViewById(R.id.krz).setBackgroundResource(R.drawable.a21);
                                                                            View view3 = this.LLIL;
                                                                            if (view3 != null) {
                                                                                view3.findViewById(R.id.b3n).setBackgroundResource(R.drawable.a21);
                                                                            } else {
                                                                                o.LJIJI("mExitView");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("mRetryView");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("mRetryView");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("mLoadingCancelBtn");
                                                                    throw null;
                                                                }
                                                            }
                                                            View findViewById17 = onCreateView.findViewById(R.id.ks4);
                                                            o.LJIIIIZZ(findViewById17, "rootView.findViewById(R.id.subtitle_play_layout)");
                                                            LinearLayout linearLayout6 = (LinearLayout) findViewById17;
                                                            this.LLIILII = linearLayout6;
                                                            linearLayout6.setVisibility(8);
                                                            View findViewById18 = onCreateView.findViewById(R.id.e5d);
                                                            o.LJIIIIZZ(findViewById18, "rootView.findViewById(R.id.highlight_area)");
                                                            this.LLIIIJ = findViewById18;
                                                            View findViewById19 = onCreateView.findViewById(R.id.isn);
                                                            o.LJIIIIZZ(findViewById19, "rootView.findViewById(R.id.recycler_view)");
                                                            this.LLIIIL = (C161806Wq) findViewById19;
                                                            this.LLILIL = new EditCaptionScene.HighLightLayoutManager(mo49getActivity());
                                                            C69W c69w = new C69W(new ArrayList());
                                                            this.LLILII = c69w;
                                                            c69w.LJLJJL = new C69Z() { // from class: X.5yU
                                                                @Override // X.C69Z
                                                                public final void LIZ(int i, int i2) {
                                                                    StringBuilder LIZ = X1D.LIZ();
                                                                    LIZ.append("InlineCaptionFragment -> adapterPos = ");
                                                                    LIZ.append(i);
                                                                    LIZ.append(", selectionIndex = ");
                                                                    LIZ.append(i2);
                                                                    H78.LIZ(X1D.LIZIZ(LIZ));
                                                                    InlineCaptionFragment.this.vm(i - 1, i2, "click_subtitle");
                                                                }
                                                            };
                                                            C161806Wq c161806Wq = this.LLIIIL;
                                                            if (c161806Wq != null) {
                                                                EditCaptionScene.HighLightLayoutManager highLightLayoutManager = this.LLILIL;
                                                                if (highLightLayoutManager != null) {
                                                                    c161806Wq.setLayoutManager(highLightLayoutManager);
                                                                    C69W c69w2 = this.LLILII;
                                                                    if (c69w2 != null) {
                                                                        c161806Wq.setAdapter(c69w2);
                                                                        Context context = c161806Wq.getContext();
                                                                        o.LJIIIIZZ(context, "context");
                                                                        int LIZIZ = (int) C74275TDb.LIZIZ(context, 52.0f);
                                                                        Context context2 = c161806Wq.getContext();
                                                                        o.LJIIIIZZ(context2, "context");
                                                                        c161806Wq.LJII(new C152515yh(LIZIZ, (int) C74275TDb.LIZIZ(context2, 163.0f)), -1);
                                                                        AbstractC030109x itemAnimator = c161806Wq.getItemAnimator();
                                                                        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                                                                        ((AbstractC28931Bp) itemAnimator).LJI = false;
                                                                        C161806Wq c161806Wq2 = this.LLIIIL;
                                                                        if (c161806Wq2 != null) {
                                                                            c161806Wq2.LJIIJJI(new C0A6() { // from class: X.5yR
                                                                                public boolean LJLIL;
                                                                                public boolean LJLILLLLZI;

                                                                                @Override // X.C0A6
                                                                                public final void LJIILJJIL(int i, RecyclerView recyclerView) {
                                                                                    o.LJIIIZ(recyclerView, "recyclerView");
                                                                                    H78.LIZ("InlineCaptionFragment -> onScrollStateChanged");
                                                                                    if (i != 0) {
                                                                                        if (i != 1) {
                                                                                            return;
                                                                                        }
                                                                                        if (InlineCaptionFragment.this.Jl().getPlayer().isPlaying()) {
                                                                                            this.LJLIL = true;
                                                                                            InlineCaptionFragment.this.Jl().getPlayer().pause();
                                                                                        }
                                                                                        this.LJLILLLLZI = true;
                                                                                        InlineCaptionFragment inlineCaptionFragment = InlineCaptionFragment.this;
                                                                                        SafeHandler safeHandler = inlineCaptionFragment.LLILLL;
                                                                                        if (safeHandler != null) {
                                                                                            safeHandler.post((RunnableC152505yg) inlineCaptionFragment.LLJILJILJ.getValue());
                                                                                            return;
                                                                                        } else {
                                                                                            o.LJIJI("mSafeHandler");
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                    if (!this.LJLILLLLZI) {
                                                                                        return;
                                                                                    }
                                                                                    this.LJLILLLLZI = false;
                                                                                    InlineCaptionFragment inlineCaptionFragment2 = InlineCaptionFragment.this;
                                                                                    SafeHandler safeHandler2 = inlineCaptionFragment2.LLILLL;
                                                                                    if (safeHandler2 != null) {
                                                                                        safeHandler2.removeCallbacksAndMessages(inlineCaptionFragment2.LLJILJILJ.getValue());
                                                                                        InlineCaptionFragment inlineCaptionFragment3 = InlineCaptionFragment.this;
                                                                                        C69W c69w3 = inlineCaptionFragment3.LLILII;
                                                                                        if (c69w3 != null) {
                                                                                            int i2 = c69w3.LJLILLLLZI;
                                                                                            if (i2 != -1) {
                                                                                                EditCaptionScene.HighLightLayoutManager highLightLayoutManager2 = inlineCaptionFragment3.LLILIL;
                                                                                                if (highLightLayoutManager2 != null) {
                                                                                                    C161806Wq c161806Wq3 = inlineCaptionFragment3.LLIIIL;
                                                                                                    if (c161806Wq3 != null) {
                                                                                                        highLightLayoutManager2.LLIIII(c161806Wq3, new C0AC(), i2);
                                                                                                        StringBuilder LIZ = X1D.LIZ();
                                                                                                        LIZ.append("InlineCaptionFragment -> position = ");
                                                                                                        LIZ.append(i2);
                                                                                                        LIZ.append(", seekPosition = ");
                                                                                                        C69W c69w4 = InlineCaptionFragment.this.LLILII;
                                                                                                        if (c69w4 != null) {
                                                                                                            LIZ.append(((CaptionUtterance) ListProtector.get(c69w4.LJLIL, i2)).LIZIZ());
                                                                                                            H78.LIZ(X1D.LIZIZ(LIZ));
                                                                                                            InterfaceC127784zu player = InlineCaptionFragment.this.Jl().getPlayer();
                                                                                                            C69W c69w5 = InlineCaptionFragment.this.LLILII;
                                                                                                            if (c69w5 != null) {
                                                                                                                player.M9((((CaptionUtterance) ListProtector.get(c69w5.LJLIL, i2)).LIZIZ() * 1000) + 30000);
                                                                                                            } else {
                                                                                                                o.LJIJI("mSubtitleAdapter");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            o.LJIJI("mSubtitleAdapter");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        o.LJIJI("mRecyclerView");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    o.LJIJI("mHighLightLayoutManager");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            if (!this.LJLIL) {
                                                                                                return;
                                                                                            }
                                                                                            this.LJLIL = false;
                                                                                            InlineCaptionFragment.this.Jl().getPlayer().play();
                                                                                            return;
                                                                                        }
                                                                                        o.LJIJI("mSubtitleAdapter");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("mSafeHandler");
                                                                                    throw null;
                                                                                }
                                                                            });
                                                                        } else {
                                                                            o.LJIJI("mRecyclerView");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("mSubtitleAdapter");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("mHighLightLayoutManager");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("mRecyclerView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("mLoadingArea");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mLoadingArea");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mLoadingArea");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mLoadingArea");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("debounceOnClickListener");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mLanguageLayout");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("debounceOnClickListener");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mIvFont");
                                throw null;
                            }
                        } else {
                            o.LJIJI("debounceOnClickListener");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mIvEdit");
                        throw null;
                    }
                } else {
                    o.LJIJI("mIvDelete");
                    throw null;
                }
            } else {
                o.LJIJI("mTvLanguageName");
                throw null;
            }
        }
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vm(int i, int i2, String str) {
        Jl().getPlayer().pause();
        this.LLJJ = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InlineCaptionFragment -> showEditCaptionText -> showPosition = ");
        LIZ.append(i);
        H78.LIZ(X1D.LIZIZ(LIZ));
        VideoPublishEditModel em = em();
        if (em != null) {
            H8F.LJJIJIL(1, em, str, ((InlineCaptionViewModel) Ml()).gv0(this.LLILLIZIL));
        }
        C151035wJ c151035wJ = this.LLILZIL;
        if (c151035wJ != null) {
            InlineCaptionTextFragment inlineCaptionTextFragment = new InlineCaptionTextFragment(i / 2, i2, em(), str, ((InlineCaptionViewModel) Ml()).gv0(this.LLILLIZIL));
            inlineCaptionTextFragment.LJLJI = true;
            inlineCaptionTextFragment.LJLILLLLZI = false;
            c151035wJ.LIZLLL(inlineCaptionTextFragment);
        }
    }

    public InlineCaptionFragment(C5K1 mInlineCaptionCaches, C132005Ga c132005Ga, String enterFrom, boolean z, NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(mInlineCaptionCaches, "mInlineCaptionCaches");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LLJJJJJIL = new LinkedHashMap();
        this.LJLZ = mInlineCaptionCaches;
        this.LJZ = c132005Ga;
        this.LJZI = enterFrom;
        this.LJZL = z;
        this.LL = nLETrackSlot;
        this.LLILLIZIL = "";
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = new ArrayList<>();
        this.LLJILJILJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 574));
        this.LLJJIJIL = System.currentTimeMillis();
        this.LLJJJ = C221108m2.LIZIZ(C132145Go.LJLIL);
        this.LLJJJIL = C221108m2.LIZIZ(C132155Gp.LJLIL);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(15400L);
        ofFloat.addUpdateListener(new AUListenerS94S0200000_2(ofFloat, this, 1));
        this.LLJJJJ = ofFloat;
    }

    public /* synthetic */ InlineCaptionFragment(C5K1 c5k1, C132005Ga c132005Ga, String str, boolean z, int i) {
        this((i & 1) != 0 ? new C5K1() : c5k1, (i & 2) != 0 ? null : c132005Ga, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? true : z, (NLETrackSlot) null);
    }
}
