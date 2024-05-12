package X;

import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CKB {
    public static final CKB INSTANCE;
    public static final /* synthetic */ CKB[] LJLJLLL;
    public Queue<BaseMessage> LJLIL;
    public WeakReference<InterfaceC30133Bs9> LJLILLLLZI;
    public CKC LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public C80036Vb6 LJLJJLL;
    public List<EnumC31509CYf> LJLJL;
    public List<BaseMessage> LJLJLJ;
    public PollMessage pollMessage;

    public void onMessageFinish() {
        this.LJLJJI = false;
        LIZJ();
    }

    public void stop() {
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLIL = null;
        this.LJLJJL = false;
        this.LJLJJI = false;
        this.LJLJL = null;
        this.LJLJLJ = null;
    }

    static {
        CKB ckb = new CKB();
        INSTANCE = ckb;
        LJLJLLL = new CKB[]{ckb};
    }

    public static CKB[] values() {
        return (CKB[]) LJLJLLL.clone();
    }

    public final void LIZJ() {
        CKC ckc;
        Queue<BaseMessage> queue = this.LJLIL;
        if (queue == null || ((ArrayDeque) queue).size() < 1 || this.LJLILLLLZI == null || !this.LJLJJL || this.LJLJJI) {
            if (!this.LJLJJI && (ckc = this.LJLJI) != null) {
                ckc.LIZ();
                this.LJLJI = null;
                return;
            }
            return;
        }
        this.LJLJJI = true;
        BaseMessage baseMessage = (BaseMessage) ((ArrayDeque) this.LJLIL).poll();
        if (baseMessage != null) {
            List<EnumC31509CYf> list = this.LJLJL;
            if (list != null) {
                if (((ArrayList) list).contains(baseMessage.getMessageType())) {
                    List<BaseMessage> list2 = this.LJLJLJ;
                    if (list2 != null) {
                        ((ArrayList) list2).add(baseMessage);
                    }
                    onMessageFinish();
                    return;
                }
            }
            if (this.LJLILLLLZI.get() == null) {
                return;
            }
            this.LJLILLLLZI.get().onPlatformMessage(baseMessage);
        }
    }

    public static CKB valueOf(String str) {
        return (CKB) V0N.LJJJ(CKB.class, str);
    }

    public void add(BaseMessage baseMessage) {
        Queue<BaseMessage> queue;
        if (!this.LJLJJL || baseMessage == null || (queue = this.LJLIL) == null) {
            return;
        }
        ((ArrayDeque) queue).offer(baseMessage);
        LIZJ();
    }

    public void addSuppressMessage(List<EnumC31509CYf> list) {
        if (this.LJLJL != null) {
            for (EnumC31509CYf enumC31509CYf : list) {
                if (!this.LJLJL.contains(enumC31509CYf)) {
                    this.LJLJL.add(enumC31509CYf);
                }
            }
        }
    }

    public void registerFinishCallback(CKC ckc) {
        Queue<BaseMessage> queue = this.LJLIL;
        if ((queue != null && ((ArrayDeque) queue).size() >= 1 && this.LJLILLLLZI != null && this.LJLJJL) || this.LJLJJI) {
            this.LJLJI = ckc;
        } else {
            if (ckc == null) {
                return;
            }
            ckc.LIZ();
        }
    }

    public void removeSuppressMessage(List<EnumC31509CYf> list) {
        if (this.LJLJL != null) {
            for (EnumC31509CYf enumC31509CYf : list) {
                if (((ArrayList) this.LJLJL).contains(enumC31509CYf)) {
                    ((ArrayList) this.LJLJL).remove(enumC31509CYf);
                }
            }
        }
        List<BaseMessage> list2 = this.LJLJLJ;
        if (list2 != null) {
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                BaseMessage baseMessage = (BaseMessage) it.next();
                if (list.contains(baseMessage.getMessageType())) {
                    it.remove();
                    Queue<BaseMessage> queue = this.LJLIL;
                    if (queue != null) {
                        ((ArrayDeque) queue).offer(baseMessage);
                    }
                }
            }
        }
        LIZJ();
    }

    public void start(WeakReference<InterfaceC30133Bs9> weakReference) {
        this.LJLILLLLZI = weakReference;
        this.LJLIL = new ArrayDeque();
        this.LJLJJL = true;
        this.LJLJJI = false;
        this.LJLJL = new ArrayList();
        this.LJLJLJ = new ArrayList();
    }

    public void setBigGiftPlayStateEvent(boolean z, boolean z2, C31996Ch6 c31996Ch6) {
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new C80036Vb6();
        }
        this.LJLJJLL.getClass();
        this.LJLJJLL.getClass();
        this.LJLJJLL.getClass();
    }
}
