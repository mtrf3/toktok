package X;

import Y.IDComparatorS333S0100000;
import Y.IDfS124S0200000;
import Y.IDfS292S0100000;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.PinSoundEffectRequest;

/* renamed from: X.1eH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37931eH implements InterfaceC14130gz<C1QC> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final long LJLIL;
    public SoundEffect LJLJI;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C28L.LJLIL);
    public final C13B LJLJJI = new Handler.Callback(this) { // from class: X.13B
        public final WeakReference<C37931eH> LJLIL;

        {
            o.LJIIIZ(this, "repo");
            this.LJLIL = new WeakReference<>(this);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message msg) {
            List list;
            o.LJIIIZ(msg, "msg");
            C37931eH c37931eH = this.LJLIL.get();
            if (c37931eH == null || msg.what != 100) {
                return false;
            }
            long[] longArray = msg.getData().getLongArray("sfx_id_list");
            if (longArray == null || (list = ORY.LJJZZI(longArray)) == null) {
                list = C61878OQg.INSTANCE;
            }
            c37931eH.LIZJ(msg.arg1, list);
            return true;
        }
    };
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new C28M(this));

    public final List<SoundEffect> LIZIZ() {
        return (List) this.LJLILLLLZI.getValue();
    }

    public final void LIZLLL() {
        if (!LIZIZ().isEmpty()) {
            InterfaceC09770Zx LJIJ = SoundEffectDatabase.LJIIL.LJIJ();
            LJIJ.LIZ();
            LJIJ.LIZIZ(LIZIZ());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13B] */
    public C37931eH(long j) {
        this.LJLIL = j;
    }

    public final Object LIZ(InterfaceC67352kd<? super List<C1QC>> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        ((EffectRelatedApi) C1A.LIZJ(EffectRelatedApi.class)).fetchSoundEffect(this.LJLIL).LJJL(T16.LIZ()).LJJJLIIL(new IDfS124S0200000(this, c84654XKg, 16), new IDfS292S0100000(c84654XKg, 49));
        return c84654XKg.LIZ();
    }

    public final void LIZJ(final int i, final List idList) {
        o.LJIIIZ(idList, "idList");
        if (idList.isEmpty()) {
            return;
        }
        List<SoundEffect> LIZIZ = LIZIZ();
        if (LIZIZ.size() > 1) {
            C40675Fxn.LJJLIIIJ(LIZIZ, new IDComparatorS333S0100000(idList, 1));
        }
        ((Handler) this.LJLJJL.getValue()).removeMessages(100);
        EffectRelatedApi effectRelatedApi = (EffectRelatedApi) C1A.LIZJ(EffectRelatedApi.class);
        PinSoundEffectRequest pinSoundEffectRequest = new PinSoundEffectRequest();
        pinSoundEffectRequest.soundEffectIdList.addAll(idList);
        effectRelatedApi.uploadSoundEffectOrder(pinSoundEffectRequest).LJJL(T16.LIZ()).LJJJLIIL(new IDfS292S0100000(this, 50), new InterfaceC64592gB() { // from class: X.1eI
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                if (i < 1) {
                    Object value = this.LJLJJL.getValue();
                    List<Long> list = idList;
                    int i2 = i;
                    Handler handler = (Handler) value;
                    Message obtainMessage = handler.obtainMessage(100);
                    o.LJIIIIZZ(obtainMessage, "obtainMessage(MESSAGE_UPLOAD_SFX_ORDER_RETRY)");
                    obtainMessage.getData().putLongArray("sfx_id_list", ORZ.LLJIJIL(list));
                    obtainMessage.arg1 = i2 + 1;
                    handler.sendMessageDelayed(obtainMessage, 30000L);
                }
            }
        });
    }
}
