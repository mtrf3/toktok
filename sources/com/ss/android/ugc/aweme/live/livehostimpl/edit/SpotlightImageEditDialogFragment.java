package com.ss.android.ugc.aweme.live.livehostimpl.edit;

import X.AbstractC38911fr;
import X.ActivityC45651qj;
import X.B83;
import X.B9K;
import X.BZI;
import X.C15490jB;
import X.C165616ej;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29374Bfu;
import X.C2A7;
import X.C56K;
import X.C61712OJw;
import X.C61713OJx;
import X.C6D9;
import X.C6IH;
import X.C6IQ;
import X.C6V4;
import X.C6VC;
import X.C76881UFh;
import X.C76883UFj;
import X.C76898UFy;
import X.C78897Uxp;
import X.C81091Vs7;
import X.C81184Vtc;
import X.CFX;
import X.DialogC31813Ce9;
import X.EF7;
import X.EnumC76899UFz;
import X.UG0;
import X.UG2;
import X.UG4;
import X.UG5;
import X.UG8;
import X.UG9;
import X.UGA;
import X.UGE;
import X.UGG;
import X.UGH;
import X.UGS;
import X.UGW;
import X.V1M;
import X.VA9;
import X.W5F;
import X.W5U;
import X.YKR;
import X.YKU;
import Y.ACListenerS2S0200001_13;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDCListenerS259S0100000_13;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import v82.IDdS504S0100000_13;

/* loaded from: classes14.dex */
public final class SpotlightImageEditDialogFragment extends LiveDialogFragment implements UGH {
    public C76883UFj LJLIL;
    public Bitmap LJLILLLLZI;
    public Bitmap LJLJI;
    public Bitmap LJLJJI;
    public Bitmap LJLJJL;
    public Rect LJLJLJ;
    public UGE LJLJLLL;
    public SafeHandler LJLL;
    public YKU LJLLI;
    public YKR LJLLILLLL;
    public EditTextStickerViewModel LJLLJ;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public long LJZL;
    public DialogC31813Ce9 LL;
    public boolean LLD;
    public TextStickerData LLF;
    public YKR LLFF;
    public boolean LLFFF;
    public final Map<Integer, View> LLI = new LinkedHashMap();
    public final int LJLJJLL = 64;
    public EnumC76899UFz LJLJL = EnumC76899UFz.OTHER;
    public Rect LJLLL = new Rect(0, 0, 0, 0);
    public String LLFII = "";
    public final UG8 LLFZ = new UG8(this);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
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

