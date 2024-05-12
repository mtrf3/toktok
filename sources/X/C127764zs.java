package X;

import Y.AObserverS70S0100000_2;
import android.os.Message;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;
import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.components.base.api.ITrackService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.ss.ugc.android.editor.track.CurrentSlotInfo;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C127764zs extends AnonymousClass503 {
    public final ActivityC45651qj LJLIL;
    public final IFunctionBarService LJLILLLLZI;
    public final IPreviewService LJLJI;
    public final ITrackService LJLJJI;
    public final IConsoleBarService LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public NLEModel LJLJLJ;
    public final C5DP LJLJLLL;
    public boolean LJLL;
    public volatile boolean LJLLI;
    public boolean LJLLILLLL;
    public volatile boolean LJLLJ;
    public volatile boolean LJLLL;
    public final C127794zv LJLLLL;

    private final LifecycleOwner LJIIZILJ() {
        return (LifecycleOwner) this.LJLJL.getValue();
    }

    public final C52T LJIILJJIL() {
        IConsoleBarService iConsoleBarService = this.LJLJJL;
        if (iConsoleBarService != null) {
            return iConsoleBarService.getConsoleBar();
        }
        return null;
    }

    public final EditorProContext LJIILL() {
        return (EditorProContext) this.LJLJJLL.getValue();
    }

    public final C50Q LJIILLIIL() {
        IFunctionBarService iFunctionBarService = this.LJLILLLLZI;
        if (iFunctionBarService != null) {
            return iFunctionBarService.getFuncBarController();
        }
        return null;
    }

    public final C1284452i LJIJ() {
        ITrackService iTrackService = this.LJLJJI;
        if (iTrackService != null) {
            return iTrackService.getMultiTrackController();
        }
        return null;
    }

    public final NLEModel LJIJI() {
        NLEModel nLEModel = this.LJLJLJ;
        if (nLEModel != null) {
            return nLEModel;
        }
        o.LJIJI("nleModel");
        throw null;
    }

    public final InterfaceC1278950f LJIJJ() {
        IPreviewService iPreviewService = this.LJLJI;
        if (iPreviewService != null) {
            return iPreviewService.getPreviewPanel();
        }
        return null;
    }

    public final void LJJIII() {
        if (!this.LJLLI) {
            this.LJLLI = true;
            LJJIIJ(new AqS152S0100000_2((C127604zc) this, 758));
        } else {
            LJJIIJ(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LJIJJLI() {
        if (LJIL() == null) {
            return LJIILL().getMainTrack().LJIILL().size();
        }
        C1284452i LJIJ = LJIJ();
        if (LJIJ == null) {
            return 0;
        }
        TrackPanelViewModel trackPanelViewModel = LJIJ.LJLILLLLZI;
        long curTimeStamp = LJIJ.LJLIL.getCurTimeStamp();
        NLETrack nLETrack = (NLETrack) trackPanelViewModel.LLIIIZ.getValue();
        NLETrackSlot nLETrackSlot = null;
        int i = -1;
        if (nLETrack != null) {
            Iterator<NLETrackSlot> it = nLETrack.LJIILLIIL().iterator();
            NLETrackSlot nLETrackSlot2 = null;
            int i2 = 0;
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    NLETrackSlot nLETrackSlot3 = next;
                    long j = 1000;
                    long startTime = nLETrackSlot3.getStartTime() / j;
                    if (curTimeStamp <= nLETrackSlot3.getMeasuredEndTime() / j && startTime <= curTimeStamp) {
                        i = i2;
                        nLETrackSlot2 = nLETrackSlot3;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            nLETrackSlot = nLETrackSlot2;
        }
        CurrentSlotInfo currentSlotInfo = new CurrentSlotInfo(i, nLETrackSlot, 1000 * curTimeStamp);
        int index = currentSlotInfo.getIndex();
        NLETrackSlot slot = currentSlotInfo.getSlot();
        long playTime = currentSlotInfo.getPlayTime();
        if (slot == null) {
            return LJIILL().getMainTrack().LJIILL().size();
        }
        if (slot.getMeasuredEndTime() - playTime > slot.getDuration() / 2) {
            return index;
        }
        return index + 1;
    }

    public final C58D LJIL() {
        C1284452i LJIJ = LJIJ();
        if (LJIJ != null) {
            return LJIJ.LJLIL;
        }
        return null;
    }

    public void LJJII() {
        MutableLiveData LJII;
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(LJIIZILJ(), new AObserverS70S0100000_2(this, 236));
        LJIILL().getPlayer().L9().observe(LJIIZILJ(), new AObserverS70S0100000_2(this, 237));
        MutableLiveData LJII2 = C79057V0z.LJII(LJIILL(), "main_track_slot_move_event");
        if (LJII2 != null) {
            LJII2.observe(LJIIZILJ(), new AObserverS70S0100000_2(this, 238));
        }
        MutableLiveData LJII3 = C79057V0z.LJII(LJIILL(), "main_track_slot_clip_event");
        if (LJII3 != null) {
            LJII3.observe(LJIIZILJ(), new AObserverS70S0100000_2(this, 239));
        }
        MutableLiveData LJII4 = C79057V0z.LJII(LJIILL(), "selected_track_slot_event");
        if (LJII4 != null) {
            LJII4.observe(LJIIZILJ(), new AObserverS70S0100000_2(this, 240));
        }
        MutableLiveData LJII5 = C79057V0z.LJII(LJIILL(), "ori_audio_mute_event");
        if (LJII5 != null) {
            LJII5.observe(LJIIZILJ(), new AObserverS70S0100000_2(this, 241));
        }
        MutableLiveData LJII6 = C79057V0z.LJII(LJIILL(), "transition_track_slot_click_event");
        if (LJII6 != null) {
            LJII6.observe(LJIIZILJ(), new AObserverS70S0100000_2(this, 242));
        }
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_KEY_FRAME, Boolean.FALSE)).booleanValue() && (LJII = C79057V0z.LJII(LJIILL(), "video_position_event")) != null) {
            LJII.observe(LJIIZILJ(), new AObserverS70S0100000_2(this, 243));
        }
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public void onDestroy() {
        C79057V0z.LJJ(LJIILL()).removeConsumer(this.LJLLLL);
        C124864vC.LIZ = false;
        C124864vC.LIZIZ = false;
        ((LinkedHashMap) C124864vC.LJFF.LIZ).clear();
        removeMessages(100);
        IFunctionBarService iFunctionBarService = this.LJLILLLLZI;
        if (iFunctionBarService != null) {
            iFunctionBarService.onDestroy();
        }
        IPreviewService iPreviewService = this.LJLJI;
        if (iPreviewService != null) {
            iPreviewService.onDestroy();
        }
        ITrackService iTrackService = this.LJLJJI;
        if (iTrackService != null) {
            iTrackService.onDestroy();
        }
        IConsoleBarService iConsoleBarService = this.LJLJJL;
        if (iConsoleBarService != null) {
            iConsoleBarService.onDestroy();
        }
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public void onHide() {
        LJIILL().removeNLEListener(this.LJLLLL);
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public void onShow() {
        LJIILL().addNLEListener(this.LJLLLL);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.4zv] */
    public C127764zs(C29S activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = C127834zz.LIZ();
        this.LJLJI = C127834zz.LIZIZ();
        this.LJLJJI = C127834zz.LIZJ();
        this.LJLJJL = (IConsoleBarService) C171096nZ.LIZ(IConsoleBarService.class);
        this.LJLJJLL = C221108m2.LIZIZ(C123624tC.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(AnonymousClass502.LJLIL);
        this.LJLJLLL = new C5DP(new C5DS() { // from class: X.4zy
            @Override // X.C5DS
            public final void handleMsg(Message message) {
                C58D LJIL = C127764zs.this.LJIL();
                if (LJIL != null) {
                    LJIL.updatePlayState(new PlayPositionState(TimeUnit.MILLISECONDS.toMicros(message.arg1), false, false));
                }
            }
        });
        this.LJLL = true;
        this.LJLLLL = new NLEEditorListener() { // from class: X.4zv
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                C127764zs c127764zs = C127764zs.this;
                c127764zs.LJLJLJ = C79057V0z.LJJI(c127764zs.LJIILL());
                NLEModel LJIJI = C127764zs.this.LJIJI();
                C127764zs c127764zs2 = C127764zs.this;
                try {
                    if (c127764zs2.LJLLI) {
                        c127764zs2.LJJIIJ(null);
                    }
                    C2ND.LIZIZ(new C1279050g(c127764zs2, LJIJI), 0L);
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("BaseEditorPlayground#onChanged::error = ");
                    LIZ.append(e.getMessage());
                    C131935Ft.LIZLLL("BaseEditorPlayground", X1D.LIZIZ(LIZ));
                }
            }
        };
    }

    public static EnumC127354zD LJJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return EnumC127354zD.CLIP;
            }
            if (num.intValue() == 1) {
                return EnumC127354zD.LINE;
            }
        }
        return null;
    }

    public final void LJJIIJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!this.LJLLI) {
            return;
        }
        if (this.LJLL) {
            this.LJLL = false;
            this.LJLLL = true;
            LJIILL().getPlayer().X9(C79057V0z.LJJI(LJIILL()), true, new AqS149S0200000_2(this, (C127764zs) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 79));
            return;
        }
        if (this.LJLLL) {
            synchronized (this.LJLLLL) {
                if (this.LJLLL) {
                    this.LJLLJ = true;
                    return;
                }
            }
        }
        LJIILL().getPlayer().X9(C79057V0z.LJJI(LJIILL()), false, interfaceC65784Pro);
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public void onExitEditPage(boolean z) {
        this.LJLL = true;
        this.LJLLJ = false;
        this.LJLLI = false;
    }

    public final void LJJI(Long l, Long l2) {
        long LJIJJLI;
        long LJJII;
        if (l != null && l.longValue() >= 0) {
            LJIJJLI = l.longValue();
        } else {
            LJIJJLI = C79057V0z.LJIJJLI(LJIILL());
        }
        C52T LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.LLLLLLLLL(LJIJJLI);
        }
        if (!this.LJLLL) {
            if (l2 == null || l2.longValue() != 0) {
                o.LJI(l2);
                LJJII = l2.longValue();
            } else {
                LJJII = C79057V0z.LJJII(LJIILL());
            }
            C52T LJIILJJIL2 = LJIILJJIL();
            if (LJIILJJIL2 != null) {
                LJIILJJIL2.LLIZLLLIL(LJJII);
            }
        }
    }

    public static /* synthetic */ void LJJIFFI(C127764zs c127764zs, Long l, int i) {
        Long l2 = null;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = 0L;
        }
        c127764zs.LJJI(l, l2);
    }
}
