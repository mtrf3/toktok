package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveReusePlayerStopSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import defpackage.b1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class BQ9 {
    public static final BQ9 LJ = new BQ9();
    public InterfaceC28738BPq LIZIZ;
    public final ConcurrentHashMap<String, InterfaceC28738BPq> LIZ = new ConcurrentHashMap<>();
    public final boolean LIZJ = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(BQC.LJLIL);

    public final BQA LIZLLL() {
        return (BQA) this.LIZLLL.getValue();
    }

    public final void LJI() {
        Iterator<Map.Entry<String, InterfaceC28738BPq>> it = this.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, InterfaceC28738BPq> next = it.next();
            String key = next.getKey();
            if (key != null && s.LJJJLZIJ(key, "preview", false)) {
                next.getValue().LJJIII();
                it.remove();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(next.getKey());
                LIZ.append(" in cache");
                B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ));
            }
        }
    }

    public final void LJII() {
        if (this.LIZJ) {
            LIZLLL().LIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" 4s clear, cache size=");
            LIZ.append(this.LIZ.size());
            LIZ.append(", scrap size=");
            LIZ.append(LIZLLL().LIZ.size());
            B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ));
            for (Map.Entry<String, InterfaceC28738BPq> entry : this.LIZ.entrySet()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(entry.getKey());
                LIZ2.append(" in cache");
                B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ2));
            }
            LIZLLL().LIZIZ();
        }
    }

    public final InterfaceC28738BPq LIZ(String str) {
        if (this.LIZ.containsKey(str)) {
            return this.LIZ.get(str);
        }
        return null;
    }

    public final InterfaceC28738BPq LIZIZ(String str) {
        if (this.LIZJ) {
            Integer num = null;
            if (str == null) {
                return null;
            }
            InterfaceC28738BPq LIZ = LIZ(str);
            StringBuilder LIZJ = b1.LIZJ(str, "  getPlayerController from cache: ");
            if (LIZ != null) {
                num = Integer.valueOf(LIZ.hashCode());
            }
            LIZJ.append(num);
            B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZJ));
            return LIZ;
        }
        C28645BMb.LIZ().getClass();
        return C28645BMb.LIZIZ();
    }

    public final InterfaceC28738BPq LIZJ(String str) {
        InterfaceC28738BPq pop;
        if (this.LIZJ) {
            InterfaceC28738BPq interfaceC28738BPq = null;
            if (str != null) {
                InterfaceC28738BPq LIZ = LIZ(str);
                InterfaceC28738BPq interfaceC28738BPq2 = LIZ;
                if (LIZ == null) {
                    if (s.LJJJLZIJ(str, "preview_", false)) {
                        Iterator<Map.Entry<String, InterfaceC28738BPq>> it = this.LIZ.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<String, InterfaceC28738BPq> next = it.next();
                            String key = next.getKey();
                            InterfaceC28738BPq value = next.getValue();
                            if (key != null && s.LJJJLZIJ(key, "preview", false) && !value.isPlaying()) {
                                StringBuilder LIZIZ = C25620zW.LIZIZ("popPreviewPlayerCache() tag=", key, " ---> controller=");
                                LIZIZ.append(value.hashCode());
                                B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZIZ));
                                it.remove();
                                this.LIZ.put(str, value);
                                interfaceC28738BPq2 = value;
                                break;
                            }
                        }
                    }
                    LinkedList<InterfaceC28738BPq> linkedList = LIZLLL().LIZ;
                    if (linkedList.size() > 0 && (pop = linkedList.pop()) != null) {
                        this.LIZ.put(str, pop);
                        interfaceC28738BPq2 = pop;
                    } else {
                        C79340VBw c79340VBw = new C79340VBw(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context(), new VB0());
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("create playController -> player: ");
                        LIZ2.append(c79340VBw.hashCode());
                        LIZ2.append(", cache size = ");
                        LIZ2.append(this.LIZ.size() + 1);
                        B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ2));
                        this.LIZ.put(str, c79340VBw);
                        interfaceC28738BPq2 = c79340VBw;
                    }
                }
                StringBuilder LIZJ = b1.LIZJ(str, " matches ---> LivePlayController: ");
                LIZJ.append(Integer.valueOf(interfaceC28738BPq2.hashCode()));
                B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZJ));
                interfaceC28738BPq = interfaceC28738BPq2;
            }
            return interfaceC28738BPq;
        }
        C28645BMb.LIZ().getClass();
        return C28645BMb.LIZIZ();
    }

    public final void LJ(Context context) {
        String key;
        if (this.LIZJ) {
            Iterator<Map.Entry<String, InterfaceC28738BPq>> it = this.LIZ.entrySet().iterator();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("releaseAllMultiPlayer()，count=");
            LIZ.append(this.LIZ.size());
            B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ));
            while (it.hasNext()) {
                Map.Entry<String, InterfaceC28738BPq> next = it.next();
                InterfaceC28738BPq value = next.getValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("releaseAllMultiPlayer() try to delete ");
                LIZ2.append(next.getKey());
                LIZ2.append("  , force release?=");
                LIZ2.append(false);
                B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ2));
                if (next.getKey() == null || (key = next.getKey()) == null || !s.LJJJLZIJ(key, "preview", false)) {
                    if (value.LJJIJIIJI(context)) {
                        it.remove();
                    }
                }
            }
            this.LIZIZ = null;
            LIZLLL().LIZ();
            return;
        }
        C28645BMb.LIZ().getClass();
        C28645BMb.LIZIZ().LJJIJIIJI(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context());
        this.LIZIZ = null;
    }

    public final void LJFF(String str) {
        int i;
        if (this.LIZJ && str != null && LIZ(str) != null) {
            InterfaceC28738BPq remove = this.LIZ.remove(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("clear player=");
            if (remove != null) {
                i = remove.hashCode();
            } else {
                i = 0;
            }
            LIZ.append(i);
            LIZ.append(" from cache");
            B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.BPq, java.lang.Object, O] */
    public final void LJIIIZ(String str) {
        InterfaceC28738BPq LIZ;
        if (this.LIZJ) {
            if (str != null && (LIZ = LIZ(str)) != null) {
                this.LIZIZ = LIZ;
                StringBuilder LIZIZ = C25620zW.LIZIZ("set current player ", str, " --> ");
                LIZIZ.append(LIZ.hashCode());
                B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZIZ));
                LIZ.LJJJJ(str, "multi-player selected!", false);
                ?? r3 = this.LIZIZ;
                if (r3 instanceof BTA) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    o.LJII(r3, "null cannot be cast to non-null type com.bytedance.android.livesdk.log.monitor.IPullStreamData");
                    ((C32537Cpp) dataChannelGlobal.gv0(C29051Bah.class)).LIZ = r3;
                    return;
                }
                return;
            }
            return;
        }
        C28645BMb.LIZ().getClass();
        this.LIZIZ = C28645BMb.LIZIZ();
    }

    public final void LJIIJ(String str) {
        InterfaceC28738BPq LIZ;
        if (this.LIZJ && str != null && (LIZ = LIZ(str)) != null) {
            LIZ.LJJJJ(str, "", true);
            LIZ.stop(str);
            if (LiveReusePlayerStopSetting.INSTANCE.getValue()) {
                LIZ.reset();
            }
            InterfaceC28738BPq remove = this.LIZ.remove(str);
            if (remove != null) {
                BQA LIZLLL = LIZLLL();
                LIZLLL.getClass();
                LinkedList<InterfaceC28738BPq> linkedList = LIZLLL.LIZ;
                if (linkedList.size() < 2) {
                    linkedList = null;
                }
                if (linkedList != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("putRecycledPlayer:");
                    LIZ2.append(remove.hashCode());
                    LIZ2.append(" -> over size");
                    B4I.LIZ("LivePlayControllerManager_RecyclerPlayerPool", X1D.LIZIZ(LIZ2));
                    remove.LJJIII();
                } else {
                    LIZLLL.LIZ.push(remove);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("putRecycledPlayer -> ");
                    LIZ3.append(remove.hashCode());
                    LIZ3.append(" count=");
                    LIZ3.append(LIZLLL.LIZIZ());
                    B4I.LIZ("LivePlayControllerManager_RecyclerPlayerPool", X1D.LIZIZ(LIZ3));
                }
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("remove ");
            LIZ4.append(str);
            LIZ4.append(" from cache");
            B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ4));
        }
    }

    public final void LJIIL(String str) {
        InterfaceC28738BPq remove;
        if (this.LIZJ && str != null && (remove = this.LIZ.remove(str)) != null) {
            remove.LJJIII();
        }
    }

    public final void LJIIIIZZ(String reusePlayerTag, String roomPlayerTag) {
        o.LJIIIZ(reusePlayerTag, "reusePlayerTag");
        o.LJIIIZ(roomPlayerTag, "roomPlayerTag");
        if (this.LIZJ) {
            InterfaceC28738BPq LIZ = LIZ(reusePlayerTag);
            if (LIZ != null) {
                this.LIZ.remove(reusePlayerTag);
                this.LIZ.put(roomPlayerTag, LIZ);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("reuse playController -> replace reusePlayerTag: ");
            LIZ2.append(reusePlayerTag);
            LIZ2.append("  into roomPlayerTag: ");
            LIZ2.append(roomPlayerTag);
            B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ2));
        }
    }

    public final void LJIIJJI(String str, InterfaceC28738BPq newLivePlayController) {
        o.LJIIIZ(newLivePlayController, "newLivePlayController");
        if (this.LIZJ && str != null) {
            InterfaceC28738BPq LIZ = LIZ(str);
            BQA LIZLLL = LIZLLL();
            LIZLLL.getClass();
            Iterator<InterfaceC28738BPq> it = LIZLLL.LIZ.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i2 = i + 1;
                if (o.LJ(it.next(), newLivePlayController)) {
                    if (i != -1) {
                        LIZLLL.LIZ.remove(newLivePlayController);
                    }
                } else {
                    i = i2;
                }
            }
            if (LIZ == null) {
                this.LIZ.put(str, newLivePlayController);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("reuse player -> cache PlayerTag : ");
                LIZ2.append(str);
                LIZ2.append(" into newLivePlayController: ");
                LIZ2.append(newLivePlayController.hashCode());
                B4I.LIZ("LivePlayControllerManager", X1D.LIZIZ(LIZ2));
            }
        }
    }
}
