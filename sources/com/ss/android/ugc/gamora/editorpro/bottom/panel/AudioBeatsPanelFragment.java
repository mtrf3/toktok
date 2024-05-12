package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.C08630Vn;
import X.C1280450u;
import X.C1301859a;
import X.C130595Ap;
import X.C130725Bc;
import X.C134855Qz;
import X.C139795eB;
import X.C16880lQ;
import X.C171096nZ;
import X.C221108m2;
import X.C36636EZk;
import X.C40675Fxn;
import X.C47261Igj;
import X.C48841JEv;
import X.C51F;
import X.C51G;
import X.C52T;
import X.C52V;
import X.C56D;
import X.C56F;
import X.C5G0;
import X.C5QW;
import X.C61878OQg;
import X.C62822Ol8;
import X.C71897SJp;
import X.C78880UxY;
import X.C78926UyI;
import X.C79045V0n;
import X.C79057V0z;
import X.C81184Vtc;
import X.EnumC126814yL;
import X.FMX;
import X.H7C;
import X.InterfaceC130805Bk;
import X.InterfaceC70422pa;
import X.MBA;
import X.OQY;
import X.ORZ;
import X.SY4;
import X.T2R;
import X.X1D;
import Y.ACListenerS22S0100000_2;
import Y.ALAdapterS1S0100000_2;
import Y.ARunnableS6S0101000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes3.dex */
public final class AudioBeatsPanelFragment extends TTResourcePanelFragment<CutViewModel> implements InterfaceC70422pa {
    public final ValueAnimator LL;
    public float LLD;
    public C130595Ap LLF;
    public View LLFF;
    public long LLFFF;
    public long LLFII;
    public int LLFZ;
    public final List<Integer> LLI;
    public final HashSet<Integer> LLIFFJFJJ;
    public final List<Integer> LLII;
    public List<Integer> LLIIII;
    public NLETrackSlot LLIIIILZ;
    public boolean LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final Map<Integer, View> LLIIIZ = new LinkedHashMap();
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C51G.LJLIL);
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(C56F.LJLIL);
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(C51F.LJLIL);
    public final MBA LJZL = C36636EZk.LIZ.plus(T2R.LJIIJJI());

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "audio_beats";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIZ).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIZ;
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

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C48841JEv.LIZJ(this, null);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.asj;
    }

    public AudioBeatsPanelFragment() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LL = ofFloat;
        this.LLI = new ArrayList();
        this.LLIFFJFJJ = new HashSet<>();
        this.LLII = new ArrayList();
        this.LLIIII = C61878OQg.INSTANCE;
        this.LLIIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 569));
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new ALAdapterS1S0100000_2(this, 12));
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 22));
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    public final C52T om() {
        IConsoleBarService iConsoleBarService = (IConsoleBarService) C171096nZ.LIZ(IConsoleBarService.class);
        if (iConsoleBarService != null) {
            return iConsoleBarService.getConsoleBar();
        }
        return null;
    }

    public final C56D pm() {
        return (C56D) this.LJZ.getValue();
    }

    public final EditorProContext qm() {
        return (EditorProContext) this.LJLZ.getValue();
    }

    public final void sm() {
        ((ArrayList) this.LLII).clear();
        ((ArrayList) this.LLII).addAll(this.LLIIII);
        ((ArrayList) this.LLI).addAll(this.LLII);
        C40675Fxn.LJJLIIIIJ(this.LLI);
        C130595Ap c130595Ap = this.LLF;
        if (c130595Ap != null) {
            c130595Ap.setBeats(this.LLI);
        } else {
            o.LJIJI("audioTrack");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        nm();
        VideoPublishEditModel em = em();
        if (em != null) {
            FMX.LJIIL("click_cancel_beat", C5QW.LJII(em).LIZ);
        }
        super.Sl();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        String str;
        nm();
        VideoPublishEditModel em = em();
        if (em != null) {
            FMX.LJIIL("click_save_beat", C5QW.LJII(em).LIZ);
        }
        String lm = lm(this.LLI);
        NLETrackSlot nLETrackSlot = this.LLIIIILZ;
        String str2 = null;
        if (nLETrackSlot != null) {
            str = nLETrackSlot.getExtra("audio_stick_points");
        } else {
            str = null;
        }
        String lm2 = lm(ORZ.LLJI(this.LLIFFJFJJ));
        NLETrackSlot nLETrackSlot2 = this.LLIIIILZ;
        if (nLETrackSlot2 != null) {
            str2 = nLETrackSlot2.getExtra("manual_music_beats");
        }
        if (!o.LJ(lm, str) || !o.LJ(lm2, str2)) {
            NLETrackSlot nLETrackSlot3 = this.LLIIIILZ;
            if (nLETrackSlot3 != null) {
                nLETrackSlot3.setExtra("audio_stick_points", lm);
            }
            NLETrackSlot nLETrackSlot4 = this.LLIIIILZ;
            if (nLETrackSlot4 != null) {
                nLETrackSlot4.setExtra("manual_music_beats", lm2);
            }
            C79057V0z.LJIILL(qm(), C78880UxY.LJLILLLLZI(new C139795eB(EnumC126814yL.MUSIC_BEAT.getNameId(), null, null, null, null, 30)));
        }
        super.V3();
    }

    public final void nm() {
        View findViewById;
        ViewGroup viewGroup;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (findViewById = mo49getActivity.findViewById(R.id.cjm)) != null && (findViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) findViewById) != null) {
            C16880lQ.LJLLL(this.LLFF, viewGroup);
        }
        pm().release();
        C79057V0z.LJJJJL(qm(), "is_showing_beats_panel", Boolean.FALSE);
        C52T om = om();
        if (om != null) {
            om.LLLLLLLLL(this.LLFFF);
        }
        C52T om2 = om();
        if (om2 != null) {
            om2.LLIZLLLIL(this.LLFII);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        pm().pause();
        super.onStop();
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJZL;
    }

    public final String lm(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Integer num : list) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(num.intValue());
                if (i < ((ArrayList) this.LLI).size() - 1) {
                    sb.append(',');
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stickPoint.toString()");
        return sb2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        View findViewById;
        ViewGroup viewGroup;
        View findViewById2;
        View findViewById3;
        int measuredHeight;
        long j;
        int i;
        NLESegment nLESegment;
        long j2;
        long j3;
        long j4;
        boolean z;
        String extra;
        String str;
        LiveState<C08630Vn<C52V>> U30;
        LiveState<Long> Y1;
        LiveState<Long> BR;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onActivityCreated(bundle);
        if (C1280450u.LIZ()) {
            Context context = getContext();
            if (context != null && (mo49getActivity = mo49getActivity()) != null && (findViewById = mo49getActivity.findViewById(R.id.cjm)) != null) {
                View view = new View(context);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                Integer LJI = C79045V0n.LJI(R.attr.d6, context);
                if (LJI != null) {
                    view.setBackgroundColor(LJI.intValue());
                }
                this.LLFF = view;
                if ((findViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) findViewById) != null) {
                    viewGroup.addView(view);
                }
            }
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 == null || (findViewById2 = mo49getActivity2.findViewById(R.id.lj2)) == null || (findViewById3 = mo49getActivity2.findViewById(R.id.cjk)) == null) {
                measuredHeight = 0;
            } else {
                measuredHeight = findViewById3.getMeasuredHeight() + findViewById2.getMeasuredHeight();
            }
            int LIZ = measuredHeight - C134855Qz.LIZ(44.0f);
            if (LIZ != 0) {
                _$_findCachedViewById(R.id.gql).getLayoutParams().height = LIZ;
            }
            if (((int) (C81184Vtc.LIZIZ(requireActivity()) * 0.58f)) == fm()) {
                int LIZ2 = (LIZ / 2) - C134855Qz.LIZ(68.0f);
                int LIZ3 = LIZ2 - C134855Qz.LIZ(10.0f);
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.a9u).getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.topMargin = LIZ2;
                }
                ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.ahw).getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.topMargin = LIZ3;
                }
            }
            NLETrackSlot selectedTrackSlot = qm().getSelectedTrackSlot();
            this.LLIIIILZ = selectedTrackSlot;
            C130595Ap c130595Ap = this.LLF;
            if (c130595Ap != null) {
                if (selectedTrackSlot != null) {
                    c130595Ap.setAudioNLETrackSlot(selectedTrackSlot);
                }
                ActivityC45651qj requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                c130595Ap.setAudioTrackPaint(new C130725Bc(requireActivity));
                long H9 = qm().getPlayer().H9();
                NLETrackSlot nLETrackSlot = this.LLIIIILZ;
                long j5 = 0;
                if (nLETrackSlot != null) {
                    j = nLETrackSlot.getStartTime();
                } else {
                    j = 0;
                }
                long LJJIZ = H9 - C78926UyI.LJJIZ(j);
                if (LJJIZ < 0) {
                    i = 0;
                } else {
                    i = (int) LJJIZ;
                }
                C130595Ap c130595Ap2 = this.LLF;
                if (c130595Ap2 != null) {
                    c130595Ap2.getHorizontalScrollView();
                    c130595Ap2.post(new ARunnableS6S0101000_2(i, this, 12));
                    _$_findCachedViewById(R.id.aum).getClass();
                    C130595Ap c130595Ap3 = this.LLF;
                    if (c130595Ap3 != null) {
                        c130595Ap3.setListener(new InterfaceC130805Bk() { // from class: X.56C
                            @Override // X.InterfaceC130805Bk
                            public final void LIZ() {
                                AudioBeatsPanelFragment.this.pm().pause();
                            }

                            @Override // X.InterfaceC130805Bk
                            public final void LIZIZ() {
                                AudioBeatsPanelFragment.this.pm().pause();
                            }

                            @Override // X.InterfaceC130805Bk
                            public final void LIZJ() {
                                AudioBeatsPanelFragment.this.pm().pause();
                            }

                            @Override // X.InterfaceC130805Bk
                            public final void LJ() {
                                C130595Ap c130595Ap4 = AudioBeatsPanelFragment.this.LLF;
                                if (c130595Ap4 != null) {
                                    AudioBeatsPanelFragment.this.pm().LIZ(c130595Ap4.getCurTimePosition());
                                    C52T om = AudioBeatsPanelFragment.this.om();
                                    if (om != null) {
                                        om.LLLLLLLLL(r1 - AudioBeatsPanelFragment.this.LLFZ);
                                        return;
                                    }
                                    return;
                                }
                                o.LJIJI("audioTrack");
                                throw null;
                            }

                            @Override // X.InterfaceC130805Bk
                            public final void LIZLLL(Integer num) {
                                String string;
                                String string2;
                                String str2 = "";
                                if (num != null) {
                                    TextView textView = (TextView) AudioBeatsPanelFragment.this._$_findCachedViewById(R.id.aum);
                                    Context context2 = AudioBeatsPanelFragment.this.getContext();
                                    if (context2 != null && (string2 = context2.getString(R.string.rgx)) != null) {
                                        str2 = string2;
                                    }
                                    textView.setText(str2);
                                    ((SY4) AudioBeatsPanelFragment.this._$_findCachedViewById(R.id.aum)).setButtonStartIcon(Integer.valueOf(R.raw.icon_minus));
                                    return;
                                }
                                TextView textView2 = (TextView) AudioBeatsPanelFragment.this._$_findCachedViewById(R.id.aum);
                                Context context3 = AudioBeatsPanelFragment.this.getContext();
                                if (context3 != null && (string = context3.getString(R.string.rgw)) != null) {
                                    str2 = string;
                                }
                                textView2.setText(str2);
                                ((SY4) AudioBeatsPanelFragment.this._$_findCachedViewById(R.id.aum)).setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_fill));
                            }
                        });
                        ((C1301859a) _$_findCachedViewById(R.id.ahw)).setGapWidth(0.0f);
                        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.aum), new ACListenerS22S0100000_2(this, 149));
                        C16880lQ.LJJJI((C71897SJp) _$_findCachedViewById(R.id.b7c), new View.OnClickListener() { // from class: X.56B
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C56E c56e;
                                NLESegment nLESegment2 = null;
                                if (((CompoundButton) AudioBeatsPanelFragment.this._$_findCachedViewById(R.id.b7c)).isChecked()) {
                                    VideoPublishEditModel em = AudioBeatsPanelFragment.this.em();
                                    if (em != null) {
                                        C30581Hy.LJJIJIIJI(em, true);
                                    }
                                    if (AudioBeatsPanelFragment.this.LLIIII.isEmpty()) {
                                        AudioBeatsPanelFragment audioBeatsPanelFragment = AudioBeatsPanelFragment.this;
                                        NLETrackSlot selectedTrackSlot2 = audioBeatsPanelFragment.qm().getSelectedTrackSlot();
                                        if (selectedTrackSlot2 != null) {
                                            nLESegment2 = selectedTrackSlot2.LJI();
                                        }
                                        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment2);
                                        if (LIZLLL == null || (c56e = (C56E) audioBeatsPanelFragment.LLIIIL.getValue()) == null) {
                                            return;
                                        }
                                        c56e.LIZ(LIZLLL, new AqS152S0100000_2(audioBeatsPanelFragment, 950), new AqS152S0100000_2(audioBeatsPanelFragment, 951), new IDqS427S0100000_2(audioBeatsPanelFragment, 10));
                                        return;
                                    }
                                    AudioBeatsPanelFragment.this.sm();
                                    return;
                                }
                                AudioBeatsPanelFragment audioBeatsPanelFragment2 = AudioBeatsPanelFragment.this;
                                if (audioBeatsPanelFragment2.LLIIIJ) {
                                    C56E c56e2 = (C56E) audioBeatsPanelFragment2.LLIIIL.getValue();
                                    if (c56e2 != null) {
                                        c56e2.LIZIZ();
                                        return;
                                    }
                                    return;
                                }
                                VideoPublishEditModel em2 = audioBeatsPanelFragment2.em();
                                if (em2 != null) {
                                    C30581Hy.LJJIJIIJI(em2, false);
                                }
                                AudioBeatsPanelFragment audioBeatsPanelFragment3 = AudioBeatsPanelFragment.this;
                                ((ArrayList) audioBeatsPanelFragment3.LLI).removeAll(audioBeatsPanelFragment3.LLII);
                                C40675Fxn.LJJLIIIIJ(audioBeatsPanelFragment3.LLI);
                                C130595Ap c130595Ap4 = audioBeatsPanelFragment3.LLF;
                                if (c130595Ap4 != null) {
                                    c130595Ap4.setBeats(audioBeatsPanelFragment3.LLI);
                                } else {
                                    o.LJIJI("audioTrack");
                                    throw null;
                                }
                            }
                        });
                        NLETrackSlot selectedTrackSlot2 = qm().getSelectedTrackSlot();
                        if (selectedTrackSlot2 != null) {
                            pm().LIZJ(selectedTrackSlot2);
                            pm().LIZLLL(new AqS168S0100000_2(this, 593));
                            pm().LIZIZ(new AqS168S0100000_2(this, 594));
                        }
                        C79057V0z.LJJJJL(qm(), "is_showing_beats_panel", Boolean.TRUE);
                        NLETrackSlot selectedTrackSlot3 = qm().getSelectedTrackSlot();
                        if (selectedTrackSlot3 != null) {
                            nLESegment = selectedTrackSlot3.LJI();
                        } else {
                            nLESegment = null;
                        }
                        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
                        if (LIZLLL != null) {
                            j2 = LIZLLL.LJIILIIL();
                        } else {
                            j2 = 0;
                        }
                        int LJJIZ2 = C78926UyI.LJJIZ(j2);
                        if (LIZLLL != null) {
                            j3 = LIZLLL.LJIIL();
                        } else {
                            j3 = 0;
                        }
                        int LJJIZ3 = C78926UyI.LJJIZ(j3);
                        C52T om = om();
                        if (om != null && (BR = om.BR()) != null) {
                            j4 = BR.LIZ().longValue();
                        } else {
                            j4 = 0;
                        }
                        this.LLFFF = j4;
                        C52T om2 = om();
                        if (om2 != null && (Y1 = om2.Y1()) != null) {
                            j5 = Y1.LIZ().longValue();
                        }
                        this.LLFII = j5;
                        this.LLFZ = C78926UyI.LJJIZ(LIZLLL.LJIILIIL());
                        C52T om3 = om();
                        if (om3 != null) {
                            om3.LLLLLLLLL(LJJIZ2 - this.LLFZ);
                        }
                        C52T om4 = om();
                        if (om4 != null) {
                            om4.LLIZLLLIL(LJJIZ3 - this.LLFZ);
                        }
                        C52T om5 = om();
                        if (om5 != null && (U30 = om5.U30()) != null) {
                            U30.LJIIIIZZ(this, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 591));
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        ((ArrayList) this.LLI).clear();
                        NLETrackSlot nLETrackSlot2 = this.LLIIIILZ;
                        if (nLETrackSlot2 != null && nLETrackSlot2.hasExtra("manual_music_beats")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str2 = "";
                        if (z) {
                            HashSet<Integer> hashSet = this.LLIFFJFJJ;
                            NLETrackSlot nLETrackSlot3 = this.LLIIIILZ;
                            if (nLETrackSlot3 == null || (str = nLETrackSlot3.getExtra("manual_music_beats")) == null) {
                                str = "";
                            }
                            hashSet.addAll(mm(str, OQY.INSTANCE));
                        }
                        NLETrackSlot nLETrackSlot4 = this.LLIIIILZ;
                        if (nLETrackSlot4 != null && nLETrackSlot4.hasExtra("audio_stick_points")) {
                            List<Integer> list = this.LLII;
                            NLETrackSlot nLETrackSlot5 = this.LLIIIILZ;
                            if (nLETrackSlot5 != null && (extra = nLETrackSlot5.getExtra("audio_stick_points")) != null) {
                                str2 = extra;
                            }
                            ((ArrayList) list).addAll(mm(str2, this.LLIFFJFJJ));
                        }
                        ((ArrayList) this.LLI).addAll(this.LLIFFJFJJ);
                        ((ArrayList) this.LLI).addAll(this.LLII);
                        C130595Ap c130595Ap4 = this.LLF;
                        if (c130595Ap4 != null) {
                            c130595Ap4.setBeats(ORZ.LLJI(this.LLI));
                            ((C71897SJp) _$_findCachedViewById(R.id.b7c)).setChecked(!((ArrayList) this.LLII).isEmpty());
                            long currentTimeMillis2 = System.currentTimeMillis();
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("initBeats: cost:");
                            LIZ4.append(currentTimeMillis2 - currentTimeMillis);
                            H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ4));
                            return;
                        }
                        o.LJIJI("audioTrack");
                        throw null;
                    }
                    o.LJIJI("audioTrack");
                    throw null;
                }
                o.LJIJI("audioTrack");
                throw null;
            }
            o.LJIJI("audioTrack");
            throw null;
        }
    }

    public static List mm(String str, Set set) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Set LLJILLL = ORZ.LLJILLL(set);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return arrayList;
        }
        try {
            for (String str2 : s.LJLJJL(str, new String[]{","}, 0, 6)) {
                if (!ujb.o.LJJJJJL(str2)) {
                    int parseInt = CastIntegerProtector.parseInt(str2);
                    if (LLJILLL.contains(Integer.valueOf(parseInt))) {
                        LLJILLL.remove(Integer.valueOf(parseInt));
                    } else {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.c55);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(4);
        }
        Nl();
        C130595Ap audio_beat_track = (C130595Ap) _$_findCachedViewById(R.id.a9u);
        o.LJIIIIZZ(audio_beat_track, "audio_beat_track");
        this.LLF = audio_beat_track;
    }
}
