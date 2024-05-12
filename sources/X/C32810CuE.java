package X;

import android.view.MotionEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.CuE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32810CuE implements InterfaceC54842Lfi, InterfaceC75706TnS, InterfaceC73592SuS, InterfaceC48038ItG {
    public static final C32810CuE LJLIL = new C32810CuE();
    public static final C32810CuE LJLILLLLZI = new C32810CuE();
    public static final int[] LJLJI = new int[0];
    public static final Object[] LJLJJI = new Object[0];

    @Override // X.InterfaceC54842Lfi
    public boolean LIZ(Object obj, File file, File file2) {
        try {
            return !((Boolean) C40654FxS.LJ(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final EnumC76934UHi LJI() {
        if (C32129CjF.LIZ.LIZLLL == EnumC35487DwJ.GUEST) {
            return EnumC76934UHi.GUEST;
        }
        return EnumC76934UHi.ANCHOR;
    }

    public static final EnumC35443Dvb LIZJ(C15940ju c15940ju) {
        if (o.LJ(c15940ju.LJI, "collect_page")) {
            return EnumC35443Dvb.RANDOM_GIFT;
        }
        if (o.LJ(c15940ju.LJI, "gift_detail_page")) {
            return EnumC35443Dvb.FIREWORKS_GIFT;
        }
        if (C96Q.LIZ(c15940ju.LJIIJJI)) {
            return EnumC35443Dvb.GIFT_BOX;
        }
        if (o.LJ(c15940ju.LJI, "gift_hub")) {
            return EnumC35443Dvb.GIFT_HUB;
        }
        if (C96Q.LIZ(c15940ju.LJIILLIIL) || o.LJ(c15940ju.LJI, "pin_card")) {
            return EnumC35443Dvb.LIVE_GOAL;
        }
        return EnumC35443Dvb.OTHERS;
    }

    public static final User LJ(C15940ju c15940ju) {
        int ordinal = LIZJ(c15940ju).ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                        if (room != null) {
                            return room.getOwner();
                        }
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    if (room2 != null) {
                        return room2.getOwner();
                    }
                }
                return null;
            }
            return C32129CjF.LIZ.LIZJ;
        }
        return C32129CjF.LIZ.LIZJ;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Iterable commentMsgList = (Iterable) obj;
        o.LJIIIZ(commentMsgList, "commentMsgList");
        return new OSZ(commentMsgList, ORZ.LLD(commentMsgList, ",", null, null, C81083Ge.LJLIL, 30));
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        MotionEvent ev = (MotionEvent) obj;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75706TnS
    public void LJFF(OFV ofv) {
    }

    @Override // X.InterfaceC75706TnS
    public void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto replyInvite error = ");
        LIZ.append(c76003TsF);
        LIZ.append(", throwable.message=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C1EW.LIZLLL(LIZ, str, LIZ, "MultiHostCrossRefuseManager");
    }

    public static final int LIZIZ(int i, int i2, int[] iArr) {
        o.LJIIIZ(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }
}
