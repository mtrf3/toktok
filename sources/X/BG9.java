package X;

import com.bytedance.android.livesdk.model.Hashtag;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BG9 extends TBS implements InterfaceC88472Yns<Hashtag, C76800UCe> {
    public BG9(Object obj) {
        super(1, obj, BG8.class, "onCheckChanged", "onCheckChanged(Lcom/bytedance/android/livesdk/model/Hashtag;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Hashtag hashtag) {
        Hashtag p0 = hashtag;
        o.LJIIIZ(p0, "p0");
        BG8 bg8 = (BG8) this.receiver;
        bg8.LJLILLLLZI = p0;
        bg8.notifyDataSetChanged();
        bg8.LJLJI.invoke(p0);
        return C76800UCe.LIZ;
    }
}
