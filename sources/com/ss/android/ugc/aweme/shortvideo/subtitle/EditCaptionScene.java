package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.AbstractC030109x;
import X.AbstractC030309z;
import X.AbstractC156316Bn;
import X.AbstractC28931Bp;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.AnonymousClass668;
import X.C0A2;
import X.C0A6;
import X.C0AC;
import X.C122034qd;
import X.C133195Kp;
import X.C138615cH;
import X.C140345f4;
import X.C151555x9;
import X.C151885xg;
import X.C151915xj;
import X.C152395yV;
import X.C152535yj;
import X.C155926Aa;
import X.C155936Ab;
import X.C155956Ad;
import X.C155966Ae;
import X.C155976Af;
import X.C156016Aj;
import X.C161806Wq;
import X.C162366Yu;
import X.C163756bj;
import X.C16880lQ;
import X.C170696mv;
import X.C17N;
import X.C221108m2;
import X.C223338pd;
import X.C26227ARb;
import X.C30461Hm;
import X.C30581Hy;
import X.C40675Fxn;
import X.C42000Ge4;
import X.C44384HbQ;
import X.C47261Igj;
import X.C47919IrL;
import X.C48203Ivv;
import X.C58B;
import X.C5HC;
import X.C5K1;
import X.C5L7;
import X.C5MM;
import X.C62822Ol8;
import X.C62905OmT;
import X.C62906OmU;
import X.C65352Pkq;
import X.C69M;
import X.C69W;
import X.C69Z;
import X.C6AA;
import X.C6AL;
import X.C6AR;
import X.C6AS;
import X.C6AT;
import X.C6AY;
import X.C6AZ;
import X.C78055UkF;
import X.C78841Uwv;
import X.C78885Uxd;
import X.C81184Vtc;
import X.C82621Wbh;
import X.C82622Wbi;
import X.C82632Wbs;
import X.C82949Wgz;
import X.EnumC151655xJ;
import X.H78;
import X.H8F;
import X.InterfaceC133865Ne;
import X.InterfaceC135635Tz;
import X.InterfaceC142545ic;
import X.InterfaceC143655kP;
import X.InterfaceC143855kj;
import X.InterfaceC147865rC;
import X.InterfaceC15040iS;
import X.InterfaceC151945xm;
import X.InterfaceC152085y0;
import X.InterfaceC153045zY;
import X.InterfaceC153275zv;
import X.InterfaceC156026Ak;
import X.InterfaceC42219Ghb;
import X.InterfaceC45540Hu4;
import X.InterfaceC47920IrM;
import X.InterfaceC74236TBo;
import X.InterfaceC83564Wqu;
import X.KL2;
import X.ORZ;
import X.OSZ;
import X.SFS;
import X.TBT;
import X.UC0;
import X.UCI;
import X.WMH;
import X.X1D;
import X.XS5;
import X.XSB;
import Y.ACListenerS22S0100000_2;
import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS21S0200000_2;
import Y.AUListenerS94S0200000_2;
import Y.IDCListenerS156S0100000_2;
import Y.IDComparatorS30S0000000_2;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.streamedit.DefaultStreamEditSubPanelHelper;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditCaptionScene extends WMH implements InterfaceC156026Ak, InterfaceC135635Tz, XSB {
    public static final C156016Aj LLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLLF;
    public static final int LLLFF;
    public static final int LLLFFI;
    public static final int LLLFZ;
    public static final int LLLI;
    public static final int LLLII;
    public static final float LLLIIII;
    public final C82622Wbi LJLIL;
    public C5K1 LJLILLLLZI;
    public long LJLJI;
    public C6AL LJLJJI;
    public final C82632Wbs LJLJJL;
    public C82949Wgz LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public float LJLL;
    public final C62822Ol8 LJLLI;
    public IDlS62S0100000_2 LJLLILLLL;
    public boolean LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public HighLightLayoutManager LJLLLLLL;
    public C69W LJLZ;
    public final C82632Wbs LJZ;
    public final C82632Wbs LJZI;
    public final C82632Wbs LJZL;
    public ActivityC45651qj LL;
    public InterfaceC153045zY LLD;
    public int LLF;
    public ViewGroup LLFF;
    public C151885xg LLFFF;
    public C155956Ad LLFII;
    public MutableLiveData<C5MM> LLFZ;
    public SafeHandler LLI;
    public SafeHandler LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public boolean LLIIIILZ;
    public final ArrayList<CaptionUtterance> LLIIIJ;
    public ArrayList<CaptionUtterance> LLIIIL;
    public ArrayList<CaptionUtterance> LLIIIZ;
    public C155936Ab LLIIJI;
    public long LLIIJLIL;
    public boolean LLIIL;
    public InterfaceC45540Hu4 LLIILII;
    public final C6AS LLIILZL;
    public String LLIIZ;
    public final C82632Wbs LLIL;
    public RelativeLayout LLILII;
    public LinearLayout LLILIL;
    public TextView LLILL;
    public TextView LLILLIZIL;
    public LinearLayout LLILLJJLI;
    public C223338pd LLILLL;
    public LinearLayout LLILZ;
    public C161806Wq LLILZIL;
    public View LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public TuxIconView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public TuxTextView LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxIconView LLJJ;
    public LinearLayout LLJJI;
    public TuxTextView LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public FrameLayout LLJJJ;
    public C6AT LLJJJIL;
    public Context LLJJJJ;
    public InterfaceC152085y0 LLJJJJJIL;
    public Integer LLJJJJLIIL;
    public String LLJJL;
    public final ArrayList<LanguageDetail> LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C152395yV LLJLL;
    public final C62822Ol8 LLJLLIL;
    public Dialog LLJLLL;
    public Rect LLJZ;
    public final ValueAnimator LLJZIJLIL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.6Aj] */
    static {
        TBT tbt = new TBT(EditCaptionScene.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoEditContainerScene;", 0);
        C65352Pkq.LIZ.getClass();
        LLLF = new InterfaceC74236TBo[]{tbt, new TBT(EditCaptionScene.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new TBT(EditCaptionScene.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new TBT(EditCaptionScene.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(EditCaptionScene.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new TBT(EditCaptionScene.class, "subtitleApi", "getSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};
        LLL = new Object() { // from class: X.6Aj
        };
        int LJI = SFS.LJI(266.0d);
        LLLFF = LJI;
        int LJI2 = SFS.LJI(425.0d);
        LLLFFI = LJI2;
        int LJI3 = SFS.LJI(163.0d);
        LLLFZ = LJI3;
        LLLI = (LJI3 + LJI2) - LJI;
        LLLII = SFS.LJI(52.0d);
        LLLIIII = KL2.LIZJ(C5L7.LIZ(), 12.0f);
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
            java.lang.String r0 = "EditCaptionScene -> recognize fail, show retry"
            X.H78.LIZ(r0)
            android.app.Dialog r0 = r6.LLJLLL
            if (r0 == 0) goto L7d
            boolean r1 = r0.isShowing()
            r0 = 1
            if (r1 != r0) goto L7d
        L10:
            r5 = 0
            if (r0 == 0) goto L1c
            android.app.Dialog r0 = r6.LLJLLL
            if (r0 == 0) goto L1a
            r0.dismiss()
        L1a:
            r6.LLJLLL = r5
        L1c:
            android.widget.LinearLayout r1 = r6.LLJZIJLIL()
            r0 = 8
            r1.setVisibility(r0)
            r6.LLLII()
            r6.LLLL()
            X.Wgz r0 = r6.LJLJJLL
            java.lang.String r4 = "mRetryView"
            if (r0 != 0) goto L44
            X.Wgz r3 = new X.Wgz
            android.widget.FrameLayout r2 = r6.LLL()
            android.widget.LinearLayout r1 = r6.LLJLILLLLZIIL()
            android.view.View r0 = r6.LJLLL
            if (r0 == 0) goto L87
            r3.<init>(r2, r1, r0)
            r6.LJLJJLL = r3
        L44:
            android.view.View r1 = r6.LJLLL
            if (r1 == 0) goto L83
            r0 = 2131377180(0x7f0a3c1c, float:1.8374557E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            Y.ACListenerS22S0100000_2 r1 = new Y.ACListenerS22S0100000_2
            r0 = 32
            r1.<init>(r6, r0)
            X.C16880lQ.LJIJI(r2, r1)
            android.view.View r1 = r6.LJLLL
            if (r1 == 0) goto L7f
            r0 = 2131363718(0x7f0a0786, float:1.8347253E38)
            android.view.View r2 = r1.findViewById(r0)
            Y.ACListenerS22S0100000_2 r1 = new Y.ACListenerS22S0100000_2
            r0 = 33
            r1.<init>(r6, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            X.Wgz r1 = r6.LJLJJLL
            if (r1 == 0) goto L7c
            X.1Hm r0 = new X.1Hm
            r0.<init>()
            r1.LIZIZ(r0)
        L7c:
            return
        L7d:
            r0 = 0
            goto L10
        L7f:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L83:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L87:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.D7():void");
    }

    public final int LLJJI() {
        long j = this.LLIIJLIL;
        C155956Ad c155956Ad = this.LLFII;
        if (c155956Ad != null) {
            if (j == c155956Ad.LIZ()) {
                return -1;
            }
            C155956Ad c155956Ad2 = this.LLFII;
            if (c155956Ad2 != null) {
                this.LLIIJLIL = c155956Ad2.LIZ();
                if (LLJLLL().getAdapter() == null) {
                    return -1;
                }
                C69W c69w = this.LJLZ;
                if (c69w != null) {
                    ArrayList<CaptionUtterance> arrayList = c69w.LJLIL;
                    Iterator<CaptionUtterance> it = arrayList.iterator();
                    while (it.hasNext()) {
                        CaptionUtterance next = it.next();
                        if (((int) next.LIZIZ()) != 0 || ((int) next.LIZ()) != this.LLF) {
                            long LIZIZ = next.LIZIZ();
                            long j2 = this.LLIIJLIL;
                            if (LIZIZ <= j2 && j2 < next.LIZ()) {
                                return arrayList.indexOf(next);
                            }
                        }
                    }
                    return arrayList.size() - 1;
                }
                o.LJIJI("mSubtitleAdapter");
                throw null;
            }
            o.LJIJI("mCurrentPositionSource");
            throw null;
        }
        o.LJIJI("mCurrentPositionSource");
        throw null;
    }

    public final String LLJJIII() {
        LanguageDetail languageDetail;
        String str;
        ArrayList<LanguageDetail> arrayList = this.LLJJLIIIJLLLLLLLZ;
        if (arrayList != null) {
            Iterator<LanguageDetail> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    languageDetail = it.next();
                    if (o.LJ(languageDetail.localName, this.LLJJL)) {
                        break;
                    }
                } else {
                    languageDetail = null;
                    break;
                }
            }
            LanguageDetail languageDetail2 = languageDetail;
            if (languageDetail2 != null && (str = languageDetail2.code) != null) {
                return str;
            }
        }
        return "";
    }

    public final int LLJJIJI() {
        ActivityC45651qj activityC45651qj = this.LL;
        if (activityC45651qj != null) {
            return (int) KL2.LIZJ(activityC45651qj, 52.0f);
        }
        o.LJIJI("mActivity");
        throw null;
    }

    public final int LLJJIJIIJIL() {
        int LIZLLL = ((BaseScreenAdaptScene) this.LJLJJL.LIZ(this, LLLF[0])).LLLFF().LIZLLL();
        ActivityC45651qj activityC45651qj = this.LL;
        if (activityC45651qj != null) {
            int LIZIZ = C81184Vtc.LIZIZ(activityC45651qj) - LLJJIJI();
            int i = ((C155976Af) this.LLIIII.getValue()).LIZ.getInt("control_view_height", -1);
            int i2 = LLLFFI;
            if (i != i2) {
                i2 = LLLFF;
            }
            int i3 = LIZIZ - i2;
            ActivityC45651qj activityC45651qj2 = this.LL;
            if (activityC45651qj2 != null) {
                return ((i3 - C81184Vtc.LJFF(activityC45651qj2)) - LIZLLL) - C151885xg.LJZI;
            }
            o.LJIJI("mActivity");
            throw null;
        }
        o.LJIJI("mActivity");
        throw null;
    }

    public final LinearLayout LLJJIJIL() {
        LinearLayout linearLayout = this.LLILIL;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("mContentLayout");
        throw null;
    }

    public final RelativeLayout LLJJJ() {
        RelativeLayout relativeLayout = this.LLILII;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        o.LJIJI("mEffectTitleLayout");
        throw null;
    }

    public final TuxIconView LLJJJIL() {
        TuxIconView tuxIconView = this.LLJILLL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("mIvDelete");
        throw null;
    }

    public final TuxIconView LLJJJJ() {
        TuxIconView tuxIconView = this.LLJ;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("mIvEdit");
        throw null;
    }

    public final TuxIconView LLJJL() {
        TuxIconView tuxIconView = this.LLJJ;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("mIvFont");
        throw null;
    }

    public final View LLJJLIIIJLLLLLLLZ() {
        View view = this.LLJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("mIvPlay");
        throw null;
    }

    public final LinearLayout LLJLIL() {
        LinearLayout linearLayout = this.LLJJI;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("mLanguageLayout");
        throw null;
    }

    public final LinearLayout LLJLILLLLZIIL() {
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("mLoadingArea");
        throw null;
    }

    public final C223338pd LLJLL() {
        C223338pd c223338pd = this.LLILLL;
        if (c223338pd != null) {
            return c223338pd;
        }
        o.LJIJI("mLoadingStatusView");
        throw null;
    }

    public final VideoPublishEditModel LLJLLIL() {
        return (VideoPublishEditModel) this.LJZI.LIZ(this, LLLF[3]);
    }

    public final C161806Wq LLJLLL() {
        C161806Wq c161806Wq = this.LLILZIL;
        if (c161806Wq != null) {
            return c161806Wq;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    public final LinearLayout LLJZIJLIL() {
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("mSubtitleLayout");
        throw null;
    }

    public final FrameLayout LLL() {
        FrameLayout frameLayout = this.LLJJJ;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("mSubtitlePlayContent");
        throw null;
    }

    public final ConstraintLayout LLLF() {
        ConstraintLayout constraintLayout = this.LLJILJILJ;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        o.LJIJI("mSubtitlePlayTitle");
        throw null;
    }

    public final TuxTextView LLLFF() {
        TuxTextView tuxTextView = this.LLJJIII;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("mTvLanguageName");
        throw null;
    }

    public final InterfaceC143855kj LLLFFI() {
        return (InterfaceC143855kj) this.LLIL.LIZ(this, LLLF[5]);
    }

    public final void LLLFZ() {
        C69W c69w = this.LJLZ;
        if (c69w != null) {
            int i = c69w.LJLILLLLZI;
            int i2 = -1;
            if (i != -1) {
                CaptionUtterance captionUtterance = (CaptionUtterance) ORZ.LJLLLLLL(i, c69w.LJLIL);
                if (captionUtterance != null) {
                    i2 = captionUtterance.LIZLLL().length();
                }
                LLJJ(i, i2, "click_adjust_icon");
                return;
            }
            return;
        }
        o.LJIJI("mSubtitleAdapter");
        throw null;
    }

    public final void LLLII() {
        SafeHandler safeHandler = this.LLI;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            this.LLJZIJLIL.cancel();
            SafeHandler safeHandler2 = this.LLIFFJFJJ;
            if (safeHandler2 != null) {
                safeHandler2.removeCallbacksAndMessages(null);
                LLJLL().setVisibility(8);
                LLJLL().LIZJ();
                LLJLILLLLZIIL().setVisibility(8);
                return;
            }
            o.LJIJI("mTipsHandler");
            throw null;
        }
        o.LJIJI("mSafeHandler");
        throw null;
    }

    public final boolean LLLIILIL() {
        int intValue;
        Integer num = this.LLJJJJLIIL;
        if (num != null && (intValue = num.intValue()) >= 0) {
            if (intValue != 0) {
                return true;
            }
            return false;
        }
        VideoPublishEditModel LLJLLIL = LLJLLIL();
        o.LJIIIZ(LLJLLIL, "<this>");
        if ((C44384HbQ.LLIFFJFJJ(LLJLLIL) == 0 || C44384HbQ.LLIFFJFJJ(LLJLLIL) == 1) && (this.LLIIIL != null || LLJLLIL().captionStruct != null)) {
            return false;
        }
        if (!C44384HbQ.LLJILJIL(LLJLLIL()) || (LLJLLIL().creativeModel.inlineCaptionModel == null && this.LJLILLLLZI.LIZJ(this.LLJJL) == null)) {
            return true;
        }
        return false;
    }

    public final void LLLILZ() {
        MutableLiveData<C5MM> mutableLiveData = this.LLFZ;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(C5MM.LIZJ());
            LLJJLIIIJLLLLLLLZ().setVisibility(0);
        } else {
            o.LJIJI("mPreviewControlOpLiveData");
            throw null;
        }
    }

    public final void LLLILZLLLI() {
        MutableLiveData<C5MM> mutableLiveData = this.LLFZ;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(C5MM.LIZ());
            LLJJLIIIJLLLLLLLZ().setVisibility(8);
        } else {
            o.LJIJI("mPreviewControlOpLiveData");
            throw null;
        }
    }

    public final void LLLIZZ() {
        if (this.LLJLIL) {
            ArrayList<CaptionUtterance> arrayList = this.LLIIIZ;
            if (arrayList == null && !o.LJ(this.LLIIIJ, arrayList)) {
                ActivityC45651qj activityC45651qj = this.LL;
                if (activityC45651qj != null) {
                    C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
                    c26227ARb.LIZ(R.string.ch6);
                    UC0.LIZJ(c26227ARb, new AqS168S0100000_2(this, 418));
                    c26227ARb.LJI().LIZLLL();
                    return;
                }
                o.LJIJI("mActivity");
                throw null;
            }
            ArrayList<CaptionUtterance> arrayList2 = this.LLIIIZ;
            if (arrayList2 != null && !o.LJ(this.LLIIIJ, arrayList2)) {
                ActivityC45651qj activityC45651qj2 = this.LL;
                if (activityC45651qj2 != null) {
                    C26227ARb c26227ARb2 = new C26227ARb(activityC45651qj2);
                    c26227ARb2.LIZ(R.string.ch3);
                    UC0.LIZJ(c26227ARb2, new AqS168S0100000_2(this, 420));
                    c26227ARb2.LJI().LIZLLL();
                    return;
                }
                o.LJIJI("mActivity");
                throw null;
            }
            cancel();
            return;
        }
        if (!o.LJ(this.LLIIIJ, this.LLIIIZ)) {
            ActivityC45651qj activityC45651qj3 = this.LL;
            if (activityC45651qj3 != null) {
                C62905OmT c62905OmT = new C62905OmT(activityC45651qj3);
                c62905OmT.LIZ(R.string.bxe);
                c62905OmT.LJII(R.string.cg_, null);
                c62905OmT.LJIIJ(R.string.bwu, new IDCListenerS156S0100000_2(this, 12));
                new C62906OmU(c62905OmT).LIZLLL();
                return;
            }
            o.LJIJI("mActivity");
            throw null;
        }
        cancel();
    }

    public final void LLLJ() {
        ActivityC45651qj activityC45651qj = this.LL;
        if (activityC45651qj != null) {
            C62905OmT c62905OmT = new C62905OmT(activityC45651qj);
            c62905OmT.LIZ(R.string.bx6);
            c62905OmT.LJII(R.string.byr, new IDCListenerS156S0100000_2(this, 9));
            c62905OmT.LJIIJ(R.string.bx8, null);
            this.LLJLLL = new C62906OmU(c62905OmT).LJ();
            return;
        }
        o.LJIJI("mActivity");
        throw null;
    }

    public final void LLLL() {
        if (this.LLJL && C152535yj.LIZIZ() != null) {
            LLLF().setVisibility(0);
            LLJLIL().setVisibility(0);
            TuxTextView tuxTextView = this.LLJJIJIL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
                LLJJJIL().setVisibility(8);
                LLJJJJ().setVisibility(8);
                LLJJL().setVisibility(8);
                LLJJJ().setVisibility(0);
                return;
            }
            o.LJIJI("mTvSubtitle");
            throw null;
        }
        LLLF().setVisibility(4);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJZ.LIZ(this, LLLF[1]);
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
            java.lang.String r0 = "EditCaptionScene -> showExitView"
            X.H78.LIZ(r0)
            android.app.Dialog r0 = r6.LLJLLL
            if (r0 == 0) goto L5f
            boolean r1 = r0.isShowing()
            r0 = 1
            if (r1 != r0) goto L5f
        L10:
            r5 = 0
            if (r0 == 0) goto L1c
            android.app.Dialog r0 = r6.LLJLLL
            if (r0 == 0) goto L1a
            r0.dismiss()
        L1a:
            r6.LLJLLL = r5
        L1c:
            r6.LLLII()
            android.widget.LinearLayout r1 = r6.LLJZIJLIL()
            r0 = 8
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r0 = r6.LLI
            if (r0 == 0) goto L69
            r0.removeCallbacksAndMessages(r5)
            X.Wgz r4 = new X.Wgz
            android.widget.FrameLayout r3 = r6.LLL()
            android.widget.LinearLayout r2 = r6.LLJLILLLLZIIL()
            android.view.View r1 = r6.LJLLLL
            java.lang.String r0 = "mExitView"
            if (r1 == 0) goto L65
            r4.<init>(r3, r2, r1)
            android.view.View r1 = r6.LJLLLL
            if (r1 == 0) goto L61
            r0 = 2131363904(0x7f0a0840, float:1.834763E38)
            android.view.View r2 = r1.findViewById(r0)
            Y.ACListenerS37S0200000_2 r1 = new Y.ACListenerS37S0200000_2
            r0 = 2
            r1.<init>(r4, r6, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            X.1Hm r0 = new X.1Hm
            r0.<init>()
            r4.LIZIZ(r0)
            return
        L5f:
            r0 = 0
            goto L10
        L61:
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L65:
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        L69:
            java.lang.String r0 = "mSafeHandler"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.qb():void");
    }

    public final void LLJILJILJ() {
        XS5 Fr = LLLFFI().Fr();
        if (Fr != null) {
            Fr.LIZ();
        }
        SafeHandler safeHandler = this.LLI;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            this.LLJZIJLIL.cancel();
            SafeHandler safeHandler2 = this.LLIFFJFJJ;
            if (safeHandler2 != null) {
                safeHandler2.removeCallbacksAndMessages(null);
                LLLFFI().So(false);
                LLJILJIL(null);
                LLJLLIL().creativeModel.inlineCaptionModel = null;
                LLJLLIL().captionStruct = null;
                this.LLJLL.LIZIZ(this.LLJJL);
                LLLFFI().xc();
                getEditPreviewApi().U2(true, false, true);
                return;
            }
            o.LJIJI("mTipsHandler");
            throw null;
        }
        o.LJIJI("mSafeHandler");
        throw null;
    }

    public final boolean LLLIIIL() {
        if (C152535yj.LIZIZ() != null) {
            Context context = this.LLJJJJ;
            if (context != null) {
                if (C48203Ivv.LJ(context)) {
                    if (C133195Kp.LIZ()) {
                        if ((!C44384HbQ.LJLJJL(LLJLLIL()) || LLJLLIL().voiceVolume <= 0.0f) && !LLJLLIL().hadRecordWithVolume() && !C138615cH.LIZ(null, LLJLLIL())) {
                            return true;
                        }
                        return false;
                    }
                    if (!C44384HbQ.LJLJJL(LLJLLIL()) && !LLJLLIL().hasRecord()) {
                        return true;
                    }
                    if (!LLJLLIL().hasRecord() && LLJLLIL().voiceVolume == 0.0f) {
                        return true;
                    }
                    return false;
                }
            } else {
                o.LJIJI("context");
                throw null;
            }
        }
        return true;
    }

    public final void cancel() {
        ArrayList<CaptionUtterance> LJIILIIL;
        XS5 Fr = LLLFFI().Fr();
        if (Fr != null) {
            Fr.LIZ();
        }
        SafeHandler safeHandler = this.LLI;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            this.LLJZIJLIL.cancel();
            SafeHandler safeHandler2 = this.LLIFFJFJJ;
            if (safeHandler2 != null) {
                safeHandler2.removeCallbacksAndMessages(null);
                LLLFFI().So(false);
                if (C42000Ge4.LJIILIIL(LLJLLIL())) {
                    LJIILIIL = this.LLIIIZ;
                } else {
                    LJIILIIL = C78841Uwv.LJIILIIL(LLJLLIL());
                }
                LLJILJIL(LJIILIIL);
                return;
            }
            o.LJIJI("mTipsHandler");
            throw null;
        }
        o.LJIJI("mSafeHandler");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        XS5 Fr = LLLFFI().Fr();
        if (Fr != null) {
            Fr.LIZ();
        }
        C6AT c6at = this.LLJJJIL;
        if (c6at != null) {
            c6at.hide();
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        SafeHandler safeHandler = this.LLI;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            this.LLJZIJLIL.cancel();
            SafeHandler safeHandler2 = this.LLIFFJFJJ;
            if (safeHandler2 != null) {
                safeHandler2.removeCallbacksAndMessages(null);
                if (this.LLIIJI != null) {
                    ActivityC45651qj activityC45651qj = this.LL;
                    if (activityC45651qj != null) {
                        if (C47919IrL.LIZJ != null) {
                            try {
                                C16880lQ.LJJLIIIJL(C16880lQ.LLLLL(activityC45651qj), C47919IrL.LIZJ);
                            } catch (Exception unused) {
                            }
                        }
                        this.LLIIJI = null;
                    } else {
                        o.LJIJI("mActivity");
                        throw null;
                    }
                }
                LLJJLIIIJLLLLLLLZ().setVisibility(8);
                LLJLLL().LJLJJI();
                return;
            }
            o.LJIJI("mTipsHandler");
            throw null;
        }
        o.LJIJI("mSafeHandler");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L34;
     */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r5 = this;
            super.onResume()
            java.lang.String r0 = "EditCaptionScene -> onResume"
            X.H78.LIZ(r0)
            boolean r0 = r5.LLJLILLLLZIIL
            if (r0 != 0) goto Ld
            return
        Ld:
            X.V8O r1 = r5.getScope()
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "needRecognize"
            java.lang.Object r0 = r1.LIZ(r0)
            X.5qO r0 = (X.C147365qO) r0
            if (r0 == 0) goto Ldc
            int r0 = r0.LJLIL
        L22:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.LLJJJJLIIL = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLIL()
            boolean r0 = X.C44384HbQ.LJJIIJ(r0)
            if (r0 == 0) goto L74
            boolean r0 = r5.LLLIIIL()
            r5.LLLI(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLIL()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.InlineCaptionModel r0 = r0.inlineCaptionModel
            if (r0 == 0) goto Ld4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLJLLIL()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.InlineCaptionModel r0 = r0.inlineCaptionModel
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.selectLanguage
            if (r0 != 0) goto L53
        L51:
            java.lang.String r0 = ""
        L53:
            r5.LLJJL = r0
            int r0 = r0.length()
            r4 = 0
            if (r0 <= 0) goto L7a
            com.bytedance.tux.input.TuxTextView r1 = r5.LLLFF()
            java.lang.String r0 = r5.LLJJL
            r1.setText(r0)
            X.6AL r0 = r5.LJLJJI
            if (r0 == 0) goto L74
            java.lang.String r1 = r5.LLJJIII()
            X.6AA r0 = r0.LIZJ
            r0.getClass()
            r0.LJLLL = r1
        L74:
            X.6Ab r0 = r5.LLIIJI
            X.C47919IrL.LIZJ(r0)
            return
        L7a:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            java.lang.String r3 = r0.LJIILJJIL()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail> r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto La7
            java.util.Iterator r2 = r0.iterator()
        L8a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail r0 = (com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail) r0
            java.lang.String r0 = r0.localName
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L8a
            if (r1 == 0) goto La7
            r5.LLJJL = r3
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lb9
        La7:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail> r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail r0 = (com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail) r0
            if (r0 == 0) goto Lb7
            java.lang.String r0 = r0.localName
            if (r0 != 0) goto Ld2
        Lb7:
            r5.LLJJL = r3
        Lb9:
            com.bytedance.tux.input.TuxTextView r1 = r5.LLLFF()
            java.lang.String r0 = r5.LLJJL
            r1.setText(r0)
            X.6AL r0 = r5.LJLJJI
            if (r0 == 0) goto L74
            java.lang.String r1 = r5.LLJJIII()
            X.6AA r0 = r0.LIZJ
            r0.getClass()
            r0.LJLLL = r1
            goto L74
        Ld2:
            r3 = r0
            goto Lb7
        Ld4:
            X.5yV r0 = r5.LLJLL
            java.lang.String r0 = r0.LIZ()
            goto L53
        Ldc:
            r0 = -1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene.onResume():void");
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    /* loaded from: classes14.dex */
    public static final class HighLightLayoutManager extends LinearLayoutManager {
        public final Context LLIIIJ;
        public float LLIIIL;

        public HighLightLayoutManager(ActivityC45651qj activityC45651qj) {
            super(1, false);
            this.LLIIIJ = activityC45651qj;
            this.LLIIIL = 0.004f;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            C78055UkF c78055UkF = new C78055UkF(this, context);
            c78055UkF.LIZ = i;
            LLIIIILZ(c78055UkF);
        }
    }

    @Override // X.InterfaceC156026Ak
    public final void LJJIZ(int i) {
        InterfaceC153045zY value;
        final InterfaceC153045zY interfaceC153045zY = this.LLD;
        if (interfaceC153045zY != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                LJJI.LJIIJJI.V8().LJIL(this.LLF * 1000);
                InterfaceC153045zY interfaceC153045zY2 = this.LLD;
                if (interfaceC153045zY2 != null) {
                    interfaceC153045zY2.LLJILJIL(true);
                }
                interfaceC153045zY.LLJJJJJIL(i, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC133865Ne() { // from class: X.6AW
                    @Override // X.InterfaceC133865Ne
                    public final void LIZ(int i2) {
                        EditCaptionScene editCaptionScene = EditCaptionScene.this;
                        SafeHandler safeHandler = editCaptionScene.LLI;
                        if (safeHandler != null) {
                            safeHandler.post(new ARunnableS21S0200000_2(interfaceC153045zY, editCaptionScene, 14));
                        } else {
                            o.LJIJI("mSafeHandler");
                            throw null;
                        }
                    }
                });
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Rect rect = this.LLJZ;
        if (rect != null && ((rect.left > 0 || rect.top > 0 || rect.right > 0 || rect.bottom > 0) && (value = getEditPreviewApi().Kh().getValue()) != null)) {
            value.LIZ(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (LLJLLL().getAdapter() != null) {
            C69W c69w = this.LJLZ;
            if (c69w != null) {
                ArrayList<CaptionUtterance> arrayList = c69w.LJLIL;
                int size = arrayList.size() - 1;
                Iterator<CaptionUtterance> it = arrayList.iterator();
                while (it.hasNext()) {
                    CaptionUtterance next = it.next();
                    if (((int) next.LIZIZ()) != 0 || ((int) next.LIZ()) != this.LLF) {
                        long j = i;
                        if (next.LIZIZ() <= j && j <= next.LIZ()) {
                            size = arrayList.indexOf(next);
                        }
                    }
                }
                if (size >= 0) {
                    C69W c69w2 = this.LJLZ;
                    if (c69w2 != null) {
                        if (!TextUtils.isEmpty(((CaptionUtterance) ListProtector.get(c69w2.LJLIL, size)).LIZLLL()) || size == 0) {
                            HighLightLayoutManager highLightLayoutManager = this.LJLLLLLL;
                            if (highLightLayoutManager != null) {
                                ActivityC45651qj activityC45651qj = this.LL;
                                if (activityC45651qj != null) {
                                    highLightLayoutManager.LJFF(size, (int) KL2.LIZJ(activityC45651qj, 52.0f));
                                    C69W c69w3 = this.LJLZ;
                                    if (c69w3 != null) {
                                        c69w3.LJLLLLLL(size);
                                    } else {
                                        o.LJIJI("mSubtitleAdapter");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mActivity");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mHighLightLayoutManager");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("mSubtitleAdapter");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("mSubtitleAdapter");
                throw null;
            }
        }
        if (!this.LLIIL) {
            LLLILZ();
        }
    }

    public final void LLJILJIL(List<CaptionUtterance> list) {
        LLLFFI().X30(list);
    }

    public final void LLLI(boolean z) {
        float f;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        LLLFF().setAlpha(f);
        TuxIconView tuxIconView = this.LLJJIJI;
        if (tuxIconView != null) {
            tuxIconView.setAlpha(f);
            TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
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

    public final void LLLIIIIL(List<CaptionUtterance> list) {
        int i = 0;
        LLJZIJLIL().setVisibility(0);
        LLLF().setVisibility(0);
        LLJJJJ().getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() { // from class: X.6AO
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                int left = EditCaptionScene.this.LLJJJJ().getLeft() - EditCaptionScene.this.LLJLIL().getRight();
                float f = left;
                C156016Aj c156016Aj = EditCaptionScene.LLL;
                c156016Aj.getClass();
                float f2 = EditCaptionScene.LLLIIII;
                if (f < f2) {
                    TuxTextView LLLFF2 = EditCaptionScene.this.LLLFF();
                    int width = EditCaptionScene.this.LLLFF().getWidth();
                    float abs = Math.abs(left);
                    c156016Aj.getClass();
                    LLLFF2.setWidth(width - ((int) (abs + f2)));
                    EditCaptionScene.this.LLLFF().setSingleLine();
                    EditCaptionScene.this.LLLFF().setEllipsize(TextUtils.TruncateAt.END);
                    TuxTextView LLLFF3 = EditCaptionScene.this.LLLFF();
                    int right = EditCaptionScene.this.LLJLIL().getRight();
                    TuxIconView tuxIconView = EditCaptionScene.this.LLJJIJIIJIL;
                    if (tuxIconView != null) {
                        LLLFF3.setRight(right - tuxIconView.getWidth());
                        return;
                    } else {
                        o.LJIJI("mIconRight");
                        throw null;
                    }
                }
                TuxTextView LLLFF4 = EditCaptionScene.this.LLLFF();
                ViewGroup.LayoutParams layoutParams = EditCaptionScene.this.LLLFF().getLayoutParams();
                layoutParams.width = -2;
                LLLFF4.setLayoutParams(layoutParams);
            }
        });
        if (!this.LLJL && !this.LLJLIL) {
            LLJLIL().setVisibility(8);
            TuxTextView tuxTextView = this.LLJJIJIL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
                LLJJJJ().setVisibility(0);
                LLJJJIL().setVisibility(8);
                LLJJL().setVisibility(8);
            } else {
                o.LJIJI("mTvSubtitle");
                throw null;
            }
        } else {
            if (C152535yj.LIZIZ() != null) {
                LLJLIL().setVisibility(0);
            } else {
                LLJLIL().setVisibility(8);
            }
            if (this.LLJL && !this.LLJLIL) {
                TuxTextView tuxTextView2 = this.LLJJIJIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                    LLJJJJ().setVisibility(0);
                    LLJJJIL().setVisibility(8);
                    LLJJL().setVisibility(8);
                } else {
                    o.LJIJI("mTvSubtitle");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView3 = this.LLJJIJIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setVisibility(8);
                    LLJJJJ().setVisibility(0);
                    LLJJL().setVisibility(0);
                    LLJJJIL().setVisibility(0);
                } else {
                    o.LJIJI("mTvSubtitle");
                    throw null;
                }
            }
        }
        FrameLayout LLL2 = LLL();
        View view = this.LJLLL;
        if (view != null) {
            C16880lQ.LJLLLL(view, LLL2);
            FrameLayout LLL3 = LLL();
            View view2 = this.LJLLLL;
            if (view2 != null) {
                C16880lQ.LJLLLL(view2, LLL3);
                new C69M(C78841Uwv.LJJJJIZL(list));
                LLJZIJLIL().setVisibility(0);
                LLJZIJLIL().setAlpha(1.0f);
                TextView textView = this.LLILLIZIL;
                if (textView != null) {
                    textView.setVisibility(0);
                    TextView textView2 = this.LLILL;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        if (list.isEmpty()) {
                            return;
                        }
                        this.LLIIIJ.clear();
                        Iterator<CaptionUtterance> it = list.iterator();
                        while (it.hasNext()) {
                            this.LLIIIJ.add(new CaptionUtterance(it.next()));
                        }
                        ArrayList LJIILIIL = C30581Hy.LJIILIIL(this.LLF, list);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("EditCaptionScene -> initSubtitleLayout: captionWithGapList.size = ");
                        LIZ.append(LJIILIIL.size());
                        H78.LIZ(X1D.LIZIZ(LIZ));
                        C69W c69w = this.LJLZ;
                        if (c69w != null) {
                            c69w.setData(LJIILIIL);
                            int LLJJI = LLJJI();
                            if (LLJJI != -1) {
                                i = LLJJI;
                            }
                            HighLightLayoutManager highLightLayoutManager = this.LJLLLLLL;
                            if (highLightLayoutManager != null) {
                                highLightLayoutManager.LLIIII(LLJLLL(), new C0AC(), i);
                                InterfaceC153045zY interfaceC153045zY = this.LLD;
                                if (interfaceC153045zY != null) {
                                    interfaceC153045zY.LLJILJIL(true);
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("mHighLightLayoutManager");
                            throw null;
                        }
                        o.LJIJI("mSubtitleAdapter");
                        throw null;
                    }
                    o.LJIJI("mCancelView");
                    throw null;
                }
                o.LJIJI("mSaveView");
                throw null;
            }
            o.LJIJI("mExitView");
            throw null;
        }
        o.LJIJI("mRetryView");
        throw null;
    }

    public final void LLLJIL(boolean z) {
        int i;
        FrameLayout grabberView;
        if (z) {
            ((DefaultStreamEditSubPanelHelper) this.LLJLLIL.getValue()).LIZJ();
        } else {
            ((DefaultStreamEditSubPanelHelper) this.LLJLLIL.getValue()).LIZIZ();
        }
        H78.LIZ("EditCaptionScene -> showCaptionPreviewView");
        if (LLJJJ().getVisibility() == 4) {
            LLJJJ().setVisibility(0);
        }
        boolean z2 = this.LLJL;
        if (!z2) {
            LLLF().setVisibility(8);
        } else if (z2) {
            LLLF().setVisibility(0);
            LLJLIL().setVisibility(0);
        }
        Rect rect = null;
        if (!z) {
            TextView textView = this.LLILLIZIL;
            if (textView != null) {
                textView.setVisibility(4);
                TextView textView2 = this.LLILL;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                    LLJJLIIIJLLLLLLLZ().setVisibility(8);
                } else {
                    o.LJIJI("mCancelView");
                    throw null;
                }
            } else {
                o.LJIJI("mSaveView");
                throw null;
            }
        }
        C151885xg c151885xg = this.LLFFF;
        if (c151885xg != null && (grabberView = c151885xg.getGrabberView()) != null) {
            grabberView.setVisibility(8);
        }
        LinearLayout LLJJIJIL = LLJJIJIL();
        int i2 = ((C155976Af) this.LLIIII.getValue()).LIZ.getInt("control_view_height", -1);
        int i3 = LLLFFI;
        if (i2 == i3) {
            i = i3;
        } else {
            i = LLLFF;
        }
        ViewGroup viewGroup = this.LLFF;
        if (viewGroup != null) {
            C170696mv.LIZJ(LLJJIJIL, z, i, viewGroup, new InterfaceC15040iS() { // from class: X.5yO
                @Override // X.InterfaceC15040iS
                public final void accept(Object obj) {
                    FrameLayout grabberView2;
                    C151885xg c151885xg2 = EditCaptionScene.this.LLFFF;
                    if (c151885xg2 == null || (grabberView2 = c151885xg2.getGrabberView()) == null) {
                        return;
                    }
                    grabberView2.setVisibility(0);
                }
            });
            if (z) {
                this.LLJLILLLLZIIL = false;
                SystemClock.elapsedRealtime();
                LLJJIJIL().setVisibility(0);
                FrameLayout LLL2 = LLL();
                View view = this.LJLLL;
                if (view != null) {
                    C16880lQ.LJLLLL(view, LLL2);
                    FrameLayout LLL3 = LLL();
                    View view2 = this.LJLLLL;
                    if (view2 != null) {
                        C16880lQ.LJLLLL(view2, LLL3);
                        this.LJLL = 0.004f;
                        HighLightLayoutManager highLightLayoutManager = this.LJLLLLLL;
                        if (highLightLayoutManager != null) {
                            highLightLayoutManager.LLIIIL = 0.004f;
                            LLLILZ();
                            MutableLiveData<C5MM> mutableLiveData = this.LLFZ;
                            if (mutableLiveData != null) {
                                if (this.LLFII != null) {
                                    mutableLiveData.setValue(new C5MM(4, 0L, null));
                                    InterfaceC45540Hu4 interfaceC45540Hu4 = this.LLIILII;
                                    if (interfaceC45540Hu4 != null) {
                                        interfaceC45540Hu4.registerActivityOnKeyDownListener(this.LLIILZL);
                                        InterfaceC143655kP editPreviewApi = getEditPreviewApi();
                                        int LIZIZ = C78885Uxd.LIZIZ(true, false, false, false);
                                        int LLJJIJI = LLJJIJI();
                                        ActivityC45651qj activityC45651qj = this.LL;
                                        if (activityC45651qj != null) {
                                            int LJFF = C81184Vtc.LJFF(activityC45651qj) + LLJJIJI;
                                            if (((C155976Af) this.LLIIII.getValue()).LIZ.getInt("control_view_height", -1) != i3) {
                                                i3 = LLLFF;
                                            }
                                            int LLJJIJIIJIL = LLJJIJIIJIL();
                                            AnonymousClass668.LIZIZ().LIZ();
                                            editPreviewApi.oF(C140345f4.LIZIZ(LIZIZ, LJFF, i3, LLJJIJIIJIL, false, false, 960));
                                            this.LLIIIZ = C78841Uwv.LJIILIIL(LLJLLIL());
                                            ((DefaultStreamEditSubPanelHelper) this.LLJLLIL.getValue()).LIZ(new InterfaceC42219Ghb() { // from class: X.6AK
                                                @Override // X.InterfaceC42219Ghb
                                                public final void LIZ() {
                                                    EditCaptionScene.this.qb();
                                                }

                                                @Override // X.InterfaceC42219Ghb
                                                public final void LIZJ() {
                                                    EditCaptionScene editCaptionScene = EditCaptionScene.this;
                                                    editCaptionScene.getClass();
                                                    StringBuilder LIZ = X1D.LIZ();
                                                    LIZ.append("EditCaptionScene -> doOnVideoDownloadedWhenShowing -> needRecognize() = ");
                                                    LIZ.append(editCaptionScene.LLLIILIL());
                                                    H78.LIZ(X1D.LIZIZ(LIZ));
                                                    if (editCaptionScene.LLLIILIL()) {
                                                        H78.LIZ("EditCaptionScene -> doOnVideoDownloadedWhenShowing -> Recognize");
                                                        editCaptionScene.LLLJL(true);
                                                        editCaptionScene.LLIIIJ.clear();
                                                        NLEModel nLEModel = null;
                                                        if (!editCaptionScene.LLJL) {
                                                            editCaptionScene.LLJLLIL().captionStruct = null;
                                                        }
                                                        editCaptionScene.LLJILJIL(null);
                                                        editCaptionScene.LLJILJIL(null);
                                                        editCaptionScene.LLLILZ();
                                                        XS5 Fr = editCaptionScene.LLLFFI().Fr();
                                                        if (Fr != null) {
                                                            if (C44384HbQ.LJJIIJ(editCaptionScene.LLJLLIL())) {
                                                                StringBuilder LIZ2 = X1D.LIZ();
                                                                LIZ2.append("EditCaptionScene -> enableChooseLanguage = true, currentLanguage code = ");
                                                                LIZ2.append(editCaptionScene.LLJJIII());
                                                                H78.LIZ(X1D.LIZIZ(LIZ2));
                                                                Fr.LJIIIIZZ();
                                                                String LLJJIII = editCaptionScene.LLJJIII();
                                                                InterfaceC153045zY interfaceC153045zY = editCaptionScene.LLD;
                                                                if (interfaceC153045zY != null) {
                                                                    nLEModel = C17N.LJJ(interfaceC153045zY);
                                                                }
                                                                Fr.LJIIJ(nLEModel, LLJJIII);
                                                                return;
                                                            }
                                                            H78.LIZ("EditCaptionScene -> enableChooseLanguage = false");
                                                            InterfaceC153045zY interfaceC153045zY2 = editCaptionScene.LLD;
                                                            if (interfaceC153045zY2 != null) {
                                                                nLEModel = C17N.LJJ(interfaceC153045zY2);
                                                            }
                                                            Fr.LJIIIZ(nLEModel);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    H78.LIZ("EditCaptionScene -> doOnVideoDownloadedWhenShowing -> show captions");
                                                    editCaptionScene.LLLJL(false);
                                                    ArrayList<CaptionUtterance> arrayList = editCaptionScene.LLIIIZ;
                                                    if (arrayList == null || arrayList.isEmpty()) {
                                                        if (editCaptionScene.LLJL) {
                                                            List<CaptionUtterance> LIZJ = editCaptionScene.LJLILLLLZI.LIZJ(editCaptionScene.LLJJL);
                                                            if (LIZJ == null) {
                                                                LIZJ = C61878OQg.INSTANCE;
                                                            }
                                                            editCaptionScene.LLLIIIIL(LIZJ);
                                                        } else {
                                                            List<CaptionUtterance> list = editCaptionScene.LLIIIL;
                                                            if (list == null) {
                                                                list = C61878OQg.INSTANCE;
                                                            }
                                                            editCaptionScene.LLLIIIIL(list);
                                                        }
                                                    } else {
                                                        ArrayList<CaptionUtterance> arrayList2 = editCaptionScene.LLIIIZ;
                                                        o.LJI(arrayList2);
                                                        editCaptionScene.LLLIIIIL(arrayList2);
                                                    }
                                                    editCaptionScene.LLLILZLLLI();
                                                    editCaptionScene.LLJILJIL(editCaptionScene.LLIIIJ);
                                                }

                                                @Override // X.InterfaceC42219Ghb
                                                public final void LIZIZ(float f, boolean z3) {
                                                    EditCaptionScene editCaptionScene = EditCaptionScene.this;
                                                    if (z3) {
                                                        editCaptionScene.LLJLILLLLZIIL().setVisibility(0);
                                                        editCaptionScene.LLLF().setVisibility(8);
                                                        editCaptionScene.LLJZIJLIL().setVisibility(8);
                                                        editCaptionScene.LLJLL().setVisibility(0);
                                                        editCaptionScene.LLJLL().LIZIZ();
                                                        TextView textView3 = editCaptionScene.LLIZLLLIL;
                                                        if (textView3 != null) {
                                                            textView3.setText("");
                                                            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(editCaptionScene, 103), editCaptionScene.LLJLILLLLZIIL().findViewById(R.id.b3r));
                                                        } else {
                                                            o.LJIJI("mLoadingHint");
                                                            throw null;
                                                        }
                                                    }
                                                    TextView textView4 = editCaptionScene.LLIZ;
                                                    if (textView4 != null) {
                                                        C67981Qm9.LIZIZ(new Object[]{editCaptionScene.getString(R.string.r6l), Integer.valueOf((int) (f * 100))}, 2, "%s%d%%", "format(format, *args)", textView4);
                                                    } else {
                                                        o.LJIJI("mLoadingProgress");
                                                        throw null;
                                                    }
                                                }
                                            });
                                        } else {
                                            o.LJIJI("mActivity");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mListenableActivityRegistry");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mCurrentPositionSource");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mPreviewControlOpLiveData");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mHighLightLayoutManager");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mExitView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mRetryView");
                    throw null;
                }
            } else {
                this.LLJLILLLLZIIL = true;
                C82632Wbs c82632Wbs = this.LJZL;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLLF;
                MutableLiveData<Boolean> N4 = ((InterfaceC147865rC) c82632Wbs.LIZ(this, interfaceC74236TBoArr[4])).N4();
                Boolean bool = Boolean.FALSE;
                N4.setValue(bool);
                ((InterfaceC147865rC) this.LJZL.LIZ(this, interfaceC74236TBoArr[4])).fm0().setValue(bool);
                InterfaceC45540Hu4 interfaceC45540Hu42 = this.LLIILII;
                if (interfaceC45540Hu42 != null) {
                    interfaceC45540Hu42.unRegisterActivityOnKeyDownListener(this.LLIILZL);
                    InterfaceC143655kP editPreviewApi2 = getEditPreviewApi();
                    ActivityC45651qj activityC45651qj2 = this.LL;
                    if (activityC45651qj2 != null) {
                        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d4, activityC45651qj2);
                        int LLJJIJI2 = LLJJIJI();
                        ActivityC45651qj activityC45651qj3 = this.LL;
                        if (activityC45651qj3 != null) {
                            int LJFF2 = C81184Vtc.LJFF(activityC45651qj3) + LLJJIJI2;
                            if (((C155976Af) this.LLIIII.getValue()).LIZ.getInt("control_view_height", -1) != i3) {
                                i3 = LLLFF;
                            }
                            int LLJJIJIIJIL2 = LLJJIJIIJIL();
                            AnonymousClass668.LIZIZ().LIZ();
                            editPreviewApi2.oF(C140345f4.LIZ(LJIIIIZZ, LJFF2, i3, LLJJIJIIJIL2));
                            LLJJLIIIJLLLLLLLZ().setVisibility(8);
                        } else {
                            o.LJIJI("mActivity");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mActivity");
                        throw null;
                    }
                } else {
                    o.LJIJI("mListenableActivityRegistry");
                    throw null;
                }
            }
            InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
            if (value != null) {
                rect = value.t5();
            }
            this.LLJZ = rect;
            return;
        }
        o.LJIJI("mSubtitleView");
        throw null;
    }

    public final void LLLJL(boolean z) {
        LLLL();
        if (z) {
            Runnable runnable = new Runnable() { // from class: X.6AP
                public int LJLIL;
                public final String[] LJLILLLLZI;

                public final void LIZ() {
                    TextView textView = EditCaptionScene.this.LLIZLLLIL;
                    if (textView != null) {
                        String[] strArr = this.LJLILLLLZI;
                        int i = this.LJLIL;
                        this.LJLIL = i + 1;
                        textView.setText(strArr[i]);
                        this.LJLIL %= this.LJLILLLLZI.length;
                        SafeHandler safeHandler = EditCaptionScene.this.LLIFFJFJJ;
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
                    String[] strArr;
                    if (EditCaptionScene.this.LLJL) {
                        strArr = new String[]{EditCaptionScene.this.getString(R.string.bxb), EditCaptionScene.this.getString(R.string.bxc)};
                    } else {
                        strArr = new String[]{EditCaptionScene.this.getString(R.string.bxa, IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getCurrentI18nItem(EditCaptionScene.this.getApplicationContext()).LIZIZ()), EditCaptionScene.this.getString(R.string.bxb), EditCaptionScene.this.getString(R.string.bxc)};
                    }
                    this.LJLILLLLZI = strArr;
                }
            };
            SafeHandler safeHandler = this.LLIFFJFJJ;
            if (safeHandler != null) {
                safeHandler.post(runnable);
                this.LLJZIJLIL.start();
                LLJLILLLLZIIL().setVisibility(0);
                LLJZIJLIL().setVisibility(8);
                LLJLL().setVisibility(0);
                LLJLL().LIZIZ();
                C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 31), LLJLILLLLZIIL().findViewById(R.id.b3r));
                return;
            }
            o.LJIJI("mTipsHandler");
            throw null;
        }
        this.LLJZIJLIL.cancel();
        SafeHandler safeHandler2 = this.LLIFFJFJJ;
        if (safeHandler2 != null) {
            safeHandler2.removeCallbacksAndMessages(null);
            LLJLL().setVisibility(8);
            LLJLL().LIZJ();
            LLJLILLLLZIIL().setVisibility(8);
            LLJZIJLIL().setVisibility(0);
            LLJZIJLIL().setAlpha(1.0f);
            return;
        }
        o.LJIJI("mTipsHandler");
        throw null;
    }

    @Override // X.XSB
    public final void e9(List<Utterance> list) {
        boolean z;
        String str;
        String str2;
        o.LJIIIZ(list, "list");
        Dialog dialog = this.LLJLLL;
        if (dialog != null && dialog.isShowing()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Dialog dialog2 = this.LLJLLL;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.LLJLLL = null;
        }
        LLJJJ().setVisibility(0);
        XS5 Fr = LLLFFI().Fr();
        if (Fr != null) {
            str = Fr.LJ;
        } else {
            str = null;
        }
        this.LLIIZ = str;
        LLJLLIL().mSubtitleMusicChangeChecker.getData(LLJLLIL());
        ArrayList<CaptionUtterance> arrayList = new ArrayList<>();
        String str3 = this.LLIIZ;
        XS5 Fr2 = LLLFFI().Fr();
        if (Fr2 != null) {
            str2 = Fr2.LJFF;
        } else {
            str2 = null;
        }
        CaptionQueryInfo captionQueryInfo = new CaptionQueryInfo(str3, str2);
        if (this.LLJLIL) {
            for (Utterance utterance : list) {
                Context context = this.LLJJJJ;
                if (context != null) {
                    arrayList.add(new CaptionUtterance((Utterance) null, C78841Uwv.LJJJJ(utterance, context, false)));
                } else {
                    o.LJIJI("context");
                    throw null;
                }
            }
        } else {
            Iterator<Utterance> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new CaptionUtterance(new Utterance(it.next()), (TextStickerData) null));
            }
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(9));
        }
        LLJILJIL(arrayList);
        LLLILZ();
        MutableLiveData<C5MM> mutableLiveData = this.LLFZ;
        if (mutableLiveData != null) {
            if (this.LLFII != null) {
                mutableLiveData.setValue(new C5MM(4, 0L, null));
                LLLJL(false);
                if (this.LLJL) {
                    this.LJLILLLLZI.LIZLLL(this.LLJJL, arrayList, captionQueryInfo);
                } else {
                    ArrayList<CaptionUtterance> arrayList2 = new ArrayList<>();
                    this.LLIIIL = arrayList2;
                    arrayList2.addAll(arrayList);
                }
                LLLIIIIL(arrayList);
                LLLILZLLLI();
                return;
            }
            o.LJIJI("mCurrentPositionSource");
            throw null;
        }
        o.LJIJI("mPreviewControlOpLiveData");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.6Ab] */
    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        MutableLiveData<Integer> E0;
        MutableLiveData<OSZ<String, Integer>> p3;
        MutableLiveData<Integer> z1;
        MutableLiveData<Integer> J9;
        MutableLiveData<C6AY> VI;
        LiveEvent<ArrayList<TextStickerData>> Ug;
        final InterfaceC142545ic interfaceC142545ic;
        super.onActivityCreated(bundle);
        H78.LIZ("EditCaptionScene -> onActivityCreated");
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
        this.LL = activityC45651qj;
        C47919IrL.LIZIZ(activityC45651qj);
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        if (LIZIZ != null) {
            this.LLIILII = LIZIZ;
            InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
            this.LLD = value;
            if (value != null) {
                i = value.getDuration();
            } else {
                i = 0;
            }
            this.LLF = i;
            this.LLI = new SafeHandler(this);
            this.LLIFFJFJJ = new SafeHandler(this);
            this.LLJL = C44384HbQ.LJJIIJ(LLJLLIL());
            this.LLJLIL = C44384HbQ.LLJILJIL(LLJLLIL());
            this.LLIIJI = new InterfaceC47920IrM() { // from class: X.6Ab
                @Override // X.InterfaceC47920IrM
                public final void LIZ() {
                    H78.LIZ("EditCaptionScene -> onNetDisConnect");
                    EditCaptionScene.this.LLLI(true);
                }

                @Override // X.InterfaceC47920IrM
                public final void LIZIZ() {
                    H78.LIZ("EditCaptionScene -> onNetConnected");
                    EditCaptionScene editCaptionScene = EditCaptionScene.this;
                    editCaptionScene.LLLI(editCaptionScene.LLLIIIL());
                }
            };
            C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 413));
            C82622Wbi c82622Wbi = C44384HbQ.LJJJI(this).LJLLL;
            o.LJI(c82622Wbi);
            this.LLJJJIL = (C6AT) c82622Wbi.LJ(C6AT.class, null);
            View requireViewById = requireViewById(R.id.ks8);
            o.LJIIIIZZ(requireViewById, "requireViewById<Relative….id.subtitle_show_layout)");
            RelativeLayout relativeLayout = (RelativeLayout) requireViewById;
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            C151555x9 c151555x9 = new C151555x9(requireSceneContext);
            c151555x9.LJII = true;
            c151555x9.LJ = LLLIIII(c151555x9, relativeLayout, R.layout.v_);
            c151555x9.LJFF = LLLIIII(c151555x9, relativeLayout, R.layout.vc);
            c151555x9.LJI = LLLIIII(c151555x9, relativeLayout, R.layout.v7);
            List<C151915xj> LJJIJIL = C47261Igj.LJJIJIL(new C151915xj(LLLFF, 2));
            EnumC151655xJ enumC151655xJ = EnumC151655xJ.VARIABLE;
            o.LJIIIZ(enumC151655xJ, "<set-?>");
            c151555x9.LIZJ = enumC151655xJ;
            LJJIJIL.add(new C151915xj(SFS.LJI(425.0d), 2));
            int i2 = ((C155976Af) this.LLIIII.getValue()).LIZ.getInt("control_view_height", -1);
            Iterator<C151915xj> it = LJJIJIL.iterator();
            int i3 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next().LIZ == i2) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            C162366Yu.LIZIZ(i3, 0, LJJIJIL);
            c151555x9.LIZLLL = LJJIJIL;
            final C151885xg c151885xg = new C151885xg(c151555x9);
            this.LLFFF = c151885xg;
            relativeLayout.addView(c151885xg, -1, -1);
            final InterfaceC153045zY interfaceC153045zY = this.LLD;
            if (interfaceC153045zY != null) {
                InterfaceC143655kP editPreviewApi = getEditPreviewApi();
                if (editPreviewApi instanceof InterfaceC142545ic) {
                    interfaceC142545ic = (InterfaceC142545ic) editPreviewApi;
                } else {
                    interfaceC142545ic = null;
                }
                final VESize LLILZ = interfaceC153045zY.LLILZ();
                c151885xg.setPreviewHeightChangeListener(new InterfaceC151945xm() { // from class: X.5O4
                    @Override // X.InterfaceC151945xm
                    public final void LIZ(int i4) {
                        VESize vESize = VESize.this;
                        float f = vESize.height / vESize.width;
                        int i5 = C151885xg.LJLZ;
                        Context context = c151885xg.getContext();
                        o.LJIIIIZZ(context, "canvasView.context");
                        int LJJJJLI = (C63081OpJ.LJJJJLI(context) + i5) - AnonymousClass668.LIZIZ().LIZ();
                        VESize vESize2 = VESize.this;
                        int i6 = vESize2.width;
                        float f2 = i4;
                        if (f2 / i6 > f) {
                            int i7 = vESize2.height;
                            int LIZJ = AnonymousClass030.LIZJ(i4, i7, 2, LJJJJLI);
                            int[] iArr = {0, LIZJ, i6, i7};
                            interfaceC153045zY.LIZ(0, LIZJ, i6, i7);
                            InterfaceC142545ic interfaceC142545ic2 = interfaceC142545ic;
                            if (interfaceC142545ic2 != null) {
                                interfaceC142545ic2.uJ(1.0f, iArr[0], iArr[1]);
                                return;
                            }
                            return;
                        }
                        int i8 = vESize2.height;
                        float f3 = (f2 * 1.0f) / i8;
                        int[] LIZ = C56W.LIZ(i6, i8, i6, i4, LJJJJLI);
                        interfaceC153045zY.LIZ(LIZ[0], LIZ[1], LIZ[2], LIZ[3]);
                        InterfaceC142545ic interfaceC142545ic3 = interfaceC142545ic;
                        if (interfaceC142545ic3 != null) {
                            interfaceC142545ic3.uJ(f3, LIZ[0], LIZ[1]);
                        }
                    }
                });
            }
            c151885xg.setGrabberViewStateChangeListener((C6AR) this.LJLJLLL.getValue());
            View requireViewById2 = requireViewById(R.id.jbk);
            o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.scene_layout_subtitle)");
            ViewGroup viewGroup = (ViewGroup) requireViewById2;
            this.LLFF = viewGroup;
            viewGroup.setVisibility(8);
            ViewGroup viewGroup2 = this.LLFF;
            if (viewGroup2 != null) {
                View findViewById = viewGroup2.findViewById(R.id.csx);
                o.LJIIIIZZ(findViewById, "mSubtitleView.findViewBy…R.id.effect_title_layout)");
                this.LLILII = (RelativeLayout) findViewById;
                ViewGroup viewGroup3 = this.LLFF;
                if (viewGroup3 != null) {
                    View findViewById2 = viewGroup3.findViewById(R.id.buq);
                    o.LJIIIIZZ(findViewById2, "mSubtitleView.findViewById(R.id.contentlayout)");
                    this.LLILIL = (LinearLayout) findViewById2;
                    ViewGroup viewGroup4 = this.LLFF;
                    if (viewGroup4 != null) {
                        View findViewById3 = viewGroup4.findViewById(R.id.krv);
                        o.LJIIIIZZ(findViewById3, "mSubtitleView.findViewById(R.id.subtitle_content)");
                        this.LLJJJ = (FrameLayout) findViewById3;
                        ViewGroup viewGroup5 = this.LLFF;
                        if (viewGroup5 != null) {
                            View findViewById4 = viewGroup5.findViewById(R.id.m1c);
                            o.LJIIIIZZ(findViewById4, "mSubtitleView.findViewById(R.id.tv_cancel)");
                            this.LLILL = (TextView) findViewById4;
                            ViewGroup viewGroup6 = this.LLFF;
                            if (viewGroup6 != null) {
                                View findViewById5 = viewGroup6.findViewById(R.id.mij);
                                o.LJIIIIZZ(findViewById5, "mSubtitleView.findViewById(R.id.tv_save)");
                                this.LLILLIZIL = (TextView) findViewById5;
                                ViewGroup viewGroup7 = this.LLFF;
                                if (viewGroup7 != null) {
                                    View findViewById6 = viewGroup7.findViewById(R.id.g82);
                                    o.LJIIIIZZ(findViewById6, "mSubtitleView.findViewById(R.id.loading_area)");
                                    this.LLILLJJLI = (LinearLayout) findViewById6;
                                    ViewGroup viewGroup8 = this.LLFF;
                                    if (viewGroup8 != null) {
                                        View findViewById7 = viewGroup8.findViewById(R.id.g8y);
                                        o.LJIIIIZZ(findViewById7, "mSubtitleView.findViewById(R.id.loading_status)");
                                        this.LLILLL = (C223338pd) findViewById7;
                                        ViewGroup viewGroup9 = this.LLFF;
                                        if (viewGroup9 != null) {
                                            View findViewById8 = viewGroup9.findViewById(R.id.ks4);
                                            o.LJIIIIZZ(findViewById8, "mSubtitleView.findViewBy….id.subtitle_play_layout)");
                                            this.LLILZ = (LinearLayout) findViewById8;
                                            ViewGroup viewGroup10 = this.LLFF;
                                            if (viewGroup10 != null) {
                                                View findViewById9 = viewGroup10.findViewById(R.id.isn);
                                                o.LJIIIIZZ(findViewById9, "mSubtitleView.findViewById(R.id.recycler_view)");
                                                this.LLILZIL = (C161806Wq) findViewById9;
                                                ViewGroup viewGroup11 = this.LLFF;
                                                if (viewGroup11 != null) {
                                                    View findViewById10 = viewGroup11.findViewById(R.id.e5d);
                                                    o.LJIIIIZZ(findViewById10, "mSubtitleView.findViewById(R.id.highlight_area)");
                                                    this.LLILZLL = findViewById10;
                                                    ViewGroup viewGroup12 = this.LLFF;
                                                    if (viewGroup12 != null) {
                                                        View findViewById11 = viewGroup12.findViewById(R.id.ecp);
                                                        o.LJIIIIZZ(findViewById11, "mSubtitleView.findViewBy…d.icon_subtitle_typefont)");
                                                        this.LLJJ = (TuxIconView) findViewById11;
                                                        ViewGroup viewGroup13 = this.LLFF;
                                                        if (viewGroup13 != null) {
                                                            View findViewById12 = viewGroup13.findViewById(R.id.ecm);
                                                            o.LJIIIIZZ(findViewById12, "mSubtitleView.findViewBy….id.icon_subtitle_delete)");
                                                            this.LLJILLL = (TuxIconView) findViewById12;
                                                            ViewGroup viewGroup14 = this.LLFF;
                                                            if (viewGroup14 != null) {
                                                                View findViewById13 = viewGroup14.findViewById(R.id.g8u);
                                                                o.LJIIIIZZ(findViewById13, "mSubtitleView.findViewById(R.id.loading_progress)");
                                                                this.LLIZ = (TextView) findViewById13;
                                                                ViewGroup viewGroup15 = this.LLFF;
                                                                if (viewGroup15 != null) {
                                                                    View findViewById14 = viewGroup15.findViewById(R.id.g8j);
                                                                    o.LJIIIIZZ(findViewById14, "mSubtitleView.findViewById(R.id.loading_hint)");
                                                                    this.LLIZLLLIL = (TextView) findViewById14;
                                                                    ViewGroup viewGroup16 = this.LLFF;
                                                                    if (viewGroup16 != null) {
                                                                        View findViewById15 = viewGroup16.findViewById(R.id.ecn);
                                                                        o.LJIIIIZZ(findViewById15, "mSubtitleView.findViewBy…(R.id.icon_subtitle_edit)");
                                                                        this.LLJ = (TuxIconView) findViewById15;
                                                                        View findViewById16 = LLJLILLLLZIIL().findViewById(R.id.b3r);
                                                                        o.LJIIIIZZ(findViewById16, "mLoadingArea.findViewById(R.id.cancel_btn)");
                                                                        this.LLJILJIL = (TuxTextView) findViewById16;
                                                                        ViewGroup viewGroup17 = this.LLFF;
                                                                        if (viewGroup17 != null) {
                                                                            View findViewById17 = viewGroup17.findViewById(R.id.ks5);
                                                                            o.LJIIIIZZ(findViewById17, "mSubtitleView.findViewBy…R.id.subtitle_play_title)");
                                                                            this.LLJILJILJ = (ConstraintLayout) findViewById17;
                                                                            ViewGroup viewGroup18 = this.LLFF;
                                                                            if (viewGroup18 != null) {
                                                                                View findViewById18 = viewGroup18.findViewById(R.id.g45);
                                                                                o.LJIIIIZZ(findViewById18, "mSubtitleView.findViewById(R.id.ll_language)");
                                                                                this.LLJJI = (LinearLayout) findViewById18;
                                                                                ViewGroup viewGroup19 = this.LLFF;
                                                                                if (viewGroup19 != null) {
                                                                                    View findViewById19 = viewGroup19.findViewById(R.id.m_g);
                                                                                    o.LJIIIIZZ(findViewById19, "mSubtitleView.findViewById(R.id.tv_language_name)");
                                                                                    this.LLJJIII = (TuxTextView) findViewById19;
                                                                                    ViewGroup viewGroup20 = this.LLFF;
                                                                                    if (viewGroup20 != null) {
                                                                                        View findViewById20 = viewGroup20.findViewById(R.id.luq);
                                                                                        o.LJIIIIZZ(findViewById20, "mSubtitleView.findViewById(R.id.tux_icon_globe)");
                                                                                        this.LLJJIJI = (TuxIconView) findViewById20;
                                                                                        ViewGroup viewGroup21 = this.LLFF;
                                                                                        if (viewGroup21 != null) {
                                                                                            View findViewById21 = viewGroup21.findViewById(R.id.lus);
                                                                                            o.LJIIIIZZ(findViewById21, "mSubtitleView.findViewById(R.id.tux_icon_right)");
                                                                                            this.LLJJIJIIJIL = (TuxIconView) findViewById21;
                                                                                            LLLFF().setText(this.LLJJL);
                                                                                            ViewGroup viewGroup22 = this.LLFF;
                                                                                            if (viewGroup22 != null) {
                                                                                                View findViewById22 = viewGroup22.findViewById(R.id.krx);
                                                                                                o.LJIIIIZZ(findViewById22, "mSubtitleView.findViewById(R.id.subtitle_done)");
                                                                                                this.LLJJIJIL = (TuxTextView) findViewById22;
                                                                                                this.LJLLILLLL = new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 42);
                                                                                                View requireViewById3 = requireViewById(R.id.f8p);
                                                                                                o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.iv_play)");
                                                                                                this.LLJI = requireViewById3;
                                                                                                View requireViewById4 = requireViewById(R.id.dfo);
                                                                                                o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.fl_play)");
                                                                                                this.LLJIJIL = requireViewById4;
                                                                                                ActivityC45651qj activityC45651qj2 = this.LL;
                                                                                                if (activityC45651qj2 != null) {
                                                                                                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(activityC45651qj2), R.layout.cpk, LLJLILLLLZIIL(), false);
                                                                                                    o.LJIIIIZZ(LLLLIILL, "from(mActivity).inflate(…ail, mLoadingArea, false)");
                                                                                                    this.LJLLL = LLLLIILL;
                                                                                                    ActivityC45651qj activityC45651qj3 = this.LL;
                                                                                                    if (activityC45651qj3 != null) {
                                                                                                        View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(activityC45651qj3), R.layout.cpj, LLJLILLLLZIIL(), false);
                                                                                                        o.LJIIIIZZ(LLLLIILL2, "from(mActivity).inflate(…pty, mLoadingArea, false)");
                                                                                                        this.LJLLLL = LLLLIILL2;
                                                                                                        TextView textView = this.LLILL;
                                                                                                        if (textView != null) {
                                                                                                            IDlS62S0100000_2 iDlS62S0100000_2 = this.LJLLILLLL;
                                                                                                            if (iDlS62S0100000_2 != null) {
                                                                                                                C16880lQ.LJIJI(textView, iDlS62S0100000_2);
                                                                                                                TextView textView2 = this.LLILLIZIL;
                                                                                                                if (textView2 != null) {
                                                                                                                    IDlS62S0100000_2 iDlS62S0100000_22 = this.LJLLILLLL;
                                                                                                                    if (iDlS62S0100000_22 != null) {
                                                                                                                        C16880lQ.LJIJI(textView2, iDlS62S0100000_22);
                                                                                                                        TuxIconView LLJJL = LLJJL();
                                                                                                                        IDlS62S0100000_2 iDlS62S0100000_23 = this.LJLLILLLL;
                                                                                                                        if (iDlS62S0100000_23 != null) {
                                                                                                                            C16880lQ.LJJJ(LLJJL, iDlS62S0100000_23);
                                                                                                                            TuxIconView LLJJJIL = LLJJJIL();
                                                                                                                            IDlS62S0100000_2 iDlS62S0100000_24 = this.LJLLILLLL;
                                                                                                                            if (iDlS62S0100000_24 != null) {
                                                                                                                                C16880lQ.LJJJ(LLJJJIL, iDlS62S0100000_24);
                                                                                                                                TuxIconView LLJJJJ = LLJJJJ();
                                                                                                                                IDlS62S0100000_2 iDlS62S0100000_25 = this.LJLLILLLL;
                                                                                                                                if (iDlS62S0100000_25 != null) {
                                                                                                                                    C16880lQ.LJJJ(LLJJJJ, iDlS62S0100000_25);
                                                                                                                                    View view = this.LLJIJIL;
                                                                                                                                    if (view != null) {
                                                                                                                                        IDlS62S0100000_2 iDlS62S0100000_26 = this.LJLLILLLL;
                                                                                                                                        if (iDlS62S0100000_26 != null) {
                                                                                                                                            C16880lQ.LJIIJ(iDlS62S0100000_26, view);
                                                                                                                                            LinearLayout LLJLIL = LLJLIL();
                                                                                                                                            IDlS62S0100000_2 iDlS62S0100000_27 = this.LJLLILLLL;
                                                                                                                                            if (iDlS62S0100000_27 != null) {
                                                                                                                                                C16880lQ.LJIIZILJ(LLJLIL, iDlS62S0100000_27);
                                                                                                                                                ActivityC45651qj activityC45651qj4 = this.LL;
                                                                                                                                                if (activityC45651qj4 != null) {
                                                                                                                                                    this.LJLLLLLL = new HighLightLayoutManager(activityC45651qj4);
                                                                                                                                                    C69W c69w = new C69W(new ArrayList());
                                                                                                                                                    this.LJLZ = c69w;
                                                                                                                                                    c69w.LJLJJL = new C69Z() { // from class: X.6Ag
                                                                                                                                                        @Override // X.C69Z
                                                                                                                                                        public final void LIZ(int i4, int i5) {
                                                                                                                                                            EditCaptionScene.this.LLJJ(i4, i5, "click_subtitle");
                                                                                                                                                        }
                                                                                                                                                    };
                                                                                                                                                    if (C58B.LIZ()) {
                                                                                                                                                        TuxTextView tuxTextView = this.LLJILJIL;
                                                                                                                                                        if (tuxTextView != null) {
                                                                                                                                                            tuxTextView.setBackgroundResource(R.drawable.a21);
                                                                                                                                                            View view2 = this.LJLLL;
                                                                                                                                                            if (view2 != null) {
                                                                                                                                                                view2.findViewById(R.id.aym).setBackgroundResource(R.drawable.a21);
                                                                                                                                                                View view3 = this.LJLLL;
                                                                                                                                                                if (view3 != null) {
                                                                                                                                                                    view3.findViewById(R.id.krz).setBackgroundResource(R.drawable.a21);
                                                                                                                                                                    View view4 = this.LJLLLL;
                                                                                                                                                                    if (view4 != null) {
                                                                                                                                                                        view4.findViewById(R.id.b3n).setBackgroundResource(R.drawable.a21);
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
                                                                                                                                                    C161806Wq LLJLLL = LLJLLL();
                                                                                                                                                    HighLightLayoutManager highLightLayoutManager = this.LJLLLLLL;
                                                                                                                                                    if (highLightLayoutManager != null) {
                                                                                                                                                        LLJLLL.setLayoutManager(highLightLayoutManager);
                                                                                                                                                        C69W c69w2 = this.LJLZ;
                                                                                                                                                        if (c69w2 != null) {
                                                                                                                                                            LLJLLL.setAdapter(c69w2);
                                                                                                                                                            if (((C155976Af) this.LLIIII.getValue()).LIZ.getInt("control_view_height", -1) == LLLFFI) {
                                                                                                                                                                LLJLLL.LJII((AbstractC030309z) this.LJLJLJ.getValue(), -1);
                                                                                                                                                            } else {
                                                                                                                                                                LLJLLL.LJII((AbstractC030309z) this.LJLJL.getValue(), -1);
                                                                                                                                                            }
                                                                                                                                                            AbstractC030109x itemAnimator = LLJLLL.getItemAnimator();
                                                                                                                                                            o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                                                                                                                                                            ((AbstractC28931Bp) itemAnimator).LJI = false;
                                                                                                                                                            LLJLLL().LJIIJJI(new C0A6() { // from class: X.6AM
                                                                                                                                                                public boolean LJLIL;
                                                                                                                                                                public boolean LJLILLLLZI;

                                                                                                                                                                @Override // X.C0A6
                                                                                                                                                                public final void LJIILJJIL(int i4, RecyclerView recyclerView) {
                                                                                                                                                                    o.LJIIIZ(recyclerView, "recyclerView");
                                                                                                                                                                    if (i4 != 0) {
                                                                                                                                                                        if (i4 != 1) {
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        EditCaptionScene editCaptionScene = EditCaptionScene.this;
                                                                                                                                                                        if (editCaptionScene.LJLLJ) {
                                                                                                                                                                            this.LJLIL = true;
                                                                                                                                                                        }
                                                                                                                                                                        editCaptionScene.LLLILZ();
                                                                                                                                                                        this.LJLILLLLZI = true;
                                                                                                                                                                        EditCaptionScene editCaptionScene2 = EditCaptionScene.this;
                                                                                                                                                                        SafeHandler safeHandler = editCaptionScene2.LLI;
                                                                                                                                                                        if (safeHandler != null) {
                                                                                                                                                                            safeHandler.post((RunnableC152505yg) editCaptionScene2.LJLLI.getValue());
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
                                                                                                                                                                    EditCaptionScene editCaptionScene3 = EditCaptionScene.this;
                                                                                                                                                                    SafeHandler safeHandler2 = editCaptionScene3.LLI;
                                                                                                                                                                    if (safeHandler2 != null) {
                                                                                                                                                                        safeHandler2.removeCallbacksAndMessages(editCaptionScene3.LJLLI.getValue());
                                                                                                                                                                        EditCaptionScene editCaptionScene4 = EditCaptionScene.this;
                                                                                                                                                                        C69W c69w3 = editCaptionScene4.LJLZ;
                                                                                                                                                                        if (c69w3 != null) {
                                                                                                                                                                            int i5 = c69w3.LJLILLLLZI;
                                                                                                                                                                            if (i5 != -1) {
                                                                                                                                                                                EditCaptionScene.HighLightLayoutManager highLightLayoutManager2 = editCaptionScene4.LJLLLLLL;
                                                                                                                                                                                if (highLightLayoutManager2 != null) {
                                                                                                                                                                                    highLightLayoutManager2.LLIIII(editCaptionScene4.LLJLLL(), new C0AC(), i5);
                                                                                                                                                                                    EditCaptionScene editCaptionScene5 = EditCaptionScene.this;
                                                                                                                                                                                    MutableLiveData<C5MM> mutableLiveData = editCaptionScene5.LLFZ;
                                                                                                                                                                                    if (mutableLiveData != null) {
                                                                                                                                                                                        if (editCaptionScene5.LLFII != null) {
                                                                                                                                                                                            C69W c69w4 = editCaptionScene5.LJLZ;
                                                                                                                                                                                            if (c69w4 != null) {
                                                                                                                                                                                                mutableLiveData.setValue(C5MM.LIZLLL(((CaptionUtterance) ListProtector.get(c69w4.LJLIL, i5)).LIZIZ() + 30));
                                                                                                                                                                                            } else {
                                                                                                                                                                                                o.LJIJI("mSubtitleAdapter");
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            o.LJIJI("mCurrentPositionSource");
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        o.LJIJI("mPreviewControlOpLiveData");
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
                                                                                                                                                                            EditCaptionScene.this.LLLILZLLLI();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        o.LJIJI("mSubtitleAdapter");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    o.LJIJI("mSafeHandler");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            ActivityC45651qj activityC45651qj5 = this.LL;
                                                                                                                                                            if (activityC45651qj5 != null) {
                                                                                                                                                                LayoutInflater LLZIL = C16880lQ.LLZIL(activityC45651qj5);
                                                                                                                                                                ViewGroup viewGroup23 = this.LLFF;
                                                                                                                                                                if (viewGroup23 != null) {
                                                                                                                                                                    View LLLLIILL3 = C16880lQ.LLLLIILL(LLZIL, R.layout.cph, viewGroup23, false);
                                                                                                                                                                    o.LJII(LLLLIILL3, "null cannot be cast to non-null type android.widget.LinearLayout");
                                                                                                                                                                    LinearLayout linearLayout = (LinearLayout) LLLLIILL3;
                                                                                                                                                                    ViewGroup viewGroup24 = this.LLFF;
                                                                                                                                                                    if (viewGroup24 != null) {
                                                                                                                                                                        C6AL c6al = new C6AL(linearLayout, viewGroup24, this, LLJLLIL(), getEditPreviewApi());
                                                                                                                                                                        this.LJLJJI = c6al;
                                                                                                                                                                        c6al.LJ = this;
                                                                                                                                                                        this.LLFII = new C155956Ad(this);
                                                                                                                                                                        ((InterfaceC147865rC) this.LJZL.LIZ(this, LLLF[4])).lx().observe(this, new AObserverS70S0100000_2(this, 225));
                                                                                                                                                                        MutableLiveData<C5MM> DM = getEditPreviewApi().DM();
                                                                                                                                                                        this.LLFZ = DM;
                                                                                                                                                                        if (DM != null) {
                                                                                                                                                                            DM.observe(this, new AObserverS70S0100000_2(this, 226));
                                                                                                                                                                            LLLFFI().So0().LIZLLL(this, new AObjectS84S0100000_2(this, 271));
                                                                                                                                                                            LLLFFI().lf().observe(this, new AObserverS70S0100000_2(this, 219));
                                                                                                                                                                            C6AT c6at = this.LLJJJIL;
                                                                                                                                                                            if (c6at != null && (Ug = c6at.Ug()) != null) {
                                                                                                                                                                                Ug.LIZLLL(this, new AObjectS84S0100000_2(this, 272));
                                                                                                                                                                            }
                                                                                                                                                                            C6AT c6at2 = this.LLJJJIL;
                                                                                                                                                                            if (c6at2 != null && (VI = c6at2.VI()) != null) {
                                                                                                                                                                                VI.observe(this, new AObserverS70S0100000_2(this, 220));
                                                                                                                                                                            }
                                                                                                                                                                            C6AT c6at3 = this.LLJJJIL;
                                                                                                                                                                            if (c6at3 != null && (J9 = c6at3.J9()) != null) {
                                                                                                                                                                                J9.observe(this, new AObserverS70S0100000_2(this, 221));
                                                                                                                                                                            }
                                                                                                                                                                            C6AT c6at4 = this.LLJJJIL;
                                                                                                                                                                            if (c6at4 != null && (z1 = c6at4.z1()) != null) {
                                                                                                                                                                                z1.observe(this, new AObserverS70S0100000_2(this, 222));
                                                                                                                                                                            }
                                                                                                                                                                            C6AT c6at5 = this.LLJJJIL;
                                                                                                                                                                            if (c6at5 != null && (p3 = c6at5.p3()) != null) {
                                                                                                                                                                                p3.observe(this, new AObserverS70S0100000_2(this, 223));
                                                                                                                                                                            }
                                                                                                                                                                            C6AT c6at6 = this.LLJJJIL;
                                                                                                                                                                            if (c6at6 != null && (E0 = c6at6.E0()) != null) {
                                                                                                                                                                                E0.observe(this, new AObserverS70S0100000_2(this, 224));
                                                                                                                                                                            }
                                                                                                                                                                            XS5 Fr = LLLFFI().Fr();
                                                                                                                                                                            if (Fr != null) {
                                                                                                                                                                                Fr.LJII = this;
                                                                                                                                                                            }
                                                                                                                                                                            if (this.LLJ == null || this.LLJILLL == null) {
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                            LLJJJJ().setContentDescription(getString(R.string.a_e));
                                                                                                                                                                            LLJJL().setContentDescription(getString(R.string.a_a));
                                                                                                                                                                            LLJJJIL().setContentDescription(getString(R.string.a_1));
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        o.LJIJI("mPreviewControlOpLiveData");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    o.LJIJI("mSubtitleView");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                o.LJIJI("mSubtitleView");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            o.LJIJI("mActivity");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        o.LJIJI("mSubtitleAdapter");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    o.LJIJI("mHighLightLayoutManager");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                o.LJIJI("mActivity");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            o.LJIJI("debounceOnClickListener");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        o.LJIJI("debounceOnClickListener");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    o.LJIJI("mFlPlay");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                o.LJIJI("debounceOnClickListener");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            o.LJIJI("debounceOnClickListener");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        o.LJIJI("debounceOnClickListener");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    o.LJIJI("debounceOnClickListener");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                o.LJIJI("mSaveView");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("debounceOnClickListener");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        o.LJIJI("mCancelView");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("mActivity");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("mActivity");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("mSubtitleView");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("mSubtitleView");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("mSubtitleView");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("mSubtitleView");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("mSubtitleView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mSubtitleView");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mSubtitleView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mSubtitleView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mSubtitleView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mSubtitleView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mSubtitleView");
                                                    throw null;
                                                }
                                                o.LJIJI("mSubtitleView");
                                                throw null;
                                            }
                                            o.LJIJI("mSubtitleView");
                                            throw null;
                                        }
                                        o.LJIJI("mSubtitleView");
                                        throw null;
                                    }
                                    o.LJIJI("mSubtitleView");
                                    throw null;
                                }
                                o.LJIJI("mSubtitleView");
                                throw null;
                            }
                            o.LJIJI("mSubtitleView");
                            throw null;
                        }
                        o.LJIJI("mSubtitleView");
                        throw null;
                    }
                    o.LJIJI("mSubtitleView");
                    throw null;
                }
                o.LJIJI("mSubtitleView");
                throw null;
            }
            o.LJIJI("mSubtitleView");
            throw null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.6AS] */
    public EditCaptionScene(C82622Wbi diContainer, C5K1 mInlineCaptionCaches) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(mInlineCaptionCaches, "mInlineCaptionCaches");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = mInlineCaptionCaches;
        this.LJLJJL = UCI.LJI(diContainer, VideoEditContainerScene.class, null);
        SettingsManager.LIZLLL().getClass();
        SettingsManager.LJFF("tool_recognize_caption_limit_time", 60000L);
        this.LJLJL = C221108m2.LIZIZ(C155926Aa.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(C6AZ.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 278));
        this.LJLL = 0.004f;
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 279));
        this.LJZ = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJZI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJZL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LLII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 280));
        this.LLIIII = C221108m2.LIZIZ(C155966Ae.LJLIL);
        this.LLIIIJ = new ArrayList<>();
        this.LLIILZL = new C5HC() { // from class: X.6AS
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                EditCaptionScene editCaptionScene = EditCaptionScene.this;
                C6AL c6al = editCaptionScene.LJLJJI;
                if (c6al != null && c6al.LJIIL) {
                    TextView textView = c6al.LJIIIIZZ;
                    if (textView != null) {
                        textView.performClick();
                    }
                } else {
                    C6AT c6at = editCaptionScene.LLJJJIL;
                    if (c6at != null && c6at.LLIIIJ()) {
                        return false;
                    }
                    ViewGroup viewGroup = EditCaptionScene.this.LLFF;
                    if (viewGroup != null) {
                        if (viewGroup.isShown()) {
                            EditCaptionScene editCaptionScene2 = EditCaptionScene.this;
                            if (editCaptionScene2.LLJLILLLLZIIL().getVisibility() == 0) {
                                editCaptionScene2.LLLJ();
                            } else {
                                editCaptionScene2.LLLIZZ();
                            }
                        }
                    } else {
                        o.LJIJI("mSubtitleView");
                        throw null;
                    }
                }
                return true;
            }
        };
        this.LLIL = UCI.LJI(diContainer, InterfaceC143855kj.class, null);
        new C82622Wbi(new C82621Wbh[0]);
        this.LLJJJJLIIL = -1;
        this.LLJJL = "";
        this.LLJJLIIIJLLLLLLLZ = C152535yj.LIZJ();
        this.LLJLILLLLZIIL = true;
        this.LLJLL = new C152395yV();
        this.LLJLLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 281));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(15400L);
        ofFloat.addUpdateListener(new AUListenerS94S0200000_2(ofFloat, this, 0));
        this.LLJZIJLIL = ofFloat;
    }

    public static final View LLLIIII(C151555x9 c151555x9, RelativeLayout relativeLayout, int i) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c151555x9.LIZ), i, relativeLayout, false);
        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …captionShowLayout, false)");
        return LLLLIILL;
    }

    @Override // X.InterfaceC156026Ak
    public final void LJJLIIIJLLLLLLLZ(int i, boolean z, List newData) {
        o.LJIIIZ(newData, "newData");
        if (z) {
            this.LLIIIJ.clear();
            this.LLIIIJ.addAll(newData);
            C69W c69w = this.LJLZ;
            if (c69w != null) {
                c69w.setData(C30581Hy.LJIILIIL(this.LLF, this.LLIIIJ));
                C69W c69w2 = this.LJLZ;
                if (c69w2 != null) {
                    int LJZ = ORZ.LJZ(ORZ.LJLLLLLL(i, this.LLIIIJ), c69w2.LJLIL);
                    C69W c69w3 = this.LJLZ;
                    if (c69w3 != null) {
                        if (LJZ == -1) {
                            LJZ = 0;
                        }
                        c69w3.LJLLLLLL(LJZ);
                        ArrayList arrayList = new ArrayList();
                        C69W c69w4 = this.LJLZ;
                        if (c69w4 != null) {
                            ArrayList<CaptionUtterance> arrayList2 = c69w4.LJLIL;
                            int size = arrayList2.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                if (((CaptionUtterance) ListProtector.get(arrayList2, i2)).LIZLLL().length() > 0) {
                                    Object obj = ListProtector.get(arrayList2, i2);
                                    o.LJIIIIZZ(obj, "listData[i]");
                                    arrayList.add(new CaptionUtterance((CaptionUtterance) obj));
                                }
                            }
                            if (arrayList.isEmpty() && C44384HbQ.LJJIIJ(LLJLLIL())) {
                                LLJILJILJ();
                                this.LLJLL.LIZIZ(this.LLJJL);
                            } else {
                                LLJILJIL(arrayList);
                                InterfaceC153045zY interfaceC153045zY = this.LLD;
                                if (interfaceC153045zY != null) {
                                    interfaceC153045zY.LIZJ();
                                }
                            }
                        } else {
                            o.LJIJI("mSubtitleAdapter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mSubtitleAdapter");
                        throw null;
                    }
                } else {
                    o.LJIJI("mSubtitleAdapter");
                    throw null;
                }
            } else {
                o.LJIJI("mSubtitleAdapter");
                throw null;
            }
        }
        H8F.LJJJ(0, LLJLLIL(), LLJJIII(), z);
    }

    public final void LLJJ(int i, int i2, String str) {
        boolean z;
        if (LLJJLIIIJLLLLLLLZ().getVisibility() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLIIL = z;
        MutableLiveData<C5MM> mutableLiveData = this.LLFZ;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(C5MM.LIZJ());
            C155956Ad c155956Ad = this.LLFII;
            if (c155956Ad != null) {
                this.LJLJI = c155956Ad.LIZ();
                InterfaceC153045zY interfaceC153045zY = this.LLD;
                if (interfaceC153045zY != null) {
                    interfaceC153045zY.LLJILJIL(false);
                }
                H8F.LJJIJIL(0, LLJLLIL(), str, LLJJIII());
                C6AL c6al = this.LJLJJI;
                if (c6al != null) {
                    c6al.LJIIJJI = str;
                }
                ArrayList<CaptionUtterance> arrayList = this.LLIIIJ;
                C69W c69w = this.LJLZ;
                if (c69w != null) {
                    int LJZ = ORZ.LJZ(ORZ.LJLLLLLL(i, c69w.LJLIL), arrayList);
                    if (LJZ == -1) {
                        LJZ = 1;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("EditCaptionScene enterEditView showPos ");
                    LIZ.append(LJZ);
                    LIZ.append(" selectIndex ");
                    LIZ.append(i2);
                    H78.LJI(X1D.LIZIZ(LIZ));
                    final C6AL c6al2 = this.LJLJJI;
                    if (c6al2 != null) {
                        ArrayList<CaptionUtterance> captionList = this.LLIIIJ;
                        int i3 = (int) this.LJLJI;
                        o.LJIIIZ(captionList, "captionList");
                        c6al2.LJIILIIL = i3;
                        c6al2.LJIIL = true;
                        c6al2.LJIILL.clear();
                        c6al2.LJIILL.addAll(captionList);
                        c6al2.LJIILJJIL.clear();
                        Iterator<CaptionUtterance> it = captionList.iterator();
                        while (it.hasNext()) {
                            CaptionUtterance utterance = it.next();
                            ArrayList<CaptionUtterance> arrayList2 = c6al2.LJIILJJIL;
                            o.LJIIIIZZ(utterance, "utterance");
                            arrayList2.add(new CaptionUtterance(utterance));
                        }
                        C6AA c6aa = c6al2.LIZJ;
                        String str2 = c6al2.LJIIJJI;
                        c6aa.getClass();
                        o.LJIIIZ(str2, "<set-?>");
                        c6aa.LJLJJI = str2;
                        C6AA c6aa2 = c6al2.LIZJ;
                        ArrayList<CaptionUtterance> list = c6al2.LJIILJJIL;
                        c6aa2.getClass();
                        o.LJIIIZ(list, "list");
                        c6aa2.LJLJLJ = list;
                        c6aa2.LJLJLLL = LJZ;
                        c6aa2.LJLLILLLL = i2;
                        c6aa2.notifyDataSetChanged();
                        C0A2 layoutManager = c6al2.LIZLLL.getLayoutManager();
                        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        ((LinearLayoutManager) layoutManager).LJFF(LJZ, (int) KL2.LIZJ((Context) c6al2.LJFF.getValue(), 100.0f));
                        c6al2.LJII.LIZIZ(new InterfaceC83564Wqu() { // from class: X.6AQ
                            @Override // X.InterfaceC83564Wqu
                            public final void keyBoardModify(int i4) {
                            }

                            @Override // X.InterfaceC83564Wqu
                            public final void keyBoardHide(int i4) {
                                C6AL c6al3 = C6AL.this;
                                C152515yh c152515yh = c6al3.LJIIIZ;
                                if (c152515yh != null) {
                                    RecyclerView recyclerView = c6al3.LIZLLL;
                                    o.LJI(c152515yh);
                                    recyclerView.LJJLIL(c152515yh);
                                    C6AL.this.LJIIIZ = null;
                                }
                                C6AL.this.LJIILLIIL = false;
                            }

                            @Override // X.InterfaceC83564Wqu
                            public final void keyBoardShow(int i4) {
                                C6AL c6al3 = C6AL.this;
                                if (c6al3.LJIIIZ == null) {
                                    c6al3.LJIIIZ = new C152515yh(0, i4);
                                    C6AL c6al4 = C6AL.this;
                                    RecyclerView recyclerView = c6al4.LIZLLL;
                                    C152515yh c152515yh = c6al4.LJIIIZ;
                                    o.LJI(c152515yh);
                                    recyclerView.LJII(c152515yh, -1);
                                    C0A2 layoutManager2 = C6AL.this.LIZLLL.getLayoutManager();
                                    o.LJII(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                    C6AL c6al5 = C6AL.this;
                                    ((LinearLayoutManager) layoutManager2).LJFF(c6al5.LIZJ.LJLJLLL, (int) KL2.LIZJ((Context) c6al5.LJFF.getValue(), 100.0f));
                                }
                                C6AL.this.LJIILLIIL = true;
                            }
                        });
                        c6al2.LJIIJ.LIZIZ(new C30461Hm() { // from class: X.6Ac
                            @Override // X.C30461Hm, X.InterfaceC82947Wgx
                            public final void LJFF() {
                                C6AL.this.LJI.toggleSoftInput(0, 2);
                            }
                        });
                        return;
                    }
                    return;
                }
                o.LJIJI("mSubtitleAdapter");
                throw null;
            }
            o.LJIJI("mCurrentPositionSource");
            throw null;
        }
        o.LJIJI("mPreviewControlOpLiveData");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        Context context = container.getContext();
        o.LJIIIIZZ(context, "container.context");
        this.LLJJJJ = context;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ccq, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
