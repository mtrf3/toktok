package X;

import android.os.Message;
import com.ss.android.ugc.aweme.music.model.MusicDetail;

/* loaded from: classes10.dex */
public final class MJ0 {
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(MJ2.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(MJ1.LJLIL);
    public final InterfaceC88472Yns<Message, C76800UCe> LIZ;
    public final InterfaceC88472Yns<MusicDetail, C76800UCe> LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C56553MHl.LJLIL);

    public final InterfaceC70422pa LIZ() {
        return (InterfaceC70422pa) this.LIZJ.getValue();
    }

    public final void LIZIZ(Object obj) {
        Message message = new Message();
        message.obj = obj;
        this.LIZ.invoke(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MJ0(InterfaceC88472Yns<? super Message, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super MusicDetail, C76800UCe> interfaceC88472Yns2) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC88472Yns2;
    }
}
