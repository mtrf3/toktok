package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;

/* renamed from: X.FrJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C40273FrJ implements InterfaceC88472Yns {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.LJLIL) {
            case 0:
                ((CommentWidget) this.LJLILLLLZI).LLFII();
                return C76800UCe.LIZ;
            default:
                ((InterfaceC36488ETs) this.LJLILLLLZI).onSuccess(obj);
                return C76800UCe.LIZ;
        }
    }

    public /* synthetic */ C40273FrJ(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