    @Override // X.UGH
    public final void keyBoardModify(int i) {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.bra);
        c28507BGt.LIZJ = R.style.aaq;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ViewParent viewParent;
        String str;
        Map<String, Object> map;
        TextStickerData textStickerData;
        YKR ykr;
        AbstractC38911fr abstractC38911fr;
        AbstractC38911fr abstractC38911fr2;
        AbstractC38911fr abstractC38911fr3;
        super.onDestroy();
        UGE uge = this.LJLJLLL;
        ViewParent viewParent2 = null;
        if (uge != null) {
            View view = uge.LIZ;
            if (view != null && uge.LJ != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(uge.LJ);
            }
            uge.LIZJ = null;
        }
        YKR ykr2 = this.LJLLILLLL;
        if (ykr2 != null) {
            viewParent = ykr2.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            YKR ykr3 = this.LJLLILLLL;
            if (ykr3 != null) {
                viewParent2 = ykr3.getParent();
            }
            o.LJII(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(this.LJLLILLLL, (ViewGroup) viewParent2);
        }
        int i = C76898UFy.LIZIZ[this.LJLJL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C76883UFj c76883UFj = this.LJLIL;
                    if (c76883UFj != null && (abstractC38911fr3 = c76883UFj.LJIIJJI) != null) {
                        abstractC38911fr3.LJJIII();
                    }
                    str = "others";
                } else {
                    C76883UFj c76883UFj2 = this.LJLIL;
                    if (c76883UFj2 != null && (abstractC38911fr2 = c76883UFj2.LJIIJJI) != null) {
                        abstractC38911fr2.LJJIII();
                    }
                    str = "back";
                }
            } else {
                C76883UFj c76883UFj3 = this.LJLIL;
                if (c76883UFj3 != null && (abstractC38911fr = c76883UFj3.LJIIJJI) != null) {
                    abstractC38911fr.LJJIIJZLJL();
                }
                str = "delete";
            }
        } else {
            str = "done";
        }
        if (this.LJLJL != EnumC76899UFz.DONE && (textStickerData = this.LLF) != null && (ykr = this.LLFF) != null) {
            ykr.LJFF(textStickerData);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_emote_edit_page_leave");
        LIZ.LJIJJ(Long.valueOf(SystemClock.elapsedRealtime() - this.LJZL), "duration");
        LIZ.LJIJJ(str, "leave_type");
        C76883UFj c76883UFj4 = this.LJLIL;
        if (c76883UFj4 != null && (map = c76883UFj4.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                LIZ.LJIJJ(entry.getValue().toString(), entry.getKey());
            }
        }
        LIZ.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    public final Bitmap Al(YKR ykr) {
        if (ykr == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(ykr.getMeasuredWidth(), ykr.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(EF7.LIZIZ().getResources().getDisplayMetrics().densityDpi);
            if (ykr.getDrawingCacheBackgroundColor() != 0) {
                createBitmap.eraseColor(ykr.getDrawingCacheBackgroundColor());
            }
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-ykr.getScrollX(), -ykr.getScrollY());
            ykr.draw(canvas);
            RectF rectF = new RectF(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            if (this.LJLJLJ == null) {
                return createBitmap;
            }
            float width = createBitmap.getWidth() / rectF.width();
            float height = createBitmap.getHeight() / rectF.height();
            int i = (int) ((r7.left - rectF.left) * width);
            int i2 = 0;
            if (i < 0) {
                i = 0;
            }
            int i3 = (int) ((r7.top - rectF.top) * height);
            if (i3 >= 0) {
                i2 = i3;
            }
            int width2 = (int) (r7.width() * width);
            int width3 = createBitmap.getWidth() - i;
            if (width2 > width3) {
                width2 = width3;
            }
            int height2 = (int) (r7.height() * height);
            int height3 = createBitmap.getHeight() - i2;
            if (height2 > height3) {
                height2 = height3;
            }
            return Bitmap.createBitmap(createBitmap, i, i2, width2, height2);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void Dl(YKR ykr) {
        if (this.LJLLILLLL != null) {
            RectF helpRect = ykr.getHelpRect();
            float f = helpRect.right - helpRect.left;
            float f2 = helpRect.bottom - helpRect.top;
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.cor).getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = (int) helpRect.left;
                marginLayoutParams.topMargin = (int) helpRect.top;
            }
            layoutParams.width = (int) f;
            layoutParams.height = (int) f2;
            _$_findCachedViewById(R.id.cor).setLayoutParams(layoutParams);
            YKR ykr2 = this.LJLLILLLL;
            if (ykr2 != null) {
                ykr2.LJIILIIL(-((int) helpRect.left), -((int) helpRect.top));
            }
        }
    }

    public final void Gl(BZI bzi) {
        bzi.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
    }

    public final void Hl(Bitmap bitmap) {
        this.LJLILLLLZI = bitmap;
        this.LJLJI = bitmap;
        UGW ugw = (UGW) _$_findCachedViewById(R.id.kxn);
        if (ugw != null) {
            ugw.setIntercepter(new UG5(this));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.f12);
        if (appCompatImageView != null) {
            appCompatImageView.setImageBitmap(this.LJLILLLLZI);
        }
        float f = (this.LJZI / 2.0f) - ((this.LJLZ / 2) + this.LJLLLLLL);
        C56K c56k = new C56K();
        if (bitmap != null && this.LJLZ > 0) {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
            if (min > 0) {
                c56k.element = (((max * this.LJLZ) / min) - this.LJZ) / 2.0f;
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.j5o);
        if (relativeLayout != null) {
            C16880lQ.LJIJ(relativeLayout, new ACListenerS2S0200001_13(this, f, c56k, 1));
        }
        VA9 va9 = (VA9) _$_findCachedViewById(R.id.f8z);
        if (va9 != null) {
            va9.setImageBitmap(this.LJLJI);
        }
        C81091Vs7 c81091Vs7 = (C81091Vs7) _$_findCachedViewById(R.id.f12);
        if (c81091Vs7 != null) {
            c81091Vs7.setFirstReadyListener(new UG4(this, bitmap, f, c56k));
        }
    }

    public final void Il(YKR ykr) {
        int i;
        ((C6IQ) _$_findCachedViewById(R.id.l5b)).setTextStickerView(ykr);
        EditTextStickerViewModel editTextStickerViewModel = this.LJLLJ;
        if (editTextStickerViewModel != null) {
            editTextStickerViewModel.LJLJLLL = null;
            if (ykr == null) {
                C6IQ c6iq = (C6IQ) _$_findCachedViewById(R.id.l5b);
                EditTextStickerViewModel editTextStickerViewModel2 = this.LJLLJ;
                if (editTextStickerViewModel2 != null) {
                    c6iq.LIZLLL(editTextStickerViewModel2.Wz());
                    this.LJLLILLLL = null;
                    return;
                } else {
                    o.LJIJI("textStickerViewModel");
                    throw null;
                }
            }
            C6IQ c6iq2 = (C6IQ) _$_findCachedViewById(R.id.l5b);
            List<TextStickerTextWrap> textWrapList = ykr.getTextWrapList();
            int curMode = ykr.getCurMode();
            int curColor = ykr.getCurColor();
            int curAlignTxt = ykr.getCurAlignTxt();
            String curFontType = ykr.getCurFontType();
            TextStickerData data = ykr.getData();
            if (data != null) {
                i = data.getFontSize();
            } else {
                i = this.LJLJJLL;
            }
            EditTextStickerViewModel editTextStickerViewModel3 = this.LJLLJ;
            if (editTextStickerViewModel3 != null) {
                editTextStickerViewModel3.Wz();
                c6iq2.LJ(textWrapList, curMode, curColor, curAlignTxt, curFontType, false, i);
                return;
            } else {
                o.LJIJI("textStickerViewModel");
                throw null;
            }
        }
        o.LJIJI("textStickerViewModel");
        throw null;
    }

    @Override // X.UGH
    public final void keyBoardHide(int i) {
        boolean z = false;
        this.LLFFF = false;
        C6IQ c6iq = (C6IQ) _$_findCachedViewById(R.id.l5b);
        if (c6iq != null) {
            c6iq.LIZ();
        }
        YKR ykr = this.LJLLILLLL;
        if (ykr != null) {
            ykr.LIZLLL();
        }
        List<TextStickerTextWrap> textWrapList = ((C6IQ) _$_findCachedViewById(R.id.l5b)).getTextWrapList();
        o.LJIIIIZZ(textWrapList, "text_stick_input.textWrapList");
        if (V1M.LJJIJIIJI(textWrapList)) {
            YKR ykr2 = this.LJLLILLLL;
            if (ykr2 != null) {
                ykr2.getData();
                ykr2.LJIIJJI(((C6IQ) _$_findCachedViewById(R.id.l5b)).getCurTxtMode(), ((C6IQ) _$_findCachedViewById(R.id.l5b)).getCurColor(), ((C6IQ) _$_findCachedViewById(R.id.l5b)).getAlignTxt(), C6IH.LJ().LIZJ);
                ykr2.setFontSize(this.LJLJJLL);
                ykr2.setText(textWrapList);
                return;
            }
            TextStickerData textStickerData = new TextStickerData("", ((C6IQ) _$_findCachedViewById(R.id.l5b)).getCurTxtMode(), ((C6IQ) _$_findCachedViewById(R.id.l5b)).getCurColor(), ((C6IQ) _$_findCachedViewById(R.id.l5b)).getAlignTxt(), C6IH.LJ().LIZJ, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -32, 511, null);
            Point editInputScreenCenterPoint = ((C6IQ) _$_findCachedViewById(R.id.l5b)).getEditInputScreenCenterPoint();
            o.LJIIIIZZ(editInputScreenCenterPoint, "text_stick_input.editInputScreenCenterPoint");
            textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
            textStickerData.setTextWrapList(textWrapList);
            textStickerData.setFontSize(this.LJLJJLL);
            if (textStickerData.isCaption()) {
                z = true;
            }
            boolean z2 = !z;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            SafeHandler safeHandler = this.LJLL;
            if (safeHandler != null) {
                vl(new YKR(mo49getActivity, safeHandler, textStickerData, z2, new UGG(this)));
                return;
            } else {
                o.LJIJI("safeHandler");
                throw null;
            }
        }
        YKR ykr3 = this.LJLLILLLL;
        if (ykr3 != null) {
            EditTextStickerViewModel editTextStickerViewModel = this.LJLLJ;
            if (editTextStickerViewModel != null) {
                editTextStickerViewModel.Tv0(ykr3);
            } else {
                o.LJIJI("textStickerViewModel");
                throw null;
            }
        }
        this.LJLLILLLL = null;
    }

    @Override // X.UGH
    public final void keyBoardShow(int i) {
        this.LLFFF = true;
        C6IQ c6iq = (C6IQ) _$_findCachedViewById(R.id.l5b);
        if (c6iq != null) {
            c6iq.LIZJ();
        }
        C6IQ c6iq2 = (C6IQ) _$_findCachedViewById(R.id.l5b);
        if (c6iq2 != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c6iq2.LJLLILLLL.getLayoutParams();
            layoutParams.bottomMargin = i;
            c6iq2.LJLLILLLL.setLayoutParams(layoutParams);
        }
        YKR ykr = this.LJLLILLLL;
        if (ykr != null) {
            ykr.LIZJ();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final void vl(YKR ykr) {
        EditTextStickerViewModel editTextStickerViewModel = this.LJLLJ;
        if (editTextStickerViewModel != null) {
            editTextStickerViewModel.Kv0(ykr);
            ykr.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            _$_findCachedViewById(R.id.cor).setVisibility(0);
            ((ViewGroup) _$_findCachedViewById(R.id.dh7)).addView(ykr);
            this.LJLLILLLL = ykr;
            ykr.setOnEditClickListener(new UGA(this));
            ykr.setMotionInterceptor(new UG9(this, ykr));
            ykr.LJIILIIL(0, 0);
            EditTextStickerViewModel editTextStickerViewModel2 = this.LJLLJ;
            if (editTextStickerViewModel2 != null) {
                editTextStickerViewModel2.T3();
                YKR ykr2 = this.LJLLILLLL;
                if (ykr2 != null) {
                    ykr2.setEditModeListener(this.LLFZ);
                }
                View _$_findCachedViewById = _$_findCachedViewById(R.id.dh7);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.post(new ARunnableS32S0200000_13(this, ykr, 40));
                    return;
                }
                return;
            }
            o.LJIJI("textStickerViewModel");
            throw null;
        }
        o.LJIJI("textStickerViewModel");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        UG0 ug0;
        Uri uri;
        String str;
        C76881UFh c76881UFh;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJZL = SystemClock.elapsedRealtime();
        C61713OJx LIZ = C61712OJw.LIZ(this);
        LIZ.LIZIZ.LJIIL();
        LIZ.LIZJ();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getDecorView().setFitsSystemWindows(false);
            window.setSoftInputMode(48);
            window.getDecorView().setSystemUiVisibility(1024);
        }
        UGE uge = new UGE(mo49getActivity());
        uge.LIZJ = this;
        View view2 = uge.LIZ;
        if (view2 != null && uge.LJ != null) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(uge.LJ);
        }
        this.LJLJLLL = uge;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Bitmap bitmap = null;
        if (mo49getActivity != null) {
            JediViewModel LIZ2 = C165616ej.LIZIZ(this).LIZ(EditTextStickerViewModel.class);
            o.LJIIIIZZ(LIZ2, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.LJLLJ = (EditTextStickerViewModel) LIZ2;
            this.LJLLL = new Rect(0, 0, C81184Vtc.LJ(mo49getActivity), C81184Vtc.LIZLLL(mo49getActivity));
            this.LJLL = new SafeHandler(mo49getActivity);
            EditTextStickerViewModel editTextStickerViewModel = this.LJLLJ;
            if (editTextStickerViewModel != null) {
                this.LJLLI = new YKU(editTextStickerViewModel);
                C6VC LJIILIIL = C78897Uxp.LJIILIIL(mo49getActivity, (ViewGroup) _$_findCachedViewById(R.id.cor));
                YKU yku = this.LJLLI;
                if (yku != null) {
                    LJIILIIL.LIZIZ(new C6V4(200, yku));
                } else {
                    o.LJIJI("gestureListener");
                    throw null;
                }
            } else {
                o.LJIJI("textStickerViewModel");
                throw null;
            }
        }
        if (getContext() != null) {
            this.LJLLLL = (int) B9K.LIZ(getContext(), 12.0f);
            this.LJLLLLLL = (int) B9K.LIZ(getContext(), 93.0f);
            this.LJLZ = C81184Vtc.LJ(getContext()) - (this.LJLLLL * 2);
            this.LJZ = C81184Vtc.LJ(getContext());
            this.LJZI = C81184Vtc.LIZLLL(getContext());
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.meq).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = this.LJLLLLLL + this.LJLZ + ((int) B9K.LIZ(getContext(), 24.0f));
            C76883UFj c76883UFj = this.LJLIL;
            if (c76883UFj != null && c76883UFj.LIZLLL == 2) {
                _$_findCachedViewById(R.id.meq).setVisibility(8);
                _$_findCachedViewById(R.id.j59).setVisibility(8);
            }
            ((C6D9) _$_findCachedViewById(R.id.kg_)).LJ();
            UGS ugs = (UGS) _$_findCachedViewById(R.id.i24);
            ugs.LJLJJL = 0;
            ugs.LJLJJLL = 0.54545456f;
            ugs.LJLJJI = this.LJLLLL;
            ugs.LJLLJ = B9K.LIZ(ugs.getContext(), 8.0f);
            ugs.postDelayed(new ARunnableS49S0100000_13(this, 20), 5000L);
            ugs.addOnLayoutChangeListener(new IDCListenerS259S0100000_13(this, 2));
            ((C81091Vs7) _$_findCachedViewById(R.id.f12)).setEnableDoubleTap(false);
            C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.auv), new ACListenerS33S0100000_13(this, 13));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.avw), new ACListenerS33S0100000_13(this, 14));
            C76883UFj c76883UFj2 = this.LJLIL;
            if (c76883UFj2 != null && c76883UFj2.LJI) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ((ImageView) _$_findCachedViewById(R.id.avs)).setVisibility(0);
            }
            C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.avs), new ACListenerS33S0100000_13(this, 15));
            ((C6IQ) _$_findCachedViewById(R.id.l5b)).setTextStickerUpdateListener(new UG2(this));
            C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.j5y), new ACListenerS33S0100000_13(this, 16));
            _$_findCachedViewById(R.id.j5y).postDelayed(new ARunnableS49S0100000_13(this, 22), 100L);
            C15490jB.LJ(_$_findCachedViewById(R.id.eye), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_outside_demand_1"), "ttlive_subcribe_emote_preview_avatar.png");
        }
        C76883UFj c76883UFj3 = this.LJLIL;
        if (c76883UFj3 != null && (ug0 = c76883UFj3.LIZJ) != null) {
            int i = C76898UFy.LIZ[ug0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C76883UFj c76883UFj4 = this.LJLIL;
                            if (c76883UFj4 == null || (c76881UFh = c76883UFj4.LJIIJ) == null) {
                                return;
                            }
                            Hl(c76881UFh.LIZJ);
                            Object obj = c76881UFh.LIZLLL;
                            if (!(obj instanceof YKR)) {
                                return;
                            }
                            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.live.livehostimpl.edit.view.TextStickerView");
                            YKR ykr = (YKR) obj;
                            this.LLFF = ykr;
                            this.LLF = ykr.LIZIZ().m138clone();
                            vl(ykr);
                            return;
                        }
                    } else {
                        C76883UFj c76883UFj5 = this.LJLIL;
                        if (c76883UFj5 == null || (str = c76883UFj5.LJIIIZ) == null) {
                            return;
                        }
                        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                        LJIIIIZZ.getClass();
                        LJIIIIZZ.LIZJ = mo49getActivity();
                        LJIIIIZZ.LJIIIZ(new IDdS504S0100000_13(this, 5));
                        return;
                    }
                } else {
                    C76883UFj c76883UFj6 = this.LJLIL;
                    if (c76883UFj6 == null || (uri = c76883UFj6.LJIIIIZZ) == null) {
                        return;
                    }
                    W5F LJFF = W5U.LJFF(uri);
                    LJFF.LIZJ = mo49getActivity();
                    LJFF.LJIIIZ(new IDdS504S0100000_13(this, 4));
                    return;
                }
            } else {
                C76883UFj c76883UFj7 = this.LJLIL;
                if (c76883UFj7 != null) {
                    bitmap = c76883UFj7.LJII;
                }
                Hl(bitmap);
                return;
            }
        }
        C76883UFj c76883UFj8 = this.LJLIL;
        if (c76883UFj8 != null) {
            bitmap = c76883UFj8.LJII;
        }
        Hl(bitmap);
    }

    public final Bitmap wl(C81091Vs7 c81091Vs7, Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        RectF LIZJ = c81091Vs7.LIZJ(null);
        if (this.LJLJLJ == null) {
            return bitmap;
        }
        float width = bitmap.getWidth() / LIZJ.width();
        float height = bitmap.getHeight() / LIZJ.height();
        int i = (int) ((r6.left - LIZJ.left) * width);
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        int i3 = (int) ((r6.top - LIZJ.top) * height);
        if (i3 >= 0) {
            i2 = i3;
        }
        int width2 = (int) (r6.width() * width);
        int width3 = bitmap.getWidth() - i;
        if (width2 > width3) {
            width2 = width3;
        }
        int height2 = (int) (r6.height() * height);
        int height3 = bitmap.getHeight() - i2;
        if (height2 > height3) {
            height2 = height3;
        }
        try {
            return Bitmap.createBitmap(bitmap, i, i2, width2, height2);
        } catch (Exception unused) {
            return bitmap;
        }
    }

    public final Bitmap xl(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3 = this.LJLJI;
        if (bitmap != null) {
            Bitmap bitmap4 = this.LJLJJL;
            if (bitmap2 != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, bitmap.getWidth(), bitmap.getHeight(), true);
                o.LJIIIIZZ(createScaledBitmap, "Bitmap.createScaledBitma…s, width, height, filter)");
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(bitmap, new Matrix(), null);
                canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, (Paint) null);
                return createBitmap;
            }
            return bitmap4;
        }
        return bitmap3;
    }
}
