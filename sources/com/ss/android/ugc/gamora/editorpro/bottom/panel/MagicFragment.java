package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.A90;
import X.ActivityC45651qj;
import X.AnonymousClass551;
import X.AnonymousClass553;
import X.AnonymousClass572;
import X.AnonymousClass574;
import X.AnonymousClass576;
import X.C0A3;
import X.C124574uj;
import X.C124774v3;
import X.C125214vl;
import X.C125224vm;
import X.C125254vp;
import X.C126784yI;
import X.C126874yR;
import X.C126924yW;
import X.C127284z6;
import X.C127594zb;
import X.C1280450u;
import X.C1284452i;
import X.C1286753f;
import X.C1287253k;
import X.C1291354z;
import X.C1295856s;
import X.C1295956t;
import X.C1296156v;
import X.C132805Jc;
import X.C132845Jg;
import X.C134845Qy;
import X.C145995oB;
import X.C150135ur;
import X.C16880lQ;
import X.C171096nZ;
import X.C173216qz;
import X.C1B8;
import X.C1E4;
import X.C1RF;
import X.C2068389v;
import X.C221108m2;
import X.C43073GvN;
import X.C44684HgG;
import X.C47261Igj;
import X.C56A;
import X.C57B;
import X.C57U;
import X.C5G0;
import X.C5J1;
import X.C5QW;
import X.C60903NvH;
import X.C61576OEq;
import X.C62822Ol8;
import X.C76800UCe;
import X.C77339UWx;
import X.C78926UyI;
import X.C79045V0n;
import X.C79057V0z;
import X.C84419XBf;
import X.EnumC123874tb;
import X.EnumC126954yZ;
import X.EnumC127354zD;
import X.EnumC43651HBf;
import X.FMX;
import X.InterfaceC126184xK;
import X.InterfaceC127784zu;
import X.InterfaceC88472Yns;
import X.J9P;
import X.JJ4;
import X.ORZ;
import X.OSZ;
import X.SY9;
import X.XBE;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.IDLListenerS56S0200000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.MagicFragment;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.magic.MagicViewModel;
import com.ss.android.ugc.tools.view.widget.ScrollCenterLayoutManager;
import com.ss.ugc.android.davinciresource.DavinciResourceLibraryLoader;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.components.base.api.IMagicProcessorService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes3.dex */
public final class MagicFragment extends TTResourcePanelFragment<MagicViewModel> {
    public A90 LJZ;
    public NLENode LJZI;
    public OSZ<? extends ResourceItem, Integer> LL;
    public long LLD;
    public boolean LLFF;
    public boolean LLFFF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C127284z6.LJLIL);
    public int LJZL = -1;
    public final long LLF = System.currentTimeMillis();

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "magic_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
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

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.LLFFF = true;
        super.onStop();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.ask;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        A90 a90 = this.LJZ;
        if (a90 != null && a90.isShowing()) {
            mm();
        } else {
            pm();
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(MagicViewModel.class);
    }

    public final void xm() {
        NLEModel dynamicCast;
        NLENode nLENode = this.LJZI;
        if (nLENode != null && (dynamicCast = NLEModel.dynamicCast(nLENode)) != null) {
            C79057V0z.LJJ(Jl()).LJII(dynamicCast);
            C79057V0z.LJIIL(Jl());
            if (this.LJZL != -1) {
                C79057V0z.LJJJJL(Jl(), "select_slot_event", new C127594zb(Jl().getMainTrack().LJIILIIL(this.LJZL), null, 14));
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Vl() {
        long LJJLIIIJJIZ = C124574uj.LJJLIIIJJIZ(C79057V0z.LJIJJLI(Jl()));
        Iterator<NLETrackSlot> it = Jl().getMainTrack().LJIILLIIL().iterator();
        while (it.hasNext()) {
            NLETrackSlot nleTrackSlot = it.next();
            long[] jArr = new long[2];
            NLETrack mainTrack = Jl().getMainTrack();
            o.LJIIIIZZ(nleTrackSlot, "nleTrackSlot");
            C124774v3.LIZ(mainTrack, nleTrackSlot, jArr);
            long j = jArr[0];
            if (LJJLIIIJJIZ <= jArr[1] && j <= LJJLIIIJJIZ) {
                C1284452i c1284452i = (C1284452i) this.LJLZ.getValue();
                if (c1284452i != null) {
                    C1284452i.LJIJ(c1284452i, nleTrackSlot, EnumC127354zD.LINE, false, 28);
                    return;
                }
                return;
            }
        }
    }

    public final void mm() {
        String str;
        xm();
        Ml().getClass();
        EditModelProvider.Companion.getClass();
        InterfaceC126184xK magicProcessorManager$tools_camera_edit_release = C126784yI.LIZ().getMagicProcessorManager$tools_camera_edit_release();
        if (magicProcessorManager$tools_camera_edit_release != null) {
            magicProcessorManager$tools_camera_edit_release.LIZJ();
        }
        A90 a90 = this.LJZ;
        if (a90 != null) {
            a90.dismiss();
        }
        OSZ<? extends ResourceItem, Integer> osz = this.LL;
        if (osz != null) {
            sm(osz.getFirst(), osz.getSecond().intValue(), "apply_cancel");
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = osz.getFirst().gameplayType;
            if (o.LJ(str2, EnumC126954yZ.SERVER_GAME_PLAY.getTypeName())) {
                str = "server";
            } else if (o.LJ(str2, EnumC126954yZ.CLIENT_GAME_PLAY.getTypeName())) {
                str = "client";
            } else {
                str = "combine";
            }
            long j = currentTimeMillis - this.LLD;
            String effectId = osz.getFirst().getEffectId();
            o.LJIIIIZZ(effectId, "loadingMagic.first.effectId");
            String name = osz.getFirst().getName();
            o.LJIIIIZZ(name, "loadingMagic.first.name");
            C5QW.LJJIIZI(2, j, null, "apply_cancel", effectId, name, str);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView recyclerView;
        List<C0A3> list;
        if (C1280450u.LIZ()) {
            Ml().getClass();
            EditModelProvider.Companion.getClass();
            InterfaceC126184xK magicProcessorManager$tools_camera_edit_release = C126784yI.LIZ().getMagicProcessorManager$tools_camera_edit_release();
            if (magicProcessorManager$tools_camera_edit_release != null) {
                magicProcessorManager$tools_camera_edit_release.clear();
            }
            AnonymousClass574 anonymousClass574 = (AnonymousClass574) _$_findCachedViewById(R.id.gbt);
            if (anonymousClass574 != null && (recyclerView = anonymousClass574.getRecyclerView()) != null && (list = recyclerView.LLIFFJFJJ) != null) {
                ((ArrayList) list).clear();
            }
            AnonymousClass574 anonymousClass5742 = (AnonymousClass574) _$_findCachedViewById(R.id.gbt);
            if (anonymousClass5742 != null) {
                anonymousClass5742.LJLJJL = null;
                anonymousClass5742.LJLJJLL = null;
                anonymousClass5742.LJLJL = null;
            }
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        A90 a90 = this.LJZ;
        if (a90 != null && a90.isShowing() && this.LLFFF) {
            mm();
            this.LLFFF = false;
        }
    }

    public final void pm() {
        InterfaceC127784zu player = Jl().getPlayer();
        player.J9();
        player.pause();
        NLETrackSlot selectedTrackSlot = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            selectedTrackSlot.setExtra("add_magic_duration", String.valueOf((System.currentTimeMillis() - this.LLF) + C5QW.LJIIIZ(selectedTrackSlot, "add_magic_duration")));
        }
        C79057V0z.LJJJJL(Jl(), "select_slot_event", new C127594zb(null, null, 14));
        VideoPublishEditModel em = em();
        if (em != null) {
            EditorProContext editorContext = Jl();
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(em, editorContext);
            LJFF.LJI("is_editor_pro", "1");
            FMX.LJIIL("magic_panel_exit", LJFF.LIZ);
        }
        Hl();
    }

    public final void ym() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(_$_findCachedViewById(R.id.ljr), "rotation", 0.0f, 360.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zm() {
        String str = (String) ORZ.LJLLLL(s.LJLJJL(((MagicViewModel) Ml()).hv0(), new String[]{","}, 0, 6));
        if (str == null) {
            str = "";
        }
        AnonymousClass574 anonymousClass574 = (AnonymousClass574) _$_findCachedViewById(R.id.gbt);
        if (anonymousClass574 != null) {
            AnonymousClass574.LJII(anonymousClass574, str);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
        zm();
    }

    public final void nm(NLETrackSlot nLETrackSlot) {
        NLESegmentVideo LJJ;
        NLEResourceAV LJ;
        EnumC123874tb LJFF;
        List<ResourceItem> list;
        String str;
        AnonymousClass572 anonymousClass572;
        AnonymousClass574 anonymousClass574 = (AnonymousClass574) _$_findCachedViewById(R.id.gbt);
        if (anonymousClass574 != null && (LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI())) != null && (LJ = LJJ.LJ()) != null && (LJFF = LJ.LJFF()) != null) {
            AnonymousClass576 resourceListAdapter = anonymousClass574.getResourceListAdapter();
            if (resourceListAdapter != null) {
                list = resourceListAdapter.LJLLLLLL();
            } else {
                list = null;
            }
            if (LJFF == EnumC123874tb.IMAGE) {
                str = "photo";
            } else {
                str = "video";
            }
            if (list != null) {
                int i = 0;
                for (ResourceItem resourceItem : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ResourceItem resourceItem2 = resourceItem;
                        ActivityC45651qj requireActivity = requireActivity();
                        o.LJIIIIZZ(requireActivity, "requireActivity()");
                        if (!C173216qz.LIZLLL(resourceItem2, requireActivity)) {
                            boolean contains = resourceItem2.magicResourceTypeList.contains(str);
                            AnonymousClass576 anonymousClass576 = anonymousClass574.LJLJJI;
                            if (anonymousClass576 != null && i < anonymousClass576.LJLJJL.size() && (anonymousClass572 = (AnonymousClass572) ORZ.LJLLLLLL(i, anonymousClass576.LJLJJL)) != null) {
                                anonymousClass572.LJLJJL = contains;
                                anonymousClass576.notifyItemChanged(i, "enable_refresh");
                            }
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        CreativeInfo creativeInfo;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            Nl();
            MJ();
            ym();
            MagicViewModel magicViewModel = (MagicViewModel) Ml();
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            magicViewModel.getClass();
            IMagicProcessorService iMagicProcessorService = (IMagicProcessorService) C171096nZ.LIZ(IMagicProcessorService.class);
            if (iMagicProcessorService != null) {
                DavinciResourceLibraryLoader.INSTANCE.loadLibrary();
                InterfaceC126184xK magicProcessorManager = iMagicProcessorService.getMagicProcessorManager();
                DAVUnZipFunc dAVUnZipFunc = new DAVUnZipFunc() { // from class: X.5lB
                    @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
                    public final boolean unZip(String str, String str2, boolean z) {
                        boolean z2 = false;
                        if (str != null && !ujb.o.LJJJJJL(str) && str2 != null && !ujb.o.LJJJJJL(str2)) {
                            String LJFF = i0.LJFF(str2, "_temp");
                            File file = new File(LJFF);
                            if (file.exists()) {
                                C16880lQ.LLLZZIL(file);
                            }
                            try {
                                C10820be.LJIJI(str, LJFF);
                                String absolutePath = file.getAbsolutePath();
                                o.LJIIIIZZ(absolutePath, "unzipTemp.absolutePath");
                                if (new File(str2).exists()) {
                                    OR7.LLLIIL(new File(str2));
                                }
                                File file2 = new File(absolutePath);
                                File file3 = new File(str2);
                                if (file2.exists()) {
                                    z2 = file2.renameTo(file3);
                                }
                                if (z) {
                                    C16880lQ.LLLZZIL(new File(str));
                                }
                            } catch (Exception e) {
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                C15280iq.LIZJ("MagicViewModel", message);
                            }
                        }
                        return z2;
                    }
                };
                Context LLLLLILLIL = C16880lQ.LLLLLILLIL(requireActivity);
                o.LJIIIIZZ(LLLLLILLIL, "activity.applicationContext");
                VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
                if (LIZIZ != null) {
                    creativeInfo = LIZIZ.creativeInfo;
                } else {
                    creativeInfo = null;
                }
                C44684HgG c44684HgG = new C44684HgG(LLLLLILLIL, creativeInfo);
                C126874yR c126874yR = new C126874yR();
                c126874yR.LIZ = c44684HgG;
                c126874yR.LIZIZ = c44684HgG;
                c126874yR.LIZJ = c44684HgG;
                c126874yR.LIZLLL = c44684HgG;
                c126874yR.LJ = c44684HgG;
                magicProcessorManager.LIZLLL(requireActivity, c126874yR.LIZ(), dAVUnZipFunc);
                String dir = C43073GvN.LJFF(C60903NvH.LJIIJJI().LJJIJL().getPathService(), EnumC43651HBf.MAGIC_PROCESSOR, null, 6).getPath();
                NLEEditor LJJ = C79057V0z.LJJ(magicViewModel.getEditorContext());
                C5J1 V8 = magicViewModel.getEditorContext().getNleSession().V8();
                o.LJIIIIZZ(dir, "dir");
                magicProcessorManager.LIZ(C47261Igj.LJII(new C125224vm(), new C125214vl(), new C125254vp(LJJ, V8, dir)));
                C126924yW.LIZ = true;
                XBE.LJIIIIZZ.getClass();
                XBE LIZ = C84419XBf.LIZ();
                C1E4 c1e4 = new C1E4();
                synchronized (LIZ) {
                    LIZ.LJFF = c1e4;
                }
                C126784yI.LIZ().setMagicProcessorManager$tools_camera_edit_release(magicProcessorManager);
            }
            AnonymousClass574 anonymousClass574 = (AnonymousClass574) _$_findCachedViewById(R.id.gbt);
            if (anonymousClass574 != null) {
                C1291354z c1291354z = new C1291354z();
                c1291354z.LIZJ = "editor_pro_magic";
                c1291354z.LIZ = new ScrollCenterLayoutManager(getContext());
                c1291354z.LIZIZ = new C150135ur(11);
                c1291354z.LJFF = false;
                String string = requireActivity().getString(R.string.sjc);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_block;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                c2068389v.LIZIZ = C134845Qy.LIZ(24.0f);
                c2068389v.LIZJ = C134845Qy.LIZ(24.0f);
                ActivityC45651qj requireActivity2 = requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                SY9 LIZ2 = c2068389v.LIZ(requireActivity2);
                o.LJIIIIZZ(string, "getString(R.string.trans…ioneditorpro_button_none)");
                c1291354z.LJI = new AnonymousClass553(true, R.drawable.are, true, LIZ2, string, 96);
                c1291354z.LJIIJJI = new C1295956t(true, 62, 62, R.drawable.arc, 240);
                c1291354z.LJIIIIZZ = new C1296156v(54, 54, 8, R.drawable.are, R.drawable.are, 0.34f, 193);
                C56A c56a = C56A.DOWN;
                ActivityC45651qj requireActivity3 = requireActivity();
                o.LJIIIIZZ(requireActivity3, "requireActivity()");
                Integer LJI = C79045V0n.LJI(Integer.valueOf(R.attr.dl).intValue(), requireActivity3);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = -1;
                }
                ActivityC45651qj requireActivity4 = requireActivity();
                o.LJIIIIZZ(requireActivity4, "requireActivity()");
                Integer LJI2 = C79045V0n.LJI(Integer.valueOf(R.attr.dj).intValue(), requireActivity4);
                if (LJI2 != null) {
                    i2 = LJI2.intValue();
                } else {
                    i2 = -1;
                }
                c1291354z.LJII = new C57B(i, i2, c56a, 2, 0.34f, new AqS152S0100000_2(this, 952), C1286753f.LJLIL, 49);
                c1291354z.LJIIIZ = new C1295856s(0, 0, 0, null, 126);
                c1291354z.LJIILLIIL = true;
                c1291354z.LJIILL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
                c1291354z.LJIIZILJ = new C1287253k(new AqS152S0100000_2(this, 954), new C1RF());
                AnonymousClass551 anonymousClass551 = new AnonymousClass551(c1291354z);
                final AnonymousClass574 anonymousClass5742 = (AnonymousClass574) _$_findCachedViewById(R.id.gbt);
                if (anonymousClass5742 != null) {
                    anonymousClass5742.setResourceListInitListener(new C57U() { // from class: X.53u
                        @Override // X.C57U
                        public final void LIZ(boolean z, boolean z2) {
                            String string2;
                            final RecyclerView recyclerView;
                            AnonymousClass574 anonymousClass5743;
                            final AnonymousClass576 resourceListAdapter;
                            final LinearLayoutManager linearLayoutManager;
                            ViewTreeObserver viewTreeObserver;
                            MagicFragment.this._$_findCachedViewById(R.id.gbn).setVisibility(8);
                            if (z) {
                                MagicFragment.this._$_findCachedViewById(R.id.gbq).setVisibility(8);
                                anonymousClass5742.LIZIZ();
                                RecyclerView recyclerView2 = anonymousClass5742.getRecyclerView();
                                if (recyclerView2 != null && (viewTreeObserver = recyclerView2.getViewTreeObserver()) != null) {
                                    viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS56S0200000_2(anonymousClass5742, MagicFragment.this, 1));
                                }
                                final MagicFragment magicFragment = MagicFragment.this;
                                AnonymousClass574 anonymousClass5744 = (AnonymousClass574) magicFragment._$_findCachedViewById(R.id.gbt);
                                if (anonymousClass5744 != null && (recyclerView = anonymousClass5744.getRecyclerView()) != null && (anonymousClass5743 = (AnonymousClass574) magicFragment._$_findCachedViewById(R.id.gbt)) != null && (resourceListAdapter = anonymousClass5743.getResourceListAdapter()) != null) {
                                    C0A2 layoutManager = recyclerView.getLayoutManager();
                                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                                        recyclerView.LJIIIZ(new C0A3() { // from class: X.53t
                                            @Override // X.C0A3
                                            public final void LJIILIIL(View view2) {
                                                o.LJIIIZ(view2, "view");
                                            }

                                            @Override // X.C0A3
                                            public final void LJJIFFI(View view2) {
                                                C40517FvF LJJ2;
                                                o.LJIIIZ(view2, "view");
                                                int LLILL = LinearLayoutManager.this.LLILL();
                                                int LLILLJJLI = LinearLayoutManager.this.LLILLJJLI();
                                                if (LLILL != -1 && LLILLJJLI != -1) {
                                                    if (!magicFragment.LLFF) {
                                                        LJJ2 = new C40517FvF(LLILL, LLILLJJLI);
                                                    } else {
                                                        LJJ2 = C47261Igj.LJJ(resourceListAdapter.LJLLLLLL());
                                                    }
                                                    recyclerView.getClass();
                                                    Integer valueOf = Integer.valueOf(RecyclerView.LJJJJJ(view2));
                                                    int intValue = valueOf.intValue();
                                                    int i3 = LJJ2.LJLIL;
                                                    if (intValue <= LJJ2.LJLILLLLZI && i3 <= intValue && intValue != 0) {
                                                        AnonymousClass576 anonymousClass576 = resourceListAdapter;
                                                        MagicFragment magicFragment2 = magicFragment;
                                                        int intValue2 = valueOf.intValue();
                                                        ResourceItem resourceItem = (ResourceItem) ORZ.LJLLLLLL(intValue2, anonymousClass576.LJLLLLLL());
                                                        if (resourceItem != null) {
                                                            magicFragment2.vm(resourceItem, intValue2);
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                        recyclerView.LJIIJJI(new C0A6() { // from class: X.53v
                                            @Override // X.C0A6
                                            public final void LJIILJJIL(int i3, RecyclerView recyclerView3) {
                                                o.LJIIIZ(recyclerView3, "recyclerView");
                                                if (i3 == 1) {
                                                    MagicFragment.this.LLFF = true;
                                                    recyclerView.LJJLL(this);
                                                }
                                            }
                                        });
                                    }
                                }
                                if (!z2) {
                                    return;
                                }
                            } else {
                                MagicFragment.this._$_findCachedViewById(R.id.gbq).setVisibility(0);
                                if (!z2) {
                                    return;
                                }
                                MagicFragment magicFragment2 = MagicFragment.this;
                                magicFragment2.getClass();
                                boolean isFakeNetwork = C163626bW.LIZ().isFakeNetwork();
                                boolean isWeakNetwork = C163626bW.LIZ().isWeakNetwork();
                                ActivityC45651qj requireActivity5 = magicFragment2.requireActivity();
                                o.LJIIIIZZ(requireActivity5, "requireActivity()");
                                boolean LIZJ = C48203Ivv.LIZJ(requireActivity5);
                                if (isFakeNetwork) {
                                    string2 = magicFragment2.requireActivity().getString(R.string.e94);
                                } else if (isWeakNetwork) {
                                    string2 = magicFragment2.requireActivity().getString(R.string.e98);
                                } else if (LIZJ) {
                                    string2 = magicFragment2.requireActivity().getString(R.string.e93);
                                } else {
                                    string2 = magicFragment2.requireActivity().getString(R.string.e95);
                                }
                                o.LJIIIIZZ(string2, "if (isFakeNet) {\n       …eMessage_toast)\n        }");
                                ActivityC45651qj requireActivity6 = magicFragment2.requireActivity();
                                o.LJIIIIZZ(requireActivity6, "requireActivity()");
                                C26045AKb c26045AKb = new C26045AKb(requireActivity6);
                                c26045AKb.LJIIIZ(string2);
                                c26045AKb.LJIIJ();
                            }
                            VideoPublishEditModel em = MagicFragment.this.em();
                            if (em != null) {
                                EditorProContext editorContext = MagicFragment.this.Jl();
                                o.LJIIIZ(editorContext, "editorContext");
                                C145995oB LJFF = C5QW.LJFF(em, editorContext);
                                LJFF.LJI("is_editor_pro", "1");
                                FMX.LJIIL("magic_loading_fail", LJFF.LIZ);
                            }
                        }
                    });
                }
                AnonymousClass574 anonymousClass5743 = (AnonymousClass574) _$_findCachedViewById(R.id.gbt);
                if (anonymousClass5743 != null) {
                    anonymousClass5743.setResourceListMobListener(new C61576OEq());
                }
                anonymousClass574.LJ(anonymousClass551);
                AnonymousClass574 anonymousClass5744 = (AnonymousClass574) _$_findCachedViewById(R.id.gbt);
                if (anonymousClass5744 != null) {
                    anonymousClass5744.setOnItemClickListener(new C78926UyI() { // from class: X.4yy
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC1296256w
                        public final void LIZJ(final ResourceItem resourceItem, final int i3, boolean z) {
                            int i4;
                            EnumC126954yZ enumC126954yZ;
                            final String str;
                            final NLETrackSlot nLETrackSlot;
                            EnumC126884yS enumC126884yS;
                            if (z) {
                                if (resourceItem != null) {
                                    final MagicFragment magicFragment = MagicFragment.this;
                                    magicFragment.Jl().getPlayer().pause();
                                    String str2 = (String) ORZ.LJLLLL(s.LJLJJL(((MagicViewModel) magicFragment.Ml()).hv0(), new String[]{","}, 0, 6));
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    if (o.LJ(str2, resourceItem.getResourceId())) {
                                        if (ujb.o.LJJJJJL(str2)) {
                                            NLETrackSlot selectedTrackSlot = magicFragment.Jl().getSelectedTrackSlot();
                                            if (selectedTrackSlot != null) {
                                                magicFragment.Jl().getPlayer().fa(selectedTrackSlot.getStartTime(), new AnonymousClass519() { // from class: X.4x3
                                                    @Override // X.AnonymousClass519
                                                    public final void LIZ(int i5) {
                                                        MagicFragment.this.Jl().getPlayer().pause();
                                                    }
                                                });
                                            }
                                        } else {
                                            ((MagicViewModel) magicFragment.Ml()).iv0();
                                        }
                                    } else if (C78609UtB.LJJJJJ(resourceItem)) {
                                        AnonymousClass574 magic_resource_list = (AnonymousClass574) magicFragment._$_findCachedViewById(R.id.gbt);
                                        o.LJIIIIZZ(magic_resource_list, "magic_resource_list");
                                        AnonymousClass574.LJI(magic_resource_list, "", 14);
                                        final MagicViewModel magicViewModel2 = (MagicViewModel) magicFragment.Ml();
                                        String string2 = magicFragment.requireActivity().getString(R.string.sjc);
                                        o.LJIIIIZZ(string2, "requireActivity().getStr…ioneditorpro_button_none)");
                                        magicViewModel2.getClass();
                                        NLETrackSlot selectedTrackSlot2 = magicViewModel2.getEditorContext().getSelectedTrackSlot();
                                        if (selectedTrackSlot2 != null) {
                                            long LJIIJJI = magicViewModel2.getEditorContext().getMainTrack().LJIIJJI();
                                            NLEModel beforeActionNLEModel = NLEModel.dynamicCast(C79057V0z.LJJI(magicViewModel2.getEditorContext()).deepClone());
                                            NLETrackSlot LIZ3 = NLETrackSlot.LIZ(selectedTrackSlot2.deepClone());
                                            EditModelProvider.Companion.getClass();
                                            InterfaceC126184xK magicProcessorManager$tools_camera_edit_release = C126784yI.LIZ().getMagicProcessorManager$tools_camera_edit_release();
                                            if (magicProcessorManager$tools_camera_edit_release != null) {
                                                magicViewModel2.jv0(selectedTrackSlot2, magicProcessorManager$tools_camera_edit_release);
                                                magicViewModel2.getEditorContext().getMainTrack().LJJIFFI();
                                            }
                                            o.LJIIIIZZ(beforeActionNLEModel, "beforeActionNLEModel");
                                            magicViewModel2.gv0(LJIIJJI, beforeActionNLEModel, LIZ3);
                                            g0.LJIILIIL(C79057V0z.LJJ(magicViewModel2.getEditorContext()), true, C6YK.LIZ(new C139795eB(EnumC126814yL.MAGIC.getNameId(), null, null, string2, null, 22)), false, false, 12);
                                            magicViewModel2.getEditorContext().getPlayer().fa(selectedTrackSlot2.getStartTime(), new AnonymousClass519() { // from class: X.4ve
                                                @Override // X.AnonymousClass519
                                                public final void LIZ(int i5) {
                                                    MagicViewModel.this.getEditorContext().getPlayer().pause();
                                                }
                                            });
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        ArrayList<String> arrayList2 = resourceItem.magicResourceTypeList;
                                        o.LJIIIIZZ(arrayList2, "item.magicResourceTypeList");
                                        Iterator<String> it = arrayList2.iterator();
                                        while (it.hasNext()) {
                                            if (o.LJ(it.next(), "photo")) {
                                                enumC126884yS = EnumC126884yS.PHOTO;
                                            } else {
                                                enumC126884yS = EnumC126884yS.VIDEO;
                                            }
                                            arrayList.add(enumC126884yS);
                                        }
                                        magicFragment.LJZI = C79057V0z.LJJI(magicFragment.Jl()).deepClone(false);
                                        NLETrackSlot selectedTrackSlot3 = magicFragment.Jl().getSelectedTrackSlot();
                                        if (selectedTrackSlot3 != null) {
                                            i4 = magicFragment.Jl().getMainTrack().LJIILJJIL(selectedTrackSlot3);
                                        } else {
                                            i4 = -1;
                                        }
                                        magicFragment.LJZL = i4;
                                        String str3 = resourceItem.gameplayType;
                                        EnumC126954yZ enumC126954yZ2 = EnumC126954yZ.SERVER_GAME_PLAY;
                                        if (o.LJ(str3, enumC126954yZ2.getTypeName())) {
                                            enumC126954yZ = enumC126954yZ2;
                                        } else {
                                            enumC126954yZ = EnumC126954yZ.CLIENT_GAME_PLAY;
                                            if (!o.LJ(str3, enumC126954yZ.getTypeName())) {
                                                enumC126954yZ = EnumC126954yZ.COMBINE_GAME_PLAY;
                                            }
                                        }
                                        String name = resourceItem.getName();
                                        o.LJIIIIZZ(name, "item.name");
                                        String resourceId = resourceItem.getResourceId();
                                        o.LJIIIIZZ(resourceId, "item.resourceId");
                                        String effectId = resourceItem.getEffectId();
                                        o.LJIIIIZZ(effectId, "item.effectId");
                                        String path = resourceItem.getPath();
                                        o.LJIIIIZZ(path, "item.path");
                                        C125244vo c125244vo = new C125244vo(name, resourceId, effectId, path, arrayList, enumC126954yZ, 64);
                                        String str4 = resourceItem.gameplayType;
                                        if (o.LJ(str4, enumC126954yZ2.getTypeName())) {
                                            str = "server";
                                        } else if (o.LJ(str4, EnumC126954yZ.CLIENT_GAME_PLAY.getTypeName())) {
                                            str = "client";
                                        } else {
                                            str = "combine";
                                        }
                                        final long LJIIJJI2 = magicFragment.Jl().getMainTrack().LJIIJJI();
                                        final NLEModel dynamicCast = NLEModel.dynamicCast(C79057V0z.LJJI(magicFragment.Jl()).deepClone());
                                        NLETrackSlot selectedTrackSlot4 = magicFragment.Jl().getSelectedTrackSlot();
                                        if (selectedTrackSlot4 != null) {
                                            nLETrackSlot = NLETrackSlot.LIZ(selectedTrackSlot4.deepClone());
                                        } else {
                                            nLETrackSlot = null;
                                        }
                                        magicFragment.LLD = System.currentTimeMillis();
                                        MagicViewModel magicViewModel3 = (MagicViewModel) magicFragment.Ml();
                                        InterfaceC126134xF interfaceC126134xF = new InterfaceC126134xF() { // from class: X.4z0
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // X.InterfaceC126134xF
                                            public final void onSuccess() {
                                                A90 a90;
                                                NLESegmentFilter LIZIZ2;
                                                NLESegment LJI3;
                                                NLETrackSlot selectedTrackSlot5 = MagicFragment.this.Jl().getSelectedTrackSlot();
                                                int i5 = i3;
                                                int[] LIZ4 = C170236mB.LIZ();
                                                int i6 = LIZ4[i5 % LIZ4.length];
                                                if (selectedTrackSlot5 != null) {
                                                    NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) ORZ.LJLLLLLL(0, selectedTrackSlot5.LJIIJ());
                                                    if (nLEVideoEffect != null) {
                                                        MagicFragment magicFragment2 = MagicFragment.this;
                                                        ResourceItem resourceItem2 = resourceItem;
                                                        if (C124614un.LJIIIZ(nLEVideoEffect)) {
                                                            magicFragment2.getClass();
                                                            MagicFragment.lm(selectedTrackSlot5, i6, resourceItem2);
                                                        }
                                                    }
                                                    NLETrackSlot LJIIIIZZ = selectedTrackSlot5.LJIIIIZZ();
                                                    if (LJIIIIZZ != null && (LJI3 = LJIIIIZZ.LJI()) != null) {
                                                        MagicFragment magicFragment3 = MagicFragment.this;
                                                        ResourceItem resourceItem3 = resourceItem;
                                                        magicFragment3.getClass();
                                                        MagicFragment.lm(LJI3, i6, resourceItem3);
                                                    }
                                                    NLEFilter nLEFilter = (NLEFilter) ORZ.LJLLLLLL(0, selectedTrackSlot5.LJ());
                                                    if (nLEFilter != null && (LIZIZ2 = nLEFilter.LIZIZ()) != null) {
                                                        MagicFragment magicFragment4 = MagicFragment.this;
                                                        ResourceItem resourceItem4 = resourceItem;
                                                        magicFragment4.getClass();
                                                        MagicFragment.lm(LIZIZ2, i6, resourceItem4);
                                                    }
                                                }
                                                MagicFragment.this.Jl().getMainTrack().LJJIFFI();
                                                MagicViewModel magicViewModel4 = (MagicViewModel) MagicFragment.this.Ml();
                                                long j = LJIIJJI2;
                                                NLEModel beforeActionNLEModel2 = dynamicCast;
                                                o.LJIIIIZZ(beforeActionNLEModel2, "beforeActionNLEModel");
                                                magicViewModel4.gv0(j, beforeActionNLEModel2, nLETrackSlot);
                                                A90 a902 = MagicFragment.this.LJZ;
                                                if (a902 != null && a902.isShowing() && (a90 = MagicFragment.this.LJZ) != null) {
                                                    a90.LIZLLL(100.0f);
                                                }
                                                MagicFragment.this.sm(resourceItem, i3, "apply_succeed");
                                                long currentTimeMillis = System.currentTimeMillis() - MagicFragment.this.LLD;
                                                String effectId2 = resourceItem.getEffectId();
                                                o.LJIIIIZZ(effectId2, "item.effectId");
                                                String name2 = resourceItem.getName();
                                                o.LJIIIIZZ(name2, "item.name");
                                                C5QW.LJJIIZI(0, currentTimeMillis, null, "", effectId2, name2, str);
                                                EditorProContext Jl = MagicFragment.this.Jl();
                                                String resourceId2 = resourceItem.getResourceId();
                                                o.LJIIIIZZ(resourceId2, "item.resourceId");
                                                C79057V0z.LJJJJLI(Jl, "magic_changed_event", new C124904vG(resourceId2), true);
                                                String name3 = resourceItem.getName();
                                                String nameId = EnumC126814yL.MAGIC.getNameId();
                                                o.LJIIIIZZ(name3, "name");
                                                C2ND.LIZ(new AqS149S0200000_2(MagicFragment.this, new C139795eB(nameId, null, null, name3, null, 22), 97), 0L);
                                            }

                                            /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
                                            
                                                if (X.C76800UCe.LIZ == null) goto L6;
                                             */
                                            @Override // X.InterfaceC126134xF
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final void onStart() {
                                                /*
                                                    r11 = this;
                                                    com.ss.android.ugc.gamora.editorpro.bottom.panel.MagicFragment r3 = com.ss.android.ugc.gamora.editorpro.bottom.panel.MagicFragment.this
                                                    com.ss.ugc.android.editor.base.resource.ResourceItem r2 = r2
                                                    int r0 = r3
                                                    r3.getClass()
                                                    X.OSZ r1 = new X.OSZ
                                                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                                    r1.<init>(r2, r0)
                                                    r3.LL = r1
                                                    X.A90 r1 = r3.LJZ
                                                    if (r1 == 0) goto L20
                                                    r0 = 0
                                                    r1.LIZLLL(r0)
                                                    X.UCe r0 = X.C76800UCe.LIZ
                                                    if (r0 != 0) goto L49
                                                L20:
                                                    X.A90 r2 = new X.A90
                                                    X.1qj r1 = r3.requireActivity()
                                                    java.lang.String r0 = "requireActivity()"
                                                    kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                                                    r2.<init>(r1)
                                                    X.1qj r1 = r3.requireActivity()
                                                    r0 = 2131827351(0x7f111a97, float:1.9287612E38)
                                                    java.lang.String r0 = r1.getString(r0)
                                                    r2.LIZJ(r0)
                                                    r0 = 1
                                                    r2.LJ(r0)
                                                    X.4z1 r0 = new X.4z1
                                                    r0.<init>()
                                                    r2.LJLJJLL = r0
                                                    r3.LJZ = r2
                                                L49:
                                                    X.A90 r7 = r3.LJZ
                                                    if (r7 == 0) goto L70
                                                    X.0Dg r3 = new X.0Dg
                                                    r0 = 2
                                                    r3.<init>(r0)
                                                    r2 = 0
                                                    java.lang.Object[] r8 = new java.lang.Object[r2]
                                                    X.Pk0 r10 = new X.Pk0
                                                    java.lang.String r1 = "()V"
                                                    java.lang.String r0 = "7489727022692521986"
                                                    r10.<init>(r2, r1, r0)
                                                    r4 = 300000(0x493e0, float:4.2039E-40)
                                                    java.lang.String r5 = "com/bytedance/tux/status/loading/TuxLoadingProgressHUD"
                                                    java.lang.String r6 = "show"
                                                    java.lang.String r9 = "void"
                                                    X.Ff9 r0 = r3.LIZJ(r4, r5, r6, r7, r8, r9, r10)
                                                    boolean r0 = r0.LIZ
                                                    if (r0 == 0) goto L71
                                                L70:
                                                    return
                                                L71:
                                                    r7.show()
                                                    goto L70
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C127224z0.onStart():void");
                                            }

                                            @Override // X.InterfaceC126134xF
                                            public final void LIZ(C126124xE c126124xE) {
                                                A90 a90;
                                                MagicFragment.this.xm();
                                                A90 a902 = MagicFragment.this.LJZ;
                                                if (a902 != null && a902.isShowing() && (a90 = MagicFragment.this.LJZ) != null) {
                                                    a90.dismiss();
                                                }
                                                MagicFragment.this.sm(resourceItem, i3, "apply_error");
                                                long currentTimeMillis = System.currentTimeMillis();
                                                Integer valueOf = Integer.valueOf(c126124xE.LJLIL);
                                                String str5 = c126124xE.LJLILLLLZI;
                                                long j = currentTimeMillis - MagicFragment.this.LLD;
                                                String effectId2 = resourceItem.getEffectId();
                                                o.LJIIIIZZ(effectId2, "item.effectId");
                                                String name2 = resourceItem.getName();
                                                o.LJIIIIZZ(name2, "item.name");
                                                C5QW.LJJIIZI(1, j, valueOf, str5, effectId2, name2, str);
                                                ActivityC45651qj requireActivity5 = MagicFragment.this.requireActivity();
                                                o.LJIIIIZZ(requireActivity5, "requireActivity()");
                                                C26045AKb c26045AKb = new C26045AKb(requireActivity5);
                                                c26045AKb.LJIIIIZZ(R.string.e9b);
                                                c26045AKb.LJIIJ();
                                            }

                                            @Override // X.InterfaceC126134xF
                                            public final void onProgress(int i5) {
                                                A90 a90;
                                                A90 a902 = MagicFragment.this.LJZ;
                                                if (a902 != null && a902.isShowing() && (a90 = MagicFragment.this.LJZ) != null) {
                                                    a90.LIZLLL(i5);
                                                }
                                            }
                                        };
                                        magicViewModel3.getClass();
                                        NLETrackSlot selectedTrackSlot5 = magicViewModel3.getEditorContext().getSelectedTrackSlot();
                                        if (selectedTrackSlot5 != null) {
                                            C125184vi c125184vi = new C125184vi(c125244vo, selectedTrackSlot5, C79057V0z.LJJI(magicViewModel3.getEditorContext()));
                                            EditModelProvider.Companion.getClass();
                                            InterfaceC126184xK magicProcessorManager$tools_camera_edit_release2 = C126784yI.LIZ().getMagicProcessorManager$tools_camera_edit_release();
                                            if (magicProcessorManager$tools_camera_edit_release2 != null) {
                                                magicViewModel3.jv0(selectedTrackSlot5, magicProcessorManager$tools_camera_edit_release2);
                                                magicProcessorManager$tools_camera_edit_release2.LJ(c125184vi, interfaceC126134xF);
                                            }
                                        }
                                    }
                                }
                            } else {
                                ActivityC45651qj requireActivity5 = MagicFragment.this.requireActivity();
                                o.LJIIIIZZ(requireActivity5, "requireActivity()");
                                C26045AKb c26045AKb = new C26045AKb(requireActivity5);
                                c26045AKb.LJIIIZ(MagicFragment.this.requireActivity().getString(R.string.e01));
                                c26045AKb.LJIIJ();
                            }
                            if (i3 != 0) {
                                MagicFragment.this.qm(resourceItem, i3, true);
                            }
                        }

                        @Override // X.C78926UyI, X.InterfaceC1296256w
                        public final void LIZ(ResourceItem resourceItem, int i3, boolean z, C127254z3 c127254z3) {
                            Object LJLLLLLL;
                            int i4;
                            MagicFragment.this.Jl().getPlayer().pause();
                            if (resourceItem != null) {
                                MagicFragment magicFragment = MagicFragment.this;
                                if (!z) {
                                    ArrayList<String> arrayList = resourceItem.magicResourceTypeList;
                                    if (arrayList != null && (LJLLLLLL = ORZ.LJLLLLLL(0, arrayList)) != null) {
                                        if (o.LJ(LJLLLLLL, "photo")) {
                                            i4 = R.string.dyc;
                                        } else {
                                            i4 = R.string.dyg;
                                        }
                                        ActivityC45651qj requireActivity5 = magicFragment.requireActivity();
                                        o.LJIIIIZZ(requireActivity5, "requireActivity()");
                                        C26045AKb c26045AKb = new C26045AKb(requireActivity5);
                                        c26045AKb.LJIIIIZZ(i4);
                                        c26045AKb.LJIIJ();
                                    }
                                    magicFragment.qm(resourceItem, i3, false);
                                    return;
                                }
                                if (o.LJ(resourceItem.gameplayType, EnumC126954yZ.SERVER_GAME_PLAY.getTypeName()) || o.LJ(resourceItem.gameplayType, EnumC126954yZ.COMBINE_GAME_PLAY.getTypeName())) {
                                    AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(c127254z3, 583);
                                    magicFragment.getClass();
                                    if (!C132845Jg.LIZ(C77339UWx.LIZJ())) {
                                        ActivityC45651qj requireActivity6 = magicFragment.requireActivity();
                                        o.LJIIIIZZ(requireActivity6, "requireActivity()");
                                        C26227ARb c26227ARb = new C26227ARb(requireActivity6);
                                        c26227ARb.LJ(R.string.e99);
                                        c26227ARb.LIZ(R.string.dyd);
                                        UC0.LIZJ(c26227ARb, new AqS133S0200000_2(magicFragment, aqS168S0100000_2, 138));
                                        c26227ARb.LJI().LIZLLL();
                                        VideoPublishEditModel em = magicFragment.em();
                                        if (em == null) {
                                            return;
                                        }
                                        EditorProContext editorContext = magicFragment.Jl();
                                        o.LJIIIZ(editorContext, "editorContext");
                                        C145995oB LJFF = C5QW.LJFF(em, editorContext);
                                        LJFF.LJI("creation_tool", "magic");
                                        LJFF.LJI("is_editor_pro", "1");
                                        FMX.LJIIL("upload_authorization_popup_show", LJFF.LIZ);
                                        return;
                                    }
                                    magicFragment.om(true, Boolean.TRUE, new AqS168S0100000_2(aqS168S0100000_2, 587));
                                    return;
                                }
                                ActivityC45651qj requireActivity7 = magicFragment.requireActivity();
                                o.LJIIIIZZ(requireActivity7, "requireActivity()");
                                if (C173216qz.LIZLLL(resourceItem, requireActivity7)) {
                                    c127254z3.LIZ(false);
                                } else {
                                    magicFragment.om(false, null, new AqS168S0100000_2(c127254z3, 584));
                                }
                            }
                        }
                    });
                }
            }
            C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.gbm), new ACListenerS22S0100000_2(this, 145));
            MutableLiveData LJII = C79057V0z.LJII(Jl(), "selected_nle_track_slot");
            if (LJII != null) {
                LJII.observe(requireActivity(), new AObserverS70S0100000_2(this, 304));
            }
            MutableLiveData LJII2 = C79057V0z.LJII(Jl(), "magic_changed_event");
            if (LJII2 != null) {
                LJII2.observe(requireActivity(), new AObserverS70S0100000_2(this, 305));
            }
            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.gbq), new ACListenerS22S0100000_2(this, 146));
            VideoPublishEditModel em = em();
            if (em != null) {
                EditorProContext editorContext = Jl();
                o.LJIIIZ(editorContext, "editorContext");
                C145995oB LJFF = C5QW.LJFF(em, editorContext);
                LJFF.LJI("is_editor_pro", "1");
                FMX.LJIIL("magic_panel_show", LJFF.LIZ);
            }
        }
    }

    public final void vm(ResourceItem resourceItem, int i) {
        ArrayList<String> arrayList;
        Object LJLLLLLL;
        NLETrackSlot selectedTrackSlot;
        String str;
        VideoPublishEditModel em = em();
        if (em != null && (arrayList = resourceItem.magicResourceTypeList) != null && (LJLLLLLL = ORZ.LJLLLLLL(0, arrayList)) != null && (selectedTrackSlot = Jl().getSelectedTrackSlot()) != null) {
            String str2 = "photo";
            if (o.LJ(LJLLLLLL, "photo")) {
                str = "only_photo";
            } else {
                str = "only_video";
            }
            if (!C124574uj.LJJJJJ(selectedTrackSlot)) {
                str2 = "video";
            }
            boolean LJ = o.LJ(LJLLLLLL, str2);
            EditorProContext editorContext = Jl();
            String name = resourceItem.getName();
            o.LJIIIIZZ(name, "item.name");
            String effectId = resourceItem.getEffectId();
            o.LJIIIIZZ(effectId, "item.effectId");
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(em, editorContext);
            LJFF.LJI("tab_name", name);
            LJFF.LJI("magic_id", effectId);
            LJFF.LIZ(i, "index");
            LJFF.LJI("magic_type", str);
            LJFF.LIZ(LJ ? 1 : 0, "is_gray");
            LJFF.LJI("is_editor_pro", "1");
            FMX.LJIIL("magic_show", LJFF.LIZ);
        }
    }

    public static void lm(NLENode nLENode, int i, ResourceItem resourceItem) {
        nLENode.setExtra("nleExtraEffectSelectedColor", String.valueOf(i));
        nLENode.setExtra("nleExtraEffectKey", resourceItem.getEffectId());
        nLENode.setExtra("nleExtraEffectTag", resourceItem.extra);
        nLENode.setExtra("original_effect_name", resourceItem.getName());
        nLENode.setExtra("nleExtraIsEditPro", "true");
    }

    public final void om(final boolean z, final Boolean bool, final InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        String str;
        if (!C1B8.LIZJ()) {
            ActivityC45651qj requireActivity = requireActivity();
            VideoPublishEditModel em = em();
            if (em == null || (str = em.enterFrom) == null) {
                str = "";
            }
            J9P.LIZIZ(requireActivity, "video_edit_page", str, null, new JJ4() { // from class: X.53e
                @Override // X.JJ4
                public final void LIZ() {
                    if (z && o.LJ(bool, Boolean.FALSE)) {
                        C132845Jg.LIZIZ(C77339UWx.LIZJ());
                    }
                    interfaceC88472Yns.invoke(Boolean.FALSE);
                }

                @Override // X.JJ4
                public final void LIZIZ() {
                    interfaceC88472Yns.invoke(Boolean.TRUE);
                }
            });
            return;
        }
        if (z && o.LJ(bool, Boolean.FALSE)) {
            C132845Jg.LIZIZ(C77339UWx.LIZJ());
        }
        interfaceC88472Yns.invoke(Boolean.FALSE);
    }

    public final void qm(ResourceItem resourceItem, int i, boolean z) {
        ArrayList<String> arrayList;
        Object LJLLLLLL;
        String str;
        VideoPublishEditModel em = em();
        if (em != null && resourceItem != null && (arrayList = resourceItem.magicResourceTypeList) != null && (LJLLLLLL = ORZ.LJLLLLLL(0, arrayList)) != null) {
            if (o.LJ(LJLLLLLL, "photo")) {
                str = "only_photo";
            } else {
                str = "only_video";
            }
            if (z) {
                EditorProContext editorContext = Jl();
                String name = resourceItem.getName();
                o.LJIIIIZZ(name, "item.name");
                String effectId = resourceItem.getEffectId();
                o.LJIIIIZZ(effectId, "item.effectId");
                o.LJIIIZ(editorContext, "editorContext");
                C145995oB LJFF = C5QW.LJFF(em, editorContext);
                LJFF.LJI("tab_name", name);
                LJFF.LJI("magic_id", effectId);
                LJFF.LIZ(i, "index");
                LJFF.LJI("magic_type", str);
                LJFF.LJI("is_editor_pro", "1");
                FMX.LJIIL("magic_click", LJFF.LIZ);
                return;
            }
            EditorProContext editorContext2 = Jl();
            String name2 = resourceItem.getName();
            o.LJIIIIZZ(name2, "item.name");
            String effectId2 = resourceItem.getEffectId();
            o.LJIIIIZZ(effectId2, "item.effectId");
            o.LJIIIZ(editorContext2, "editorContext");
            C145995oB LJFF2 = C5QW.LJFF(em, editorContext2);
            LJFF2.LJI("tab_name", name2);
            LJFF2.LJI("magic_id", effectId2);
            LJFF2.LIZ(i, "index");
            LJFF2.LJI("magic_type", str);
            LJFF2.LJI("is_editor_pro", "1");
            FMX.LJIIL("magic_disable_click_popup", LJFF2.LIZ);
        }
    }

    public final void sm(ResourceItem resourceItem, int i, String str) {
        ArrayList<String> arrayList;
        Object LJLLLLLL;
        String str2;
        VideoPublishEditModel em = em();
        if (em != null && (arrayList = resourceItem.magicResourceTypeList) != null && (LJLLLLLL = ORZ.LJLLLLLL(0, arrayList)) != null) {
            if (o.LJ(LJLLLLLL, "photo")) {
                str2 = "only_photo";
            } else {
                str2 = "only_video";
            }
            EditorProContext editorContext = Jl();
            String name = resourceItem.getName();
            o.LJIIIIZZ(name, "item.name");
            String effectId = resourceItem.getEffectId();
            o.LJIIIIZZ(effectId, "item.effectId");
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(em, editorContext);
            LJFF.LJI("tab_name", name);
            LJFF.LJI("magic_id", effectId);
            LJFF.LIZ(i, "index");
            LJFF.LJI("magic_type", str2);
            LJFF.LJI("is_editor_pro", "1");
            LJFF.LJI("to_status", str);
            FMX.LJIIL("magic_apply_popup", LJFF.LIZ);
        }
    }
}
