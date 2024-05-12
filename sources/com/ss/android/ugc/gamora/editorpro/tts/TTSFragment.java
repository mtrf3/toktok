package com.ss.android.ugc.gamora.editorpro.tts;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C1280450u;
import X.C1289954l;
import X.C134215On;
import X.C137665ak;
import X.C137695an;
import X.C137705ao;
import X.C137725aq;
import X.C137905b8;
import X.C137935bB;
import X.C138735cT;
import X.C139795eB;
import X.C141585h4;
import X.C142135hx;
import X.C146035oF;
import X.C167496hl;
import X.C16880lQ;
import X.C1B6;
import X.C221108m2;
import X.C47261Igj;
import X.C48841JEv;
import X.C55V;
import X.C5G0;
import X.C5QW;
import X.C5X5;
import X.C62822Ol8;
import X.C64962gm;
import X.C68E;
import X.C6YK;
import X.C73305Spp;
import X.C78613UtF;
import X.C78915Uy7;
import X.C78920UyC;
import X.C79057V0z;
import X.EnumC123864ta;
import X.EnumC126814yL;
import X.H7R;
import X.HG3;
import X.InterfaceC141575h3;
import X.InterfaceC142155hz;
import X.OQY;
import X.OSZ;
import X.OUP;
import X.ProgressDialogC173696rl;
import X.RBX;
import X.XKX;
import Y.ARunnableS38S0100000_2;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class TTSFragment extends TTResourcePanelFragment<CutViewModel> implements InterfaceC141575h3 {
    public String LJZI;
    public NLETrackSlot LJZL;
    public C55V LL;
    public ProgressDialogC173696rl LLFF;
    public C73305Spp LLFII;
    public LinearLayout LLIFFJFJJ;
    public C142135hx LLII;
    public SafeHandler LLIIIILZ;
    public boolean LLIIIZ;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public String LLIILZL;
    public int LLILII;
    public boolean LLILIL;
    public EditRepeatMusicPlayer LLILL;
    public final Map<Integer, View> LLILLIZIL = new LinkedHashMap();
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C1289954l.LJLIL);
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(C5X5.LJLIL);
    public final HashMap<C137695an, OSZ<File, Integer>> LLD = new HashMap<>(20);
    public String LLF = "";
    public long LLFFF = System.currentTimeMillis();
    public final ArrayList<ReadTextEffectBean> LLFZ = new ArrayList<>();
    public final ArrayList<C141585h4> LLI = new ArrayList<>();
    public int LLIIII = -1;
    public String LLIIIJ = "autoCheckSpeakID";
    public final OQY LLIIIL = OQY.INSTANCE;
    public final C137905b8 LLIIJI = C137905b8.LJLIL;
    public final C64962gm LLIIZ = C48841JEv.LIZIZ();
    public C64962gm LLIL = C48841JEv.LIZIZ();

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "tts_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILLIZIL).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILLIZIL;
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

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.at4;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        C139795eB c139795eB;
        if (this.LLIIJLIL) {
            c139795eB = new C139795eB(EnumC126814yL.APPLY_TO_ALL.getNameId(), "", "", null, null, 24);
        } else {
            c139795eB = new C139795eB(EnumC126814yL.TEXT_TO_SPEECH.getNameId(), "", "", null, null, 24);
        }
        return C6YK.LIZ(c139795eB);
    }

    @Override // X.InterfaceC141575h3
    public final void Jc() {
        EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLILL;
        if (editRepeatMusicPlayer != null) {
            editRepeatMusicPlayer.LIZIZ();
        }
        this.LLIIII = 0;
        Iterator<C141585h4> it = this.LLI.iterator();
        while (it.hasNext()) {
            it.next().setSelectedView(false);
        }
        qm(this.LLIILZL);
        this.LLIILZL = null;
        EditorProContext Jl = Jl();
        NLETrackSlot nLETrackSlot = this.LJZL;
        if (nLETrackSlot != null) {
            C134215On.LIZIZ(nLETrackSlot, Jl);
            C79057V0z.LJJ(Jl()).LIZIZ();
            VideoPublishEditModel em = em();
            o.LJI(em);
            String str = em.mShootWay;
            VideoPublishEditModel em2 = em();
            o.LJI(em2);
            String LJIIIIZZ = H7R.LJIIIIZZ(em2);
            VideoPublishEditModel em3 = em();
            o.LJI(em3);
            String LJIIIZ = H7R.LJIIIZ(em3);
            VideoPublishEditModel em4 = em();
            o.LJI(em4);
            C138735cT.LIZ(new ShortVideoCommonParams(str, LJIIIIZZ, LJIIIZ, em4.getCreationId()), "1", null, 4);
            return;
        }
        o.LJIJI("textStickerSlot");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Rl() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.tts.TTSFragment.Rl():boolean");
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        String str;
        String str2;
        VideoPublishEditModel em = em();
        o.LJI(em);
        String str3 = em.mShootWay;
        VideoPublishEditModel em2 = em();
        o.LJI(em2);
        String LJIIIIZZ = H7R.LJIIIIZZ(em2);
        VideoPublishEditModel em3 = em();
        o.LJI(em3);
        String LJIIIZ = H7R.LJIIIZ(em3);
        VideoPublishEditModel em4 = em();
        o.LJI(em4);
        ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(str3, LJIIIIZZ, LJIIIZ, em4.getCreationId());
        String str4 = this.LLIILZL;
        String str5 = "";
        if (str4 == null) {
            str = "";
            str4 = "";
        } else {
            str = str4;
        }
        Iterator<ReadTextEffectBean> it = this.LLFZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ReadTextEffectBean next = it.next();
            if (o.LJ(next.mSpeaker.speakreID, str4)) {
                str5 = next.mSpeaker.speakerName;
                break;
            }
        }
        if (this.LLIIJLIL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C138735cT.LIZLLL(shortVideoCommonParams, str, str5, "1", str2);
        NLETrackSlot selectedTrackSlot = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            selectedTrackSlot.setExtra("is_editorpro_tts", "1");
        }
        NLETrackSlot selectedTrackSlot2 = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot2 != null) {
            NLETrackSlot nLETrackSlot = this.LJZL;
            if (nLETrackSlot != null) {
                selectedTrackSlot2.setExtra("editorpro_tts_tone_id", nLETrackSlot.getExtra("tts_effect_id"));
            } else {
                o.LJIJI("textStickerSlot");
                throw null;
            }
        }
        NLETrackSlot selectedTrackSlot3 = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot3 != null) {
            selectedTrackSlot3.setExtra("edit_tts_duration", String.valueOf((System.currentTimeMillis() - this.LLFFF) + C5QW.LJIIIZ(selectedTrackSlot3, "edit_tts_duration")));
        }
        super.V3();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    public final void nm() {
        this.LLFZ.add(new ReadTextEffectBean(new Effect(null, 1, null), new ReadTextEffectSpeakerExtra(true, "", "", "", 0, 0, null, null, null, null, false, 0L, 0L, 8160, null)));
        sm();
    }

    public final ArrayList<NLETrackSlot> om() {
        ArrayList<NLETrackSlot> arrayList = new ArrayList<>();
        VecNLETrackSPtr tracks = C79057V0z.LJJI(Jl()).getTracks();
        if (tracks != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                if (next.LJIIZILJ() == EnumC123864ta.STICKER) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    if (next2.hasExtra("text") && !TextUtils.isEmpty(next2.getExtra("text")) && AnonymousClass636.LJIILL(next2)) {
                        arrayList.add(next2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void sm() {
        this.LLI.clear();
        LinearLayout linearLayout = this.LLIFFJFJJ;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C141585h4 c141585h4 = new C141585h4(requireActivity);
            LinearLayout linearLayout2 = this.LLIFFJFJJ;
            if (linearLayout2 != null) {
                c141585h4.LIZLLL(linearLayout2, C16880lQ.LLZIL(requireActivity()), 0, this);
                c141585h4.LIZ(null);
                c141585h4.setSelectedView(true);
                this.LLIIII = 0;
                this.LLI.add(c141585h4);
                LinearLayout linearLayout3 = this.LLIFFJFJJ;
                if (linearLayout3 != null) {
                    linearLayout3.addView(c141585h4, new LinearLayout.LayoutParams(-2, -2));
                    Iterator<ReadTextEffectBean> it = this.LLFZ.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        ReadTextEffectBean next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            ReadTextEffectBean readTextEffectBean = next;
                            if (i == 0) {
                                this.LLF = readTextEffectBean.mSpeaker.speakreID;
                            }
                            ActivityC45651qj requireActivity2 = requireActivity();
                            o.LJIIIIZZ(requireActivity2, "requireActivity()");
                            C141585h4 c141585h42 = new C141585h4(requireActivity2);
                            LinearLayout linearLayout4 = this.LLIFFJFJJ;
                            if (linearLayout4 != null) {
                                c141585h42.LIZLLL(linearLayout4, C16880lQ.LLZIL(requireActivity()), i2, this);
                                c141585h42.LIZ(readTextEffectBean);
                                this.LLI.add(c141585h42);
                                LinearLayout linearLayout5 = this.LLIFFJFJJ;
                                if (linearLayout5 != null) {
                                    linearLayout5.addView(c141585h42, new LinearLayout.LayoutParams(-2, -2));
                                    if (o.LJ(readTextEffectBean.mSpeaker.speakreID, this.LLIIIJ)) {
                                        c141585h4.setSelectedView(false);
                                        this.LLIIII = i2;
                                        c141585h42.LIZJ(1, true);
                                    }
                                    i = i2;
                                } else {
                                    o.LJIJI("listViewGroup");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("listViewGroup");
                                throw null;
                            }
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    C73305Spp c73305Spp = this.LLFII;
                    if (c73305Spp != null) {
                        C146035oF.LIZIZ(c73305Spp);
                    }
                    Jl().getPlayer().pause();
                    if (!this.LLIIIZ) {
                        final Rect rect = new Rect();
                        C142135hx c142135hx = this.LLII;
                        if (c142135hx != null) {
                            c142135hx.setOnScrollListener(new InterfaceC142155hz() { // from class: X.5al
                                @Override // X.InterfaceC142155hz
                                public final void LIZJ() {
                                }

                                @Override // X.InterfaceC142155hz
                                public final void LIZ(C142135hx view) {
                                    o.LJIIIZ(view, "view");
                                }

                                @Override // X.InterfaceC142155hz
                                public final void LIZIZ(C142135hx view, int i3) {
                                    String str;
                                    String str2;
                                    String str3;
                                    Effect effect;
                                    String effectId;
                                    Effect effect2;
                                    Effect effect3;
                                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
                                    o.LJIIIZ(view, "view");
                                    if (i3 == 0) {
                                        TTSFragment tTSFragment = TTSFragment.this;
                                        Rect rect2 = rect;
                                        Iterator<C141585h4> it2 = tTSFragment.LLI.iterator();
                                        while (it2.hasNext()) {
                                            C141585h4 next2 = it2.next();
                                            boolean localVisibleRect = next2.getLocalVisibleRect(rect2);
                                            ReadTextEffectBean model = next2.getModel();
                                            String str4 = "";
                                            if (model == null || (readTextEffectSpeakerExtra = model.mSpeaker) == null || (str = readTextEffectSpeakerExtra.speakreID) == null) {
                                                str = "";
                                            }
                                            ReadTextEffectBean model2 = next2.getModel();
                                            if (model2 == null || (effect3 = model2.effect) == null) {
                                                str2 = "";
                                            } else {
                                                str2 = OUP.LJIJ(effect3);
                                            }
                                            ReadTextEffectBean model3 = next2.getModel();
                                            if (model3 != null && (effect2 = model3.effect) != null) {
                                                str3 = OUP.LJIILL(effect2);
                                            } else {
                                                str3 = null;
                                            }
                                            boolean LJ = o.LJ(str3, ((RBX) HG3.LJIILL()).getCurUserId());
                                            if (localVisibleRect && str.length() != 0 && !tTSFragment.LLIIIL.contains(str)) {
                                                VideoPublishEditModel em = tTSFragment.em();
                                                if (em != null) {
                                                    ReadTextEffectBean model4 = next2.getModel();
                                                    if (model4 != null && (effect = model4.effect) != null && (effectId = effect.getEffectId()) != null) {
                                                        str4 = effectId;
                                                    }
                                                    C138735cT.LJII(str, em, "1", str2, LJ ? 1 : 0, str4, "default", "", 516);
                                                }
                                                OQY oqy = tTSFragment.LLIIIL;
                                                java.util.Set LJII = C77275UUl.LJII(str);
                                                o.LJIIIZ(oqy, "<this>");
                                                ORS.LJJLIIIJILLIZJL(LJII, ORZ.LLJILLL(oqy));
                                            }
                                        }
                                    }
                                }
                            });
                            this.LLIIIZ = true;
                        } else {
                            o.LJIJI("scrollView");
                            throw null;
                        }
                    }
                    if (C68E.LIZ(getContext())) {
                        C142135hx c142135hx2 = this.LLII;
                        if (c142135hx2 != null) {
                            c142135hx2.post(new ARunnableS38S0100000_2(this, 119));
                            return;
                        } else {
                            o.LJIJI("scrollView");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("listViewGroup");
                throw null;
            }
            o.LJIJI("listViewGroup");
            throw null;
        }
        o.LJIJI("listViewGroup");
        throw null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIILII = true;
        C48841JEv.LIZJ(this.LLIL, null);
        C48841JEv.LIZJ(this.LLIIZ, null);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLILIL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLILIL = false;
        EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLILL;
        if (editRepeatMusicPlayer != null) {
            editRepeatMusicPlayer.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        super.Sl();
    }

    @Override // X.InterfaceC141575h3
    public final boolean LLD(String textSpeaker) {
        o.LJIIIZ(textSpeaker, "textSpeaker");
        String str = this.LJZI;
        if (str != null) {
            if (pm(str) != null) {
                return true;
            }
            return false;
        }
        o.LJIJI("text");
        throw null;
    }

    @Override // X.InterfaceC141575h3
    public final void Pc(int i) {
        this.LLIIII = i;
    }

    @Override // X.InterfaceC141575h3
    public final void c2(int i) {
        String str;
        if (i <= 0) {
            return;
        }
        this.LLIIII = i;
        if (i >= this.LLI.size() || i >= this.LLFZ.size() + 1) {
            return;
        }
        String str2 = this.LJZI;
        if (str2 != null) {
            if (!C167496hl.LIZIZ(str2)) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    C78920UyC.LIZLLL(R.string.e49, mo49getActivity, 1018);
                    return;
                }
                return;
            }
            ReadTextEffectBean model = ((C141585h4) ListProtector.get(this.LLI, i)).getModel();
            if (model != null) {
                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = model.mSpeaker;
                if (readTextEffectSpeakerExtra.voiceUseCommercial == 1 && SpeakerCenter.LJI(readTextEffectSpeakerExtra.speakreID)) {
                    ActivityC45651qj requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    String string = getResources().getString(R.string.trn);
                    o.LJIIIIZZ(string, "resources.getString(R.st…ttospeech_selected_toast)");
                    creativeToastBuilder.message(string);
                    creativeToastBuilder.duration(3000L);
                    C78915Uy7.LJJIIZI(requireActivity, 1017, creativeToastBuilder);
                    SpeakerCenter.LJIIJJI(model.mSpeaker.speakreID);
                }
                IInternalAVService LIZ = AVServiceImpl.LIZ();
                LIZ.setLastStickerId(model.effect.getEffectId(), 7);
                LIZ.setLastStickerId(model.effect.getResourceId(), 6);
            }
            ReadTextEffectBean model2 = ((C141585h4) ListProtector.get(this.LLI, i)).getModel();
            if (model2 != null) {
                String str3 = this.LJZI;
                if (str3 != null) {
                    String str4 = model2.mSpeaker.speakreID;
                    int i2 = this.LLILII;
                    if (OUP.LJJIIJZLJL(model2.effect)) {
                        str = "Vop";
                    } else {
                        str = "TTS";
                    }
                    OSZ<File, Integer> pm = pm(str4);
                    if (pm != null) {
                        mm(str4, i, pm.getFirst(), pm.getSecond().intValue());
                    } else {
                        XKX.LIZLLL(this.LLIIZ, new C137705ao(CoroutineExceptionHandler.LJJJJIZL, this, i, i2), null, new C137725aq(this, i, i2, str4, str3, str, null), 2);
                    }
                    String LJIJ = OUP.LJIJ(model2.effect);
                    boolean LJ = o.LJ(OUP.LJIILL(model2.effect), ((RBX) HG3.LJIILL()).getCurUserId());
                    C138735cT.LJI(em(), model2.mSpeaker.speakreID, 0, "1", LJIJ, LJ ? 1 : 0, model2.effect.getEffectId(), "default", "", 1040);
                    C138735cT.LJ(em(), model2.effect);
                    return;
                }
                o.LJIJI("text");
                throw null;
            }
            return;
        }
        o.LJIJI("text");
        throw null;
    }

    public final OSZ<File, Integer> pm(String str) {
        if (o.LJ(str, this.LLF)) {
            str = "";
        }
        HashMap<C137695an, OSZ<File, Integer>> hashMap = this.LLD;
        String str2 = this.LJZI;
        if (str2 != null) {
            OSZ<File, Integer> osz = hashMap.get(new C137695an(str2, str));
            if (osz != null) {
                return osz;
            }
            if (!o.LJ(str, "")) {
                return null;
            }
            HashMap<C137695an, OSZ<File, Integer>> hashMap2 = this.LLD;
            String str3 = this.LJZI;
            if (str3 != null) {
                return hashMap2.get(new C137695an(str3, this.LLF));
            }
            o.LJIJI("text");
            throw null;
        }
        o.LJIJI("text");
        throw null;
    }

    public final void qm(String str) {
        ReadTextEffectBean readTextEffectBean;
        VideoPublishEditModel em;
        if (str != null) {
            Iterator<ReadTextEffectBean> it = this.LLFZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    readTextEffectBean = it.next();
                    if (o.LJ(readTextEffectBean.mSpeaker.speakreID, str)) {
                        break;
                    }
                } else {
                    readTextEffectBean = null;
                    break;
                }
            }
            ReadTextEffectBean readTextEffectBean2 = readTextEffectBean;
            if (readTextEffectBean2 != null && (em = em()) != null) {
                C137935bB.LIZIZ(em, readTextEffectBean2.effect);
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!C1280450u.LIZ()) {
            return;
        }
        this.LLFFF = System.currentTimeMillis();
        Yl("");
        int i = this.LLILII;
        if (i == Integer.MAX_VALUE) {
            this.LLILII = 0;
        } else {
            this.LLILII = i + 1;
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LLIIIILZ = new SafeHandler(requireActivity);
        View findViewById = view.findViewById(R.id.csh);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.effect_list_parent_view)");
        this.LLIFFJFJJ = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.jcz);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.scroll_view)");
        this.LLII = (C142135hx) findViewById2;
        C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.cqt);
        this.LLFII = c73305Spp;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
        }
        NLETrackSlot nLETrackSlot = this.LJZL;
        if (nLETrackSlot != null) {
            if (nLETrackSlot.hasExtra("text_tts_id")) {
                NLETrackSlot nLETrackSlot2 = this.LJZL;
                if (nLETrackSlot2 != null) {
                    String duration = nLETrackSlot2.getExtra("text_tts_duration");
                    NLETrackSlot nLETrackSlot3 = this.LJZL;
                    if (nLETrackSlot3 != null) {
                        String extra = nLETrackSlot3.getExtra("tts_audio_path");
                        NLETrackSlot nLETrackSlot4 = this.LJZL;
                        if (nLETrackSlot4 != null) {
                            String speaker = nLETrackSlot4.getExtra("text_tts_speaker");
                            NLETrackSlot nLETrackSlot5 = this.LJZL;
                            if (nLETrackSlot5 != null) {
                                String text = nLETrackSlot5.getExtra("text");
                                if (C1B6.LIZIZ(extra)) {
                                    o.LJIIIIZZ(speaker, "speaker");
                                    this.LLIIIJ = speaker;
                                    this.LLIILZL = speaker;
                                    o.LJIIIIZZ(text, "text");
                                    File file = new File(extra);
                                    o.LJIIIIZZ(duration, "duration");
                                    int parseInt = CastIntegerProtector.parseInt(duration);
                                    this.LLD.put(new C137695an(text, speaker), new OSZ<>(file, Integer.valueOf(parseInt)));
                                }
                            } else {
                                o.LJIJI("textStickerSlot");
                                throw null;
                            }
                        } else {
                            o.LJIJI("textStickerSlot");
                            throw null;
                        }
                    } else {
                        o.LJIJI("textStickerSlot");
                        throw null;
                    }
                } else {
                    o.LJIJI("textStickerSlot");
                    throw null;
                }
            }
            H7R.LJIIIZ(em());
            C55V c55v = this.LL;
            if (c55v != null) {
                if (c55v.LIZ.isEmpty()) {
                    XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C137665ak(this, null), 3);
                    return;
                }
                this.LLFZ.clear();
                ArrayList<ReadTextEffectBean> arrayList = this.LLFZ;
                C55V c55v2 = this.LL;
                if (c55v2 != null) {
                    arrayList.addAll(c55v2.LIZ);
                    sm();
                    return;
                } else {
                    o.LJIJI("ttsDataCenter");
                    throw null;
                }
            }
            o.LJIJI("ttsDataCenter");
            throw null;
        }
        o.LJIJI("textStickerSlot");
        throw null;
    }

    public final void vm(int i, boolean z) {
        if (i >= this.LLI.size() || i < 0) {
            return;
        }
        ListProtector.get(this.LLI, i);
        ((C141585h4) ListProtector.get(this.LLI, i)).LIZJ(1, z);
    }

    public final void lm(final int i, final int i2, final String str) {
        SafeHandler safeHandler = this.LLIIIILZ;
        if (safeHandler != null) {
            safeHandler.post(new Runnable() { // from class: X.5am
                public final void LIZ() {
                    int i3 = i2;
                    TTSFragment tTSFragment = this;
                    if (i3 != tTSFragment.LLILII || i >= tTSFragment.LLI.size()) {
                        return;
                    }
                    Object obj = ListProtector.get(this.LLI, i);
                    o.LJIIIIZZ(obj, "effectViewList[position]");
                    ((C141585h4) obj).LIZJ(0, false);
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    if (!C47918IrK.LIZ(C60903NvH.LJ)) {
                        creativeToastBuilder.messageRes(R.string.e45);
                    } else {
                        String str2 = str;
                        if (str2 == null || TextUtils.isEmpty(str2)) {
                            creativeToastBuilder.messageRes(R.string.s6k);
                        } else {
                            creativeToastBuilder.message(str);
                        }
                    }
                    ActivityC45651qj mo49getActivity = this.mo49getActivity();
                    if (mo49getActivity != null) {
                        C78915Uy7.LJJIIZI(mo49getActivity, 1020, creativeToastBuilder);
                    }
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
            });
        } else {
            o.LJIJI("mSafeHandler");
            throw null;
        }
    }

    public final void mm(String str, int i, File file, int i2) {
        ReadTextEffectBean readTextEffectBean;
        Effect effect;
        VideoPublishEditModel em;
        Iterator<C141585h4> it = this.LLI.iterator();
        while (it.hasNext()) {
            it.next().setSelectedView(false);
        }
        vm(i, true);
        qm(this.LLIILZL);
        this.LLIILZL = str;
        EditorProContext Jl = Jl();
        NLETrackSlot nLETrackSlot = this.LJZL;
        if (nLETrackSlot != null) {
            C134215On.LIZIZ(nLETrackSlot, Jl);
            int i3 = i - 1;
            if (this.LLFZ.size() > i3 && i3 >= 0) {
                readTextEffectBean = (ReadTextEffectBean) ListProtector.get(this.LLFZ, i3);
            } else {
                readTextEffectBean = null;
            }
            EditorProContext Jl2 = Jl();
            NLETrackSlot nLETrackSlot2 = this.LJZL;
            if (nLETrackSlot2 != null) {
                String str2 = this.LJZI;
                if (str2 != null) {
                    String absolutePath = file.getAbsolutePath();
                    o.LJIIIIZZ(absolutePath, "file.absolutePath");
                    C134215On.LIZJ(Jl2, nLETrackSlot2, str2, str, absolutePath, i2, readTextEffectBean);
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity != null) {
                        Jl().getPlayer().pause();
                        EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLILL;
                        if (editRepeatMusicPlayer != null) {
                            editRepeatMusicPlayer.LIZIZ();
                        }
                        EditRepeatMusicPlayer editRepeatMusicPlayer2 = new EditRepeatMusicPlayer(mo49getActivity, file.getAbsolutePath());
                        this.LLILL = editRepeatMusicPlayer2;
                        if (this.LLILIL) {
                            editRepeatMusicPlayer2.LIZ(0);
                        }
                        C79057V0z.LJJ(Jl()).LIZIZ();
                    }
                    if (readTextEffectBean != null && (effect = readTextEffectBean.effect) != null && (em = em()) != null) {
                        C137935bB.LIZ(this, em, effect);
                        return;
                    }
                    return;
                }
                o.LJIJI("text");
                throw null;
            }
            o.LJIJI("textStickerSlot");
            throw null;
        }
        o.LJIJI("textStickerSlot");
        throw null;
    }
}
