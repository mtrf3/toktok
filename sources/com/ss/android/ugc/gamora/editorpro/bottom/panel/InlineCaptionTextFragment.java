package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C0A2;
import X.C109824Ss;
import X.C10A;
import X.C123464sw;
import X.C1280450u;
import X.C132815Jd;
import X.C141335gf;
import X.C152515yh;
import X.C16880lQ;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C40675Fxn;
import X.C5FC;
import X.C5G0;
import X.C62905OmT;
import X.C62906OmU;
import X.C68W;
import X.C69P;
import X.C69T;
import X.C6DT;
import X.C76800UCe;
import X.C78841Uwv;
import X.C78866UxK;
import X.C79057V0z;
import X.C81184Vtc;
import X.C83547Wqd;
import X.C90903hW;
import X.C9KF;
import X.EnumC132095Gj;
import X.H78;
import X.H8F;
import X.InterfaceC124924vI;
import X.InterfaceC127784zu;
import X.InterfaceC83564Wqu;
import X.KL2;
import X.X1D;
import Y.AObserverS70S0100000_2;
import Y.IDCListenerS156S0100000_2;
import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionTextFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class InlineCaptionTextFragment extends TTResourcePanelFragment<InlineCaptionTextViewModel> implements C69T {
    public final VideoPublishEditModel LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final String LJZL;
    public final String LL;
    public C69P LLD;
    public InputMethodManager LLF;
    public C83547Wqd LLFF;
    public RecyclerView LLFFF;
    public C252709vu LLFII;
    public C152515yh LLFZ;
    public C123464sw LLI;
    public boolean LLII;
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();
    public final ArrayList<NLETrackSlot> LLIFFJFJJ = new ArrayList<>();
    public Long LLIIII = 0L;

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "inline_caption_text";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIILZ;
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
        return R.layout.asa;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        if (this.LLII) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            C62905OmT c62905OmT = new C62905OmT(mo49getActivity);
            c62905OmT.LIZ(R.string.bwx);
            c62905OmT.LJIIJ(R.string.bwu, new IDCListenerS156S0100000_2(this, 11));
            c62905OmT.LJII(R.string.cg_, null);
            new C62906OmU(c62905OmT).LIZLLL();
            return;
        }
        C79057V0z.LJJJJL(Jl(), "quit_edit_caption_text", this.LLIIII);
        mm();
        Hl();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        int startTime;
        if (this.LLII) {
            C79057V0z.LJIIL(Jl());
        }
        NLETrack LIZLLL = C5FC.LIZLLL(C79057V0z.LJJI(Jl()));
        if (LIZLLL != null) {
            Iterator<NLETrackSlot> it = LIZLLL.LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                String extra = next.getExtra("text");
                if (extra == null || extra.length() == 0) {
                    NLETrack LIZLLL2 = C5FC.LIZLLL(C79057V0z.LJJI(Jl()));
                    if (LIZLLL2 != null) {
                        LIZLLL2.LJIJJLI(next);
                    }
                }
            }
        }
        VideoPublishEditModel em = em();
        if (em != null) {
            H8F.LJJJ(1, em, this.LL, this.LLII);
        }
        InterfaceC127784zu player = Jl().getPlayer();
        player.J9();
        player.pause();
        if (AnonymousClass636.LJIILLIIL(Jl(), null, null) == null) {
            this.LJLJI = false;
        }
        C69P c69p = this.LLD;
        if (c69p != null) {
            int i = c69p.LJLL;
            if (i == -1 || i >= c69p.LJLJL.size()) {
                startTime = ((TextStickerData) ListProtector.get(c69p.LJLJL, 0)).getStartTime();
            } else {
                startTime = ((TextStickerData) ListProtector.get(c69p.LJLJL, c69p.LJLL)).getStartTime();
            }
            this.LLIIII = Long.valueOf(startTime);
            C79057V0z.LJJJJL(Jl(), "quit_edit_caption_text", this.LLIIII);
            mm();
            Hl();
            return;
        }
        o.LJIJI("captionEditAdapter");
        throw null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        o.LJIIIIZZ(requireActivity(), "requireActivity()");
        return C5G0.LIZ(InlineCaptionTextViewModel.class);
    }

    public final void mm() {
        View currentFocus;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (currentFocus = mo49getActivity.getCurrentFocus()) != null) {
            InputMethodManager inputMethodManager = this.LLF;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            } else {
                o.LJIJI("imManager");
                throw null;
            }
        }
    }

    public final void nm() {
        NLETrack LIZLLL = C5FC.LIZLLL(C79057V0z.LJJI(Jl()));
        if (LIZLLL != null) {
            Iterator<NLETrackSlot> it = LIZLLL.LJIILL().iterator();
            while (it.hasNext()) {
                this.LLIFFJFJJ.add(it.next());
            }
        }
        ArrayList<NLETrackSlot> arrayList = this.LLIFFJFJJ;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(17));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C83547Wqd c83547Wqd = this.LLFF;
        if (c83547Wqd != null) {
            c83547Wqd.LIZ();
        } else {
            o.LJIJI("keyBoardListener");
            throw null;
        }
    }

    @Override // X.C69T
    public final void Mc(TextStickerData textStickerData) {
        NLETrackSlot LIZ;
        C123464sw c123464sw = this.LLI;
        NLEModel nLEModel = null;
        if (c123464sw != null) {
            String lm = lm(textStickerData.getStartTime(), textStickerData.getEndTime());
            if (lm == null) {
                lm = "";
            }
            String textStr = textStickerData.getTextStr();
            o.LJI(textStr);
            InterfaceC124924vI interfaceC124924vI = c123464sw.LIZ;
            if (interfaceC124924vI != null) {
                nLEModel = C79057V0z.LJJI(interfaceC124924vI);
            }
            NLETrack LIZLLL = C5FC.LIZLLL(nLEModel);
            if (LIZLLL != null && (LIZ = C123464sw.LIZ(LIZLLL, lm)) != null) {
                String extra = LIZ.getExtra("text_sticker_data");
                o.LJIIIIZZ(extra, "it.getExtra(KEY_TEXT_STICKER_DATA_FOR_SLOT)");
                TextStickerData LIZIZ = C132815Jd.LIZIZ(extra);
                C78841Uwv.LJJJJJL(LIZIZ, textStr, c123464sw.LIZIZ);
                LIZ.setExtra("text_sticker_data", C132815Jd.LIZLLL(LIZIZ));
                LIZ.setExtra("text_wrap_list", C132815Jd.LJ(LIZIZ.getTextWrapList()));
                LIZ.setExtra("text", C68W.LJII(LIZIZ.getTextWrapList()));
                LIZ.setExtra("text_inline_styles", "");
            }
            H78.LIZ("InlineCaptionTextFragment -> updateCaptionText -> hasEdited = true");
            this.LLII = true;
            return;
        }
        o.LJIJI("captionTrackSlotHelper");
        throw null;
    }

    @Override // X.C69T
    public final void Wa(C6DT editText) {
        o.LJIIIZ(editText, "editText");
        InputMethodManager inputMethodManager = this.LLF;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        } else {
            o.LJIJI("imManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Object obj;
        super.onActivityCreated(bundle);
        if (C1280450u.LIZ()) {
            Long l = (Long) C79057V0z.LJJIIJ(Jl(), "video_position_event");
            this.LLIIII = l;
            if (l != null) {
                this.LLIIII = Long.valueOf(l.longValue() / 1000);
            }
            nm();
            EditorProContext Jl = Jl();
            Context context = getContext();
            o.LJI(context);
            this.LLI = new C123464sw(Jl, context, this.LJLZ);
            this.LLD = new C69P(this.LJLZ, Jl(), this.LJZL, this.LL, this);
            RecyclerView recyclerView = this.LLFFF;
            if (recyclerView != null) {
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                C69P c69p = this.LLD;
                if (c69p != null) {
                    recyclerView.setAdapter(c69p);
                    recyclerView.LJII(new C152515yh((int) KL2.LIZJ(recyclerView.getContext(), 0.0f), (int) KL2.LIZJ(recyclerView.getContext(), 40.0f)), -1);
                    recyclerView.setItemAnimator(null);
                    RecyclerView recyclerView2 = this.LLFFF;
                    if (recyclerView2 != null) {
                        C0A2 layoutManager = recyclerView2.getLayoutManager();
                        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        ((LinearLayoutManager) layoutManager).LJFF(0, (int) KL2.LIZJ(mo49getActivity(), 100.0f));
                        C252709vu c252709vu = this.LLFII;
                        if (c252709vu != null) {
                            c252709vu.setNavBackground(255);
                            C252709vu c252709vu2 = this.LLFII;
                            if (c252709vu2 != null) {
                                C235119Kp c235119Kp = new C235119Kp();
                                AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
                                C234509Ig c234509Ig = new C234509Ig();
                                Context context2 = getContext();
                                if (context2 == null || (str = context2.getString(R.string.cg_)) == null) {
                                    str = "Cancel";
                                }
                                c234509Ig.LIZJ = str;
                                c234509Ig.LJ = true;
                                c234509Ig.LIZ = new C109824Ss(new AqS152S0100000_2(this, 955));
                                abstractC234519IhArr[0] = c234509Ig;
                                c235119Kp.LIZLLL(abstractC234519IhArr);
                                AbstractC234519Ih[] abstractC234519IhArr2 = new AbstractC234519Ih[1];
                                C234509Ig c234509Ig2 = new C234509Ig();
                                Context context3 = getContext();
                                if (context3 == null || (str2 = context3.getString(R.string.q8h)) == null) {
                                    str2 = "Save";
                                }
                                c234509Ig2.LIZJ = str2;
                                c234509Ig2.LJ = true;
                                c234509Ig2.LIZ = new C109824Ss(new AqS152S0100000_2(this, 956));
                                abstractC234519IhArr2[0] = c234509Ig2;
                                c235119Kp.LIZIZ(abstractC234519IhArr2);
                                C9KF c9kf = new C9KF();
                                Context context4 = getContext();
                                if (context4 == null || (str3 = context4.getString(R.string.bwv)) == null) {
                                    str3 = "Edit captions";
                                }
                                c9kf.LIZJ = str3;
                                c235119Kp.LIZJ = c9kf;
                                c252709vu2.setNavActions(c235119Kp);
                                ActivityC45651qj mo49getActivity = mo49getActivity();
                                if (mo49getActivity != null) {
                                    obj = C16880lQ.LLILLJJLI(mo49getActivity, "input_method");
                                } else {
                                    obj = null;
                                }
                                o.LJII(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                this.LLF = (InputMethodManager) obj;
                                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                                o.LJI(mo49getActivity2);
                                C83547Wqd LJIIJ = C78866UxK.LJIIJ(mo49getActivity2);
                                this.LLFF = LJIIJ;
                                LJIIJ.LIZIZ(new InterfaceC83564Wqu() { // from class: X.5mP
                                    @Override // X.InterfaceC83564Wqu
                                    public final void keyBoardModify(int i) {
                                    }

                                    @Override // X.InterfaceC83564Wqu
                                    public final void keyBoardHide(int i) {
                                        InlineCaptionTextFragment inlineCaptionTextFragment = InlineCaptionTextFragment.this;
                                        C152515yh c152515yh = inlineCaptionTextFragment.LLFZ;
                                        if (c152515yh != null) {
                                            RecyclerView recyclerView3 = inlineCaptionTextFragment.LLFFF;
                                            if (recyclerView3 != null) {
                                                recyclerView3.LJJLIL(c152515yh);
                                                inlineCaptionTextFragment.LLFZ = null;
                                            } else {
                                                o.LJIJI("editRecyclerView");
                                                throw null;
                                            }
                                        }
                                        InlineCaptionTextFragment.this.getClass();
                                    }

                                    @Override // X.InterfaceC83564Wqu
                                    public final void keyBoardShow(int i) {
                                        InlineCaptionTextFragment inlineCaptionTextFragment = InlineCaptionTextFragment.this;
                                        if (inlineCaptionTextFragment.LLFZ == null) {
                                            inlineCaptionTextFragment.LLFZ = new C152515yh(0, i);
                                            InlineCaptionTextFragment inlineCaptionTextFragment2 = InlineCaptionTextFragment.this;
                                            RecyclerView recyclerView3 = inlineCaptionTextFragment2.LLFFF;
                                            if (recyclerView3 != null) {
                                                C152515yh c152515yh = inlineCaptionTextFragment2.LLFZ;
                                                o.LJI(c152515yh);
                                                recyclerView3.LJII(c152515yh, -1);
                                                RecyclerView recyclerView4 = InlineCaptionTextFragment.this.LLFFF;
                                                if (recyclerView4 != null) {
                                                    C0A2 layoutManager2 = recyclerView4.getLayoutManager();
                                                    o.LJII(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                                                    InlineCaptionTextFragment inlineCaptionTextFragment3 = InlineCaptionTextFragment.this;
                                                    C69P c69p2 = inlineCaptionTextFragment3.LLD;
                                                    if (c69p2 != null) {
                                                        linearLayoutManager.LJFF(c69p2.LJLL, (int) KL2.LIZJ(inlineCaptionTextFragment3.mo49getActivity(), 100.0f));
                                                    } else {
                                                        o.LJIJI("captionEditAdapter");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("editRecyclerView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("editRecyclerView");
                                                throw null;
                                            }
                                        }
                                        InlineCaptionTextFragment.this.getClass();
                                    }
                                });
                                C69P c69p2 = this.LLD;
                                if (c69p2 != null) {
                                    ArrayList<NLETrackSlot> captionList = this.LLIFFJFJJ;
                                    int i = this.LJZ;
                                    int i2 = this.LJZI;
                                    o.LJIIIZ(captionList, "captionList");
                                    c69p2.LJLJL.clear();
                                    Iterator<NLETrackSlot> it = captionList.iterator();
                                    while (it.hasNext()) {
                                        c69p2.LJLJL.add(AnonymousClass636.LJIL(it.next()));
                                    }
                                    c69p2.LJLL = i;
                                    c69p2.LJLLJ = i2;
                                    c69p2.notifyDataSetChanged();
                                    InputMethodManager inputMethodManager = this.LLF;
                                    if (inputMethodManager != null) {
                                        inputMethodManager.toggleSoftInput(0, 2);
                                        _$_findCachedViewById(R.id.c5z).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        _$_findCachedViewById(R.id.c60).setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                                        View _$_findCachedViewById = _$_findCachedViewById(R.id.a6v);
                                        if (_$_findCachedViewById != null) {
                                            _$_findCachedViewById.setVisibility(4);
                                        }
                                        _$_findCachedViewById(R.id.c62).setVisibility(8);
                                        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 306));
                                        return;
                                    }
                                    o.LJIJI("imManager");
                                    throw null;
                                }
                                o.LJIJI("captionEditAdapter");
                                throw null;
                            }
                            o.LJIJI("navBar");
                            throw null;
                        }
                        o.LJIJI("navBar");
                        throw null;
                    }
                    o.LJIJI("editRecyclerView");
                    throw null;
                }
                o.LJIJI("captionEditAdapter");
                throw null;
            }
            o.LJIJI("editRecyclerView");
            throw null;
        }
    }

    @Override // X.C69T
    public final void kd(TextStickerData textStickerData, TextStickerData textStickerData2) {
        NLEModel nLEModel;
        NLETrackSlot nLETrackSlot;
        long endTime;
        String extra;
        C123464sw c123464sw = this.LLI;
        NLEModel nLEModel2 = null;
        if (c123464sw != null) {
            String lm = lm(textStickerData.getStartTime(), textStickerData.getEndTime());
            String str = "";
            if (lm == null) {
                lm = "";
            }
            String lm2 = lm(textStickerData2.getStartTime(), textStickerData2.getEndTime());
            if (lm2 == null) {
                lm2 = "";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CaptionTrackSlotHelper -> mergeCaptionSlot-> firstUuid = ");
            LIZ.append(lm);
            LIZ.append(", secondUuid = ");
            LIZ.append(lm2);
            H78.LIZ(X1D.LIZIZ(LIZ));
            if (lm.length() != 0 && lm2.length() != 0) {
                InterfaceC124924vI interfaceC124924vI = c123464sw.LIZ;
                if (interfaceC124924vI != null) {
                    nLEModel = C79057V0z.LJJI(interfaceC124924vI);
                } else {
                    nLEModel = null;
                }
                NLETrack LIZLLL = C5FC.LIZLLL(nLEModel);
                if (LIZLLL != null) {
                    nLETrackSlot = C123464sw.LIZ(LIZLLL, lm2);
                } else {
                    nLETrackSlot = null;
                }
                H78.LIZ("CaptionTrackSlotHelper -> secondSlot");
                InterfaceC124924vI interfaceC124924vI2 = c123464sw.LIZ;
                if (interfaceC124924vI2 != null) {
                    nLEModel2 = C79057V0z.LJJI(interfaceC124924vI2);
                }
                NLETrack LIZLLL2 = C5FC.LIZLLL(nLEModel2);
                if (LIZLLL2 != null) {
                    NLETrackSlot LIZ2 = C123464sw.LIZ(LIZLLL2, lm);
                    if (LIZ2 != null) {
                        if (nLETrackSlot != null) {
                            endTime = nLETrackSlot.getEndTime();
                        } else {
                            endTime = LIZ2.getEndTime();
                        }
                        LIZ2.setEndTime(endTime);
                        String extra2 = LIZ2.getExtra("text_sticker_data");
                        o.LJIIIIZZ(extra2, "it.getExtra(KEY_TEXT_STICKER_DATA_FOR_SLOT)");
                        TextStickerData LIZIZ = C132815Jd.LIZIZ(extra2);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LIZIZ.getTextStr());
                        if (nLETrackSlot != null && (extra = nLETrackSlot.getExtra("text_sticker_data")) != null) {
                            str = extra;
                        }
                        LIZ3.append(C132815Jd.LIZIZ(str).getTextStr());
                        String LIZIZ2 = X1D.LIZIZ(LIZ3);
                        LIZIZ.setEndTime(((int) LIZ2.getEndTime()) / 1000);
                        C78841Uwv.LJJJJJL(LIZIZ, LIZIZ2, c123464sw.LIZIZ);
                        LIZ2.setExtra("text_sticker_data", C132815Jd.LIZLLL(LIZIZ));
                        LIZ2.setExtra("text_wrap_list", C132815Jd.LJ(LIZIZ.getTextWrapList()));
                        LIZ2.setExtra("text", C68W.LJII(LIZIZ.getTextWrapList()));
                    }
                    LIZLLL2.LJIJJLI(nLETrackSlot);
                }
            }
            H78.LIZ("InlineCaptionTextFragment -> mergerCaption -> hasEdited = true");
            this.LLII = true;
            nm();
            return;
        }
        o.LJIJI("captionTrackSlotHelper");
        throw null;
    }

    public final String lm(int i, int i2) {
        NLETrackSlot nLETrackSlot;
        NLENode nLENode;
        Iterator<NLETrackSlot> it = this.LLIFFJFJJ.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrackSlot = it.next();
                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                long j = 1000;
                if (nLETrackSlot2.getStartTime() / j == i && nLETrackSlot2.getEndTime() / j == i2) {
                    break;
                }
            } else {
                nLETrackSlot = null;
                break;
            }
        }
        NLETrackSlot nLETrackSlot3 = nLETrackSlot;
        if (nLETrackSlot3 == null || (nLENode = (NLENode) NLESegmentTextSticker.class.getMethod("LJFF", NLENode.class).invoke(null, nLETrackSlot3.LJI())) == null) {
            return null;
        }
        return nLENode.getUUID();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (onCreateView != null) {
            View findViewById = onCreateView.findViewById(R.id.cpj);
            o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.edit_recycler_view)");
            this.LLFFF = (RecyclerView) findViewById;
            View findViewById2 = onCreateView.findViewById(R.id.agl);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.bar)");
            this.LLFII = (C252709vu) findViewById2;
        }
        C29S c29s = null;
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

    @Override // X.C69T
    public final void gi(int i, int i2, TextStickerData textStickerData, TextStickerData textStickerData2) {
        Number valueOf;
        Number valueOf2;
        InterfaceC127784zu player;
        C123464sw c123464sw = this.LLI;
        NLEModel nLEModel = null;
        if (c123464sw != null) {
            String lm = lm(i, i2);
            String str = "";
            if (lm == null) {
                lm = "";
            }
            InterfaceC124924vI interfaceC124924vI = c123464sw.LIZ;
            if (interfaceC124924vI != null && (player = interfaceC124924vI.getPlayer()) != null) {
                player.pause();
            }
            InterfaceC124924vI interfaceC124924vI2 = c123464sw.LIZ;
            if (interfaceC124924vI2 != null) {
                nLEModel = C79057V0z.LJJI(interfaceC124924vI2);
            }
            NLETrack LIZLLL = C5FC.LIZLLL(nLEModel);
            if (LIZLLL != null) {
                NLETrackSlot LIZ = C123464sw.LIZ(LIZLLL, lm);
                if (LIZ != null) {
                    LIZ.setEndTime(textStickerData.getEndTime() * 1000);
                    String extra = LIZ.getExtra("text_sticker_data");
                    o.LJIIIIZZ(extra, "it.getExtra(KEY_TEXT_STICKER_DATA_FOR_SLOT)");
                    TextStickerData LIZIZ = C132815Jd.LIZIZ(extra);
                    String textStr = textStickerData.getTextStr();
                    if (textStr != null) {
                        str = textStr;
                    }
                    C78841Uwv.LJJJJJL(LIZIZ, str, c123464sw.LIZIZ);
                    LIZIZ.setEndTime(textStickerData.getEndTime());
                    LIZ.setExtra("text_sticker_data", C132815Jd.LIZLLL(LIZIZ));
                    LIZ.setExtra("text", LIZIZ.getTextStr());
                    LIZ.setExtra("text_wrap_list", C132815Jd.LJ(LIZIZ.getTextWrapList()));
                }
                EnumC132095Gj enumC132095Gj = EnumC132095Gj.EditorProAddNew;
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                VideoPublishEditModel videoPublishEditModel = c123464sw.LIZJ;
                if (videoPublishEditModel != null) {
                    valueOf = Float.valueOf(videoPublishEditModel.textLayoutHeight);
                } else {
                    valueOf = Integer.valueOf(C81184Vtc.LIZLLL(c123464sw.LIZIZ));
                }
                int intValue = valueOf.intValue();
                VideoPublishEditModel videoPublishEditModel2 = c123464sw.LIZJ;
                if (videoPublishEditModel2 != null) {
                    valueOf2 = Float.valueOf(videoPublishEditModel2.textLayoutWidth);
                } else {
                    valueOf2 = Integer.valueOf(C81184Vtc.LIZLLL(c123464sw.LIZIZ));
                }
                int intValue2 = valueOf2.intValue();
                nLETrackSlot.setExtra("text_slot_type", "SUBTITLE");
                InterfaceC124924vI interfaceC124924vI3 = c123464sw.LIZ;
                o.LJII(interfaceC124924vI3, "null cannot be cast to non-null type com.ss.ugc.android.editor.core.EditorProContext");
                C132815Jd.LIZ(nLETrackSlot, textStickerData2, enumC132095Gj, intValue2, intValue, (EditorProContext) interfaceC124924vI3, false);
                long j = 1000;
                nLETrackSlot.setStartTime(textStickerData2.getStartTime() * j);
                nLETrackSlot.setEndTime(textStickerData2.getEndTime() * j);
                LIZLLL.LIZIZ(nLETrackSlot);
            }
            H78.LIZ("InlineCaptionTextFragment -> splitCaption -> hasEdited = true");
            this.LLII = true;
            nm();
            return;
        }
        o.LJIJI("captionTrackSlotHelper");
        throw null;
    }

    public InlineCaptionTextFragment(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        this.LJLZ = videoPublishEditModel;
        this.LJZ = i;
        this.LJZI = i2;
        this.LJZL = str;
        this.LL = str2;
    }
}
