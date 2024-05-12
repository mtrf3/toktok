package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BJA extends F9E {
    public String LJLIL;
    public String LJLILLLLZI;

    public BJA() {
        this(0);
    }

    public final java.util.Map<String, String> L() {
        return C113554cx.LJJL(new OSZ("small_picture_type", this.LJLIL), new OSZ("drawer_from_room_id", this.LJLILLLLZI));
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ BJA(int i) {
        this("", "");
    }

    public BJA(String smallPictureType, String drawerFromRoomId) {
        o.LJIIIZ(smallPictureType, "smallPictureType");
        o.LJIIIZ(drawerFromRoomId, "drawerFromRoomId");
        this.LJLIL = smallPictureType;
        this.LJLILLLLZI = drawerFromRoomId;
    }
}
