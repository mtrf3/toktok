package X;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8qX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223898qX extends AbstractC221838nD {
    public final C62822Ol8 LJLJJL;

    public final java.util.Map<String, String> LJIIIIZZ() {
        String str;
        C223778qL c223778qL;
        String str2;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        HashMap hashMap = new HashMap();
        hashMap.put("close", "false");
        hashMap.put("back", "true");
        hashMap.put("hide_nav_bar", "false");
        C245649kW c245649kW = this.LJLJJI;
        String str3 = null;
        if (c245649kW != null && (c223778qL3 = c245649kW.LJIIZILJ) != null) {
            str3 = c223778qL3.LIZIZ;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("author_id", str3);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 == null || (c223778qL2 = c245649kW2.LJIIZILJ) == null || (str = c223778qL2.LIZJ) == null) {
            str = "";
        }
        hashMap.put("group_id", str);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL = c245649kW3.LJIIZILJ) != null && (str2 = c223778qL.LIZ) != null) {
            str4 = str2;
        }
        hashMap.put("enter_from", str4);
        return hashMap;
    }

    @Override // X.AbstractC221838nD
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
        o.LJIIIZ(stickerStruct, "stickerStruct");
        return C223998qh.LIZJ(j, stickerStruct);
    }

    @Override // X.AbstractC221838nD
    public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        popListener.LIZ(this.LJLILLLLZI.LJIJJLI(f, f2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223898qX(Context context, C223908qY view, InteractStickerStruct interactStickerStruct, C245649kW c245649kW) {
        super(context, view, interactStickerStruct, c245649kW);
        o.LJIIIZ(view, "view");
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(interactStickerStruct, 1680));
    }
}
