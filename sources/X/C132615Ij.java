package X;

import Y.ARunnableS38S0100000_2;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.SurfaceView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5Ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132615Ij extends AnonymousClass503 implements InterfaceC127784zu {
    public final InterfaceC124924vI LJLIL;
    public final MutableLiveData<Long> LJLILLLLZI;
    public final MutableLiveData<C76800UCe> LJLJI;
    public final MutableLiveData LJLJJI;
    public final MutableLiveData LJLJJL;
    public boolean LJLJJLL;
    public final List<String> LJLJL;
    public String LJLJLJ;
    public volatile int[] LJLJLLL;
    public final Object LJLL;
    public final Handler LJLLI;
    public InterfaceC132665Io LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public boolean LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final List<C5J0> LL;
    public final CopyOnWriteArrayList<InterfaceC132775Iz> LLD;
    public final C132635Il LLF;
    public final C132645Im LLFF;

    @Override // X.InterfaceC127784zu
    public final void I9() {
        if (LJIILJJIL()) {
            long[] jArr = new long[2];
            this.LJLIL.getSelectedSlotTimeRange(jArr);
            this.LJLLLL = true;
            long j = 1000;
            C125014vR.LIZ(this, jArr[0] + j, jArr[1] - j, false, 12);
        }
    }

    @Override // X.InterfaceC127784zu
    public final void J9() {
        this.LJLLL = false;
        this.LJZ = false;
        this.LJLLLL = true;
    }

    @Override // X.InterfaceC127784zu
    public final boolean isPrepared() {
        return false;
    }

    public final boolean LJIILJJIL() {
        if (this.LJLIL.getHasInitialized() && !this.LJLIL.isPreload()) {
            return true;
        }
        return false;
    }

    public final Handler LJIILL() {
        return (Handler) this.LJZL.getValue();
    }

    @Override // X.InterfaceC127784zu
    public final void R9() {
        InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
        if (interfaceC132665Io != null) {
            interfaceC132665Io.LJJJJJ(null);
            InterfaceC132665Io interfaceC132665Io2 = this.LJLLILLLL;
            if (interfaceC132665Io2 != null) {
                interfaceC132665Io2.LJJJJJL(this.LLFF);
                return;
            } else {
                o.LJIJI("nlePlayer");
                throw null;
            }
        }
        o.LJIJI("nlePlayer");
        throw null;
    }

    @Override // X.InterfaceC127784zu
    public final void V9() {
        InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
        if (interfaceC132665Io != null) {
            interfaceC132665Io.LJJJJJ(this.LLF);
            InterfaceC132665Io interfaceC132665Io2 = this.LJLLILLLL;
            if (interfaceC132665Io2 != null) {
                interfaceC132665Io2.LJJJJJL(this.LLFF);
                InterfaceC132665Io interfaceC132665Io3 = this.LJLLILLLL;
                if (interfaceC132665Io3 != null) {
                    interfaceC132665Io3.LJJJJI(this.LLFF);
                    return;
                } else {
                    o.LJIJI("nlePlayer");
                    throw null;
                }
            }
            o.LJIJI("nlePlayer");
            throw null;
        }
        o.LJIJI("nlePlayer");
        throw null;
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onHide() {
        InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
        if (interfaceC132665Io != null) {
            interfaceC132665Io.LJJJJJ(null);
            InterfaceC132665Io interfaceC132665Io2 = this.LJLLILLLL;
            if (interfaceC132665Io2 != null) {
                interfaceC132665Io2.LJJJJJL(this.LLFF);
                this.LJLJJLL = false;
                return;
            } else {
                o.LJIJI("nlePlayer");
                throw null;
            }
        }
        o.LJIJI("nlePlayer");
        throw null;
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onShow() {
        InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
        if (interfaceC132665Io != null) {
            interfaceC132665Io.LJJJJJ(this.LLF);
            InterfaceC132665Io interfaceC132665Io2 = this.LJLLILLLL;
            if (interfaceC132665Io2 != null) {
                interfaceC132665Io2.LJJJJJL(this.LLFF);
                InterfaceC132665Io interfaceC132665Io3 = this.LJLLILLLL;
                if (interfaceC132665Io3 != null) {
                    interfaceC132665Io3.LJJJJI(this.LLFF);
                    return;
                } else {
                    o.LJIJI("nlePlayer");
                    throw null;
                }
            }
            o.LJIJI("nlePlayer");
            throw null;
        }
        o.LJIJI("nlePlayer");
        throw null;
    }

    @Override // X.InterfaceC127784zu
    public final void play() {
        if (this.LJZ) {
            if (LJIILJJIL() && this.LJLLL) {
                this.LJLJJLL = true;
                if (C124574uj.LJJLIIIJL(this.LJLLLLLL) - H9() < 30) {
                    seek(C124574uj.LJJLIIIJL(this.LJLZ));
                }
                InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
                if (interfaceC132665Io != null) {
                    interfaceC132665Io.play();
                    LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(1);
                    return;
                } else {
                    o.LJIJI("nlePlayer");
                    throw null;
                }
            }
            return;
        }
        LJIILLIIL();
    }

    @Override // X.InterfaceC127784zu
    public final void B3() {
        LJIILL().post(new ARunnableS38S0100000_2(this, 8));
    }

    @Override // X.InterfaceC127784zu
    public final long H9() {
        if (LJIILJJIL()) {
            InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
            if (interfaceC132665Io != null) {
                return interfaceC132665Io.getCurrentPosition() / 1000;
            }
            o.LJIJI("nlePlayer");
            throw null;
        }
        return 0L;
    }

    public final void LJIILLIIL() {
        if (LJIILJJIL()) {
            this.LJLJJLL = true;
            if (s5() - H9() < 50) {
                W9(null);
                seek(0L);
            }
            InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
            if (interfaceC132665Io != null) {
                interfaceC132665Io.play();
                LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(1);
            } else {
                o.LJIJI("nlePlayer");
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onDestroy() {
        if (LJIILJJIL()) {
            LJIILL().removeCallbacksAndMessages(null);
            if (AnonymousClass504.LIZ) {
                LJIILL().post(new ARunnableS38S0100000_2(this, 9));
                return;
            }
            InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
            if (interfaceC132665Io != null) {
                interfaceC132665Io.LJJJJJL(this.LLFF);
                if (!this.LJLIL.getReuseVEEngine()) {
                    InterfaceC132665Io interfaceC132665Io2 = this.LJLLILLLL;
                    if (interfaceC132665Io2 != null) {
                        interfaceC132665Io2.LIZIZ();
                        InterfaceC132665Io interfaceC132665Io3 = this.LJLLILLLL;
                        if (interfaceC132665Io3 != null) {
                            interfaceC132665Io3.destroy();
                        } else {
                            o.LJIJI("nlePlayer");
                            throw null;
                        }
                    } else {
                        o.LJIJI("nlePlayer");
                        throw null;
                    }
                }
                ((HandlerThread) this.LJZI.getValue()).quitSafely();
                return;
            }
            o.LJIJI("nlePlayer");
            throw null;
        }
    }

    @Override // X.InterfaceC127784zu
    public final void pause() {
        if (LJIILJJIL()) {
            C79057V0z.LJJJJLI(this.LJLIL, "is_play_while_exit_edit", Boolean.valueOf(this.LJLJJLL), true);
            this.LJLJJLL = false;
            H9();
            InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
            if (interfaceC132665Io != null) {
                interfaceC132665Io.pause();
                LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(0);
            } else {
                o.LJIJI("nlePlayer");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC127784zu
    public final long s5() {
        if (LJIILJJIL()) {
            InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
            if (interfaceC132665Io != null) {
                return interfaceC132665Io.getDuration() / 1000;
            }
            o.LJIJI("nlePlayer");
            throw null;
        }
        return 0L;
    }

    @Override // X.InterfaceC127784zu
    public final MutableLiveData K9() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC127784zu
    public final MutableLiveData L9() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC127784zu
    public final String Y9() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC127784zu
    public final boolean isPlaying() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC127784zu
    public final List<String> q0() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC127784zu
    public final int[] t5() {
        return this.LJLJLLL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.5Il] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.5Im] */
    public C132615Ij(InterfaceC124924vI editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        this.LJLIL = editorContext;
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData2;
        this.LJLJJI = mutableLiveData;
        this.LJLJJL = mutableLiveData2;
        this.LJLJL = new ArrayList();
        this.LJLL = new Object();
        this.LJLLI = new Handler(C16880lQ.LLJJJJ());
        this.LJLLJ = true;
        this.LJLLLL = true;
        this.LJZI = C221108m2.LIZIZ(C132715It.LJLIL);
        this.LJZL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 22));
        this.LL = new ArrayList();
        this.LLD = new CopyOnWriteArrayList<>();
        this.LLF = new C5J0() { // from class: X.5Il
            public boolean LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C5J0
            public final void LIZ(int i, long j) {
                C132615Ij c132615Ij = C132615Ij.this;
                synchronized (c132615Ij.LJLL) {
                    Iterator it = ((ArrayList) c132615Ij.LL).iterator();
                    while (it.hasNext()) {
                        ((C5J0) it.next()).LIZ(i, j);
                    }
                    if (!c132615Ij.LJLLJ) {
                        return;
                    }
                    if (i == 0) {
                        if (c132615Ij.LJLLL) {
                            if (99000 + j >= c132615Ij.LJLLLLLL) {
                                Long l = (Long) c132615Ij.LJLJJI.getValue();
                                if (l == null) {
                                    return;
                                }
                                if (l.longValue() >= c132615Ij.LJLLLLLL) {
                                    return;
                                }
                                c132615Ij.pause();
                                if (!this.LIZ) {
                                    this.LIZ = true;
                                    c132615Ij.LJLLI.post(new ARunnableS38S0100000_2(c132615Ij, 10));
                                }
                                return;
                            }
                            if (99000 + j < c132615Ij.LJLLLLLL) {
                                this.LIZ = false;
                            }
                        }
                        if (c132615Ij.LJLJJLL) {
                            c132615Ij.LJLILLLLZI.postValue(Long.valueOf(j));
                        }
                    }
                }
            }
        };
        this.LLFF = new C5JL() { // from class: X.5Im
            @Override // X.C5JL
            public final void LIZ(int i, int i2, float f, String str) {
                if (4359 == i) {
                    Iterator<InterfaceC132775Iz> it = C132615Ij.this.LLD.iterator();
                    while (it.hasNext()) {
                        it.next().LIZ();
                    }
                } else if (4098 == i) {
                    C132615Ij.this.LJLJI.postValue(C76800UCe.LIZ);
                    C132615Ij.this.pause();
                }
            }
        };
    }

    @Override // X.InterfaceC127784zu
    public final void M9(long j) {
        fa(j, new AnonymousClass519() { // from class: X.5Iu
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
            }
        });
    }

    @Override // X.InterfaceC127784zu
    public final void N9(C5J0 listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LL).add(listener);
    }

    @Override // X.InterfaceC127784zu
    public final void P9(NLETrackSlot stickerSlot) {
        o.LJIIIZ(stickerSlot, "stickerSlot");
        if (NLESegmentSticker.LIZLLL(stickerSlot.LJI()) != null || NLESegmentTextTemplate.LIZLLL(stickerSlot.LJI()) != null) {
            this.LJLIL.getNleSession().O8().LJI(stickerSlot.getUUID(), false);
            this.LJLIL.getNleSession().O8().LJIJJ();
            return;
        }
        throw new IllegalStateException("only support NLESegmentSticker and NLESegmentTextTemplate");
    }

    @Override // X.InterfaceC127784zu
    public final void T9(C5J0 listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LL).remove(listener);
    }

    @Override // X.InterfaceC127784zu
    public final void U9(InterfaceC132775Iz listener) {
        o.LJIIIZ(listener, "listener");
        this.LLD.remove(listener);
    }

    @Override // X.InterfaceC127784zu
    public final void W9(Integer num) {
        if (LJIILJJIL()) {
            if (num == null) {
                InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
                if (interfaceC132665Io != null) {
                    interfaceC132665Io.LIZJ();
                    return;
                } else {
                    o.LJIJI("nlePlayer");
                    throw null;
                }
            }
            InterfaceC132665Io interfaceC132665Io2 = this.LJLLILLLL;
            if (interfaceC132665Io2 != null) {
                interfaceC132665Io2.LJJJJL(num.intValue());
            } else {
                o.LJIJI("nlePlayer");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC127784zu
    public final void Z9(InterfaceC132665Io play) {
        o.LJIIIZ(play, "play");
        this.LJLLILLLL = play;
        C5G5.LIZ(this);
    }

    @Override // X.InterfaceC127784zu
    public final void ea(C51A c51a) {
        this.LLD.add(c51a);
    }

    @Override // X.InterfaceC127784zu
    public final void p0(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC127784zu
    public final void seek(long j) {
        O9(j, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek, new AnonymousClass519() { // from class: X.5Iy
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
            }
        });
    }

    @Override // X.InterfaceC127784zu
    public final void setActive(boolean z) {
        this.LJLLJ = z;
    }

    @Override // X.InterfaceC127784zu
    public final void A3(long j, AnonymousClass519 listener) {
        o.LJIIIZ(listener, "listener");
        O9(j, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek, listener);
    }

    @Override // X.InterfaceC127784zu
    public final void S9(NLETrackSlot stickerSlot, int i) {
        Boolean bool;
        boolean z;
        NLEStyStickerAnim LJ;
        boolean z2;
        o.LJIIIZ(stickerSlot, "stickerSlot");
        NLESegmentSticker LIZLLL = NLESegmentSticker.LIZLLL(stickerSlot.LJI());
        NLESegmentTextTemplate LIZLLL2 = NLESegmentTextTemplate.LIZLLL(stickerSlot.LJI());
        if (LIZLLL != null || LIZLLL2 != null) {
            if (LIZLLL != null && (LJ = LIZLLL.LJ()) != null) {
                if (i == 1 ? LJ.LIZJ() || LJ.LIZ() == null || !LJ.LIZ().LJII() || !NLEEditorJniJNI.NLEStyStickerAnim_hasInDuration(LJ.LIZ, LJ) || LJ.LIZIZ() <= 0 : i == 2 ? LJ.LIZJ() || LJ.LIZLLL() == null || !LJ.LIZLLL().LJII() || !NLEEditorJniJNI.NLEStyStickerAnim_hasOutDuration(LJ.LIZ, LJ) || NLEEditorJniJNI.NLEStyStickerAnim_getOutDuration(LJ.LIZ, LJ) <= 0 : i != 3 || !LJ.LIZJ() || LJ.LIZ() == null || !LJ.LIZ().LJII() || !NLEEditorJniJNI.NLEStyStickerAnim_hasInDuration(LJ.LIZ, LJ) || LJ.LIZIZ() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            } else {
                bool = null;
            }
            if (i == 4) {
                z = true;
            } else {
                z = false;
            }
            if (o.LJ(bool, Boolean.TRUE) || z) {
                this.LJLIL.getNleSession().O8().LJI(stickerSlot.getUUID(), true);
                this.LJLIL.getNleSession().O8().LJIJI(i);
                return;
            } else {
                this.LJLIL.getNleSession().O8().LJI(stickerSlot.getUUID(), false);
                this.LJLIL.getNleSession().O8().LJIJJ();
                return;
            }
        }
        throw new IllegalStateException("only support NLESegmentSticker");
    }

    @Override // X.InterfaceC127784zu
    public final void da(final Boolean bool, final InterfaceC65784Pro interfaceC65784Pro) {
        if (LJIILJJIL()) {
            O9(0L, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek, new AnonymousClass519() { // from class: X.4vU
                @Override // X.AnonymousClass519
                public final void LIZ(int i) {
                    if (o.LJ(bool, Boolean.TRUE)) {
                        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(3);
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                        if (interfaceC65784Pro2 != null) {
                            interfaceC65784Pro2.invoke();
                        }
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC127784zu
    public final void fa(long j, AnonymousClass519 listener) {
        o.LJIIIZ(listener, "listener");
        if (j >= 0 && LJIILJJIL()) {
            C79057V0z.LJJJJL(this.LJLIL, "move_track_to_position", Long.valueOf(j));
            A3(C124574uj.LJJLIIIJL(j), listener);
        }
    }

    @Override // X.InterfaceC127784zu
    public final void O9(long j, EnumC133595Md seekFlag, final AnonymousClass519 listener) {
        C132705Is c132705Is;
        o.LJIIIZ(seekFlag, "seekFlag");
        o.LJIIIZ(listener, "listener");
        if (LJIILJJIL()) {
            this.LJLJJLL = false;
            this.LJLLL = false;
            this.LJLLLL = true;
            if (seekFlag == EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek) {
                c132705Is = new C132705Is(this) { // from class: X.5Iq
                    @Override // X.C132705Is, X.AnonymousClass519
                    public final void LIZ(int i) {
                        super.LIZ(i);
                        listener.LIZ(i);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(this);
                    }
                };
                s5();
            } else {
                c132705Is = null;
            }
            InterfaceC132665Io interfaceC132665Io = this.LJLLILLLL;
            if (interfaceC132665Io != null) {
                if (interfaceC132665Io.LJJJI(C124574uj.LJJLIIIJJIZ(j), seekFlag, c132705Is) != 0 && c132705Is != null) {
                    c132705Is.LIZ(-1);
                    return;
                }
                return;
            }
            o.LJIJI("nlePlayer");
            throw null;
        }
    }

    @Override // X.InterfaceC127784zu
    public final void Q9(long j, long j2, boolean z) {
        if (z) {
            M9(j);
        }
        this.LJLLL = true;
        this.LJLZ = j;
        this.LJLLLLLL = j2;
        this.LJZ = true;
        this.LJLLLL = true;
    }

    @Override // X.InterfaceC127784zu
    public final void X9(NLEModel nLEModel, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        AqS91S0300000_2 aqS91S0300000_2 = new AqS91S0300000_2(this, (C132615Ij) nLEModel, (NLEModel) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 0);
        if (z) {
            LJIILL().post(new ARunnableS38S0100000_2(aqS91S0300000_2, 11));
        } else {
            aqS91S0300000_2.invoke();
        }
    }

    @Override // X.InterfaceC127784zu
    public final VEEditor ba(final String str, final String str2, final C125964wy c125964wy) {
        final String str3;
        NLEMediaConfig nleMediaConfig = this.LJLIL.getNleMediaConfig();
        if (nleMediaConfig != null) {
            str3 = NLEMediaJniJNI.NLEMediaConfig_workSpace_get(nleMediaConfig.LIZ, nleMediaConfig);
        } else {
            str3 = null;
        }
        final VEEditorResManager vEEditorResManager = new VEEditorResManager(str3);
        VEEditor reverseEditor = VEEditor.LJIILLIIL(vEEditorResManager, new VETimelineParams(new String[]{str}), -1, -1, 0, -1, new YOW() { // from class: X.5Ik
            @Override // X.YOW
            public final void LIZ(int i) {
                String str4;
                if (i == 0) {
                    List<String> list = C132615Ij.this.LJLJL;
                    if (list != null) {
                        ((ArrayList) list).clear();
                    }
                    C132615Ij.this.LJLJLJ = null;
                    String[] strArr = vEEditorResManager.mReverseVideoPath;
                    if (strArr != null) {
                        int i2 = 0;
                        String str5 = (String) ORY.LJJJJI(0, strArr);
                        if (str5 != null) {
                            String str6 = str3;
                            String str7 = str2;
                            String str8 = str;
                            C132615Ij c132615Ij = C132615Ij.this;
                            InterfaceC132735Iv interfaceC132735Iv = c125964wy;
                            File file = new File(i0.LJFF(str6, "/tmp/audio"));
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            if (str7 == null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(file);
                                LIZ.append("/reverse_audio");
                                str4 = VEUtils.getFileBestStreamAudio(str8, X1D.LIZIZ(LIZ));
                                if (str4 == null) {
                                    List<String> list2 = c132615Ij.LJLJL;
                                    if (list2 != null) {
                                        ((ArrayList) list2).add(str5);
                                    }
                                    interfaceC132735Iv.LIZ(i);
                                    return;
                                }
                            } else {
                                str4 = str7;
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            String parent = new File(str5).getParent();
                            if (parent != null) {
                                str6 = parent;
                            }
                            String LJFF = JBR.LJFF(LIZ2, str6, "/audio_reverse.mp4", LIZ2);
                            int reverseAudio = VEUtils.reverseAudio(str4, LJFF);
                            if (str7 == null) {
                                C16880lQ.LLLZZIL(new File(str4));
                            }
                            if (reverseAudio != 0) {
                                interfaceC132735Iv.LIZ(reverseAudio);
                                return;
                            }
                            if (str7 == null || str7.length() == 0) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append((Object) str5.subSequence(0, s.LJJLIIJ(str5, ".", 6)));
                                LIZ3.append("_mux.mp4");
                                String LIZIZ = X1D.LIZIZ(LIZ3);
                                i2 = VEUtils.mux(str5, LJFF, LIZIZ);
                                str5 = LIZIZ;
                            } else {
                                c132615Ij.LJLJLJ = LJFF;
                            }
                            List<String> list3 = c132615Ij.LJLJL;
                            if (list3 != null) {
                                ((ArrayList) list3).add(str5);
                            }
                            interfaceC132735Iv.LIZ(i2);
                            return;
                        }
                    }
                }
                c125964wy.LIZ(i);
            }

            @Override // X.YOW
            public final void LIZIZ(double d) {
                c125964wy.LIZIZ(d);
            }
        });
        o.LJIIIIZZ(reverseEditor, "reverseEditor");
        return reverseEditor;
    }

    @Override // X.InterfaceC127784zu
    public final void ca(final long j, final float f, final float f2) {
        if (LJIILJJIL()) {
            this.LJLJJLL = false;
            this.LJLLL = false;
            this.LJLLLL = true;
            LJIILL().post(new Runnable() { // from class: X.5In
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        InterfaceC132665Io interfaceC132665Io = C132615Ij.this.LJLLILLLL;
                        if (interfaceC132665Io != null) {
                            interfaceC132665Io.LJJJJIZL(C124574uj.LJJLIIIJJIZ(j), EnumC133595Md.EDITOR_SEEK_FLAG_OnGoing, f2, f);
                        } else {
                            o.LJIJI("nlePlayer");
                            throw null;
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC127784zu
    public final void LIZ(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 0;
        this.LJLJLLL = new int[]{i, i2, i3, i4};
        PairIntInt LJIIJ = this.LJLIL.getNleSession().P8().LJIIJ();
        float LIZ = i3 / LJIIJ.LIZ();
        float LIZIZ = i4 / LJIIJ.LIZIZ();
        SurfaceView surfaceView = this.LJLIL.getSurfaceView();
        if (surfaceView != null) {
            i5 = surfaceView.getWidth();
        } else {
            i5 = 0;
        }
        int i7 = -(((i5 / 2) - (i3 / 2)) - i);
        SurfaceView surfaceView2 = this.LJLIL.getSurfaceView();
        if (surfaceView2 != null) {
            i6 = surfaceView2.getHeight();
        }
        this.LJLIL.getNleSession().P8().LJIJJLI(LIZ, LIZIZ, 0.0f, i7, ((i6 / 2) - (i4 / 2)) - i2);
    }

    @Override // X.InterfaceC127784zu
    public final void aa(final long j, final long j2, final boolean z, boolean z2) {
        AnonymousClass519 anonymousClass519 = new AnonymousClass519() { // from class: X.5Ip
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
                C132615Ij c132615Ij = C132615Ij.this;
                c132615Ij.LJLLL = true;
                c132615Ij.LJLLLL = false;
                c132615Ij.LJLZ = j;
                c132615Ij.LJLLLLLL = j2;
                c132615Ij.LJZ = z;
                c132615Ij.LJIILLIIL();
            }
        };
        if (z2) {
            A3(C124574uj.LJJLIIIJL(j), anonymousClass519);
        } else {
            anonymousClass519.LIZ(0);
        }
    }
}
