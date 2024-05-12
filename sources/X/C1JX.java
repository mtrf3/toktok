package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import n.b;

/* renamed from: X.1JX, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1JX implements InterfaceC67209QZh, InterfaceC73592SuS {
    public static ArrayList LJFF(Object obj) {
        C141335gf.LIZJ(obj);
        return new ArrayList();
    }

    public static W5F LJI(User user) {
        return W5U.LJII(C78939UyV.LJ(user.getAvatarThumb()));
    }

    @Override // X.InterfaceC67209QZh
    public Object LIZ(QZO qzo) {
        java.util.Set LJI = qzo.LJI(AbstractC67210QZi.class);
        C67205QZd c67205QZd = C67205QZd.LIZIZ;
        if (c67205QZd == null) {
            synchronized (C67205QZd.class) {
                c67205QZd = C67205QZd.LIZIZ;
                if (c67205QZd == null) {
                    c67205QZd = new C67205QZd();
                    C67205QZd.LIZIZ = c67205QZd;
                }
            }
        }
        return new C67204QZc(LJI, c67205QZd);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        return !((C29985Bpl) obj).LIZJ.isRecycled();
    }

    public static void LJII(long j, ParcelableSnapshotMutableState parcelableSnapshotMutableState) {
        parcelableSnapshotMutableState.setValue(new C11850dJ(j));
    }

    public static void LJIIIIZZ(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
    }

    public static int LIZIZ(double d, int i, int i2) {
        return (C16880lQ.LLJI(d) + i) * i2;
    }

    public static int LIZLLL(InterfaceC65784Pro interfaceC65784Pro, int i, int i2) {
        return (interfaceC65784Pro.hashCode() + i) * i2;
    }

    public static ViewGroup.MarginLayoutParams LJ(int i, int i2, VideoViewCellRootView videoViewCellRootView, ViewStub viewStub, int i3, ViewStub viewStub2) {
        ViewGroup.MarginLayoutParams LJ = b.LJ(i, i2, videoViewCellRootView);
        viewStub.setInflatedId(i3);
        b.LIZ(viewStub2);
        return LJ;
    }

    public static void LJIIIZ(InterfaceC24420xa interfaceC24420xa, String str, C24570xp c24570xp, String str2, InterfaceC24350xT interfaceC24350xT, String str3) {
        o.LJIIIZ(interfaceC24420xa, str);
        o.LJIIIZ(c24570xp, str2);
        o.LJIIIZ(interfaceC24350xT, str3);
    }

    public static int LIZJ(Rect rect, String str, View view, String str2, RecyclerView recyclerView, String str3, C0AC c0ac, String str4, View view2) {
        o.LJIIIZ(rect, str);
        o.LJIIIZ(view, str2);
        o.LJIIIZ(recyclerView, str3);
        o.LJIIIZ(c0ac, str4);
        return RecyclerView.LJJJJIZL(view2);
    }
}
