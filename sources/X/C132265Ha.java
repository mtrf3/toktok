package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.ITrackService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.PlayPositionState;
import java.util.Iterator;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS14S0000100_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS27S0100100_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132265Ha extends AbstractC48231ut<InterfaceC127634zf, Object, C132315Hf, C77633UdR> implements InterfaceC135635Tz, InterfaceC127634zf {
    public final C82622Wbi LJLL;
    public boolean LJLLI;

    private final VideoPublishEditModel LLFFF() {
        return C132805Jc.LIZIZ(EditModelProvider.Companion);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C77633UdR> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 809);
    }

    public final EditorProContext LLF() {
        EditorProContext.Companion.getClass();
        return C124994vP.LIZ();
    }

    public final void LLIIIL() {
        VecNLETrackSlotSPtr LJIILLIIL;
        NLETrackSlot LJZI;
        if (this.LJLLI) {
            return;
        }
        LLF().getPlayer().pause();
        NLETrack mainTrack = C79057V0z.LJJI(LLF()).getMainTrack();
        if (mainTrack == null || (LJIILLIIL = mainTrack.LJIILLIIL()) == null || (LJZI = LJZI(this, null, 1, null)) == null) {
            return;
        }
        int indexOf = LJIILLIIL.indexOf(LJZI);
        if (indexOf == LJIILLIIL.size() - 1) {
            if (!C132285Hc.LIZLLL) {
                return;
            }
            LLIFFJFJJ(C124574uj.LJJLIIIJJIZ(C79057V0z.LJJII(LLF())), LJZI);
            C5QW.LJJIL(LLFFF(), LLF(), "anchor_last_frame");
            return;
        }
        NLETrackSlot nextSlot = LJIILLIIL.get(indexOf + 1);
        long[] jArr = new long[2];
        NLETrack mainTrack2 = LLF().getMainTrack();
        o.LJIIIIZZ(nextSlot, "nextSlot");
        C124774v3.LIZ(mainTrack2, nextSlot, jArr);
        LLIFFJFJJ(jArr[0] + 1000, nextSlot);
        C5QW.LJJIL(LLFFF(), LLF(), "switch_to_next_clip");
    }

    public final void LLIILZL() {
        VecNLETrackSlotSPtr LJIILLIIL;
        NLETrackSlot LJZI;
        if (this.LJLLI) {
            return;
        }
        LLF().getPlayer().pause();
        NLETrack mainTrack = C79057V0z.LJJI(LLF()).getMainTrack();
        if (mainTrack == null || (LJIILLIIL = mainTrack.LJIILLIIL()) == null || (LJZI = LJZI(this, null, 1, null)) == null) {
            return;
        }
        int indexOf = LJIILLIIL.indexOf(LJZI);
        if (indexOf == 0) {
            if (!C132285Hc.LIZLLL) {
                return;
            }
            LLIFFJFJJ(1000L, LJZI);
            C5QW.LJJIL(LLFFF(), LLF(), "anchor_first_frame");
            return;
        }
        NLETrackSlot preSlot = LJIILLIIL.get(indexOf - 1);
        long[] jArr = new long[2];
        NLETrack mainTrack2 = LLF().getMainTrack();
        o.LJIIIIZZ(preSlot, "preSlot");
        C124774v3.LIZ(mainTrack2, preSlot, jArr);
        LLIFFJFJJ(jArr[0] + 1000, preSlot);
        C5QW.LJJIL(LLFFF(), LLF(), "switch_to_previous_clip");
    }

    private final C1284452i getMultiTrackController() {
        ITrackService LIZJ = C127834zz.LIZJ();
        if (LIZJ != null) {
            return LIZJ.getMultiTrackController();
        }
        return null;
    }

    private final C58D jB() {
        C1284452i multiTrackController = getMultiTrackController();
        if (multiTrackController != null) {
            return multiTrackController.LJLIL;
        }
        return null;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C132315Hf> LJJLIIIJJI() {
        return C132345Hi.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    private final NLETrackSlot LJLZ(Long l) {
        long LJJLIIIJJIZ;
        VecNLETrackSlotSPtr LJIILLIIL;
        if (l != null) {
            LJJLIIIJJIZ = l.longValue();
        } else {
            LJJLIIIJJIZ = C124574uj.LJJLIIIJJIZ(LLF().getPlayer().H9());
        }
        NLETrack mainTrack = C79057V0z.LJJI(LLF()).getMainTrack();
        if (mainTrack == null || (LJIILLIIL = mainTrack.LJIILLIIL()) == null) {
            return null;
        }
        Iterator<NLETrackSlot> it = LJIILLIIL.iterator();
        while (it.hasNext()) {
            NLETrackSlot it2 = it.next();
            long[] jArr = new long[2];
            NLETrack mainTrack2 = LLF().getMainTrack();
            o.LJIIIIZZ(it2, "it");
            C124774v3.LIZ(mainTrack2, it2, jArr);
            long j = jArr[0];
            if (LJJLIIIJJIZ <= jArr[1] && j <= LJJLIIIJJIZ) {
                return it2;
            }
        }
        return null;
    }

    private final void LLILL(NLETrackSlot nLETrackSlot) {
        NLETrack mainTrack;
        if (!C132285Hc.LIZIZ) {
            return;
        }
        NLEModel LJJI = C79057V0z.LJJI(LLF());
        if (!C132285Hc.LIZLLL && ((mainTrack = LJJI.getMainTrack()) == null || mainTrack.LJIILL().size() < 2)) {
            LJJZZI(C132295Hd.LJLIL);
        } else if (C132285Hc.LIZJ) {
            LJJZZI(new AqS133S0200000_2(LJJI, nLETrackSlot, 113));
        } else {
            LJJZZI(C132305He.LJLIL);
        }
    }

    @Override // X.InterfaceC127634zf
    public void Cv(long j) {
        LLIIZ(j);
    }

    @Override // X.InterfaceC127634zf
    public void LJZ(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        LLILL(LLF().getSelectedTrackSlot());
    }

    public final void LLIIZ(long j) {
        VecNLETrackSlotSPtr LJIILLIIL;
        if (!C132285Hc.LIZIZ || !LJJLJ().LJLIL) {
            return;
        }
        if (!C132285Hc.LIZLLL) {
            NLETrackSlot LJLZ = LJLZ(Long.valueOf(j));
            NLETrack mainTrack = C79057V0z.LJJI(LLF()).getMainTrack();
            if (mainTrack == null || (LJIILLIIL = mainTrack.LJIILLIIL()) == null) {
                return;
            }
            LJJZZI(new AqS133S0200000_2(LJIILLIIL, LJLZ, 111));
            LJJZZI(new AqS133S0200000_2(LJIILLIIL, LJLZ, 112));
            return;
        }
        LJJZZI(new AqS14S0000100_2(j, 8));
        LJJZZI(new AqS27S0100100_2(j, this, 3));
    }

    @Override // X.InterfaceC127634zf
    public void kk(boolean z) {
        if (z) {
            LJJZZI(C132325Hg.LJLIL);
        }
    }

    @Override // X.InterfaceC127634zf
    public void pu(NLETrackSlot nLETrackSlot) {
        LLILL(nLETrackSlot);
        LLIIZ(C124574uj.LJJLIIIJJIZ(LLF().getPlayer().H9()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C132265Ha(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
    }

    private final void LLIFFJFJJ(long j, NLETrackSlot nLETrackSlot) {
        boolean z;
        this.LJLLI = true;
        NLETrack selectedTrack = LLF().getSelectedTrack();
        if (selectedTrack != null && selectedTrack.LJIIJ()) {
            z = true;
            C1284452i multiTrackController = getMultiTrackController();
            if (multiTrackController != null) {
                C1284452i.LJIJ(multiTrackController, nLETrackSlot, EnumC127354zD.CLIP, false, 20);
            }
        } else {
            z = false;
        }
        C58D jB = jB();
        if (jB != null) {
            C58D.updatePlayStateSmoothly$default(jB, new PlayPositionState(j, false, false, 6, null), false, new C132275Hb(z, this, nLETrackSlot, j), 2, null);
        }
    }

    public static /* synthetic */ NLETrackSlot LJZI(C132265Ha c132265Ha, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return c132265Ha.LJLZ(l);
    }
}
