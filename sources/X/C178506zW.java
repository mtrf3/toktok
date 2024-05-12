package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.6zW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178506zW {
    public final Context LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public C76T LIZLLL;
    public C176996x5 LJ;
    public InterfaceC178496zV LJFF;
    public String LJI;
    public String LJII;

    public final boolean LIZIZ() {
        Aweme aweme;
        InterfaceC178496zV interfaceC178496zV = this.LJFF;
        if (interfaceC178496zV != null) {
            aweme = interfaceC178496zV.getCommentInputAweme();
        } else {
            aweme = null;
        }
        if (aweme == null) {
            return false;
        }
        boolean LIZ = C178316zD.LIZ(aweme);
        if (!LIZ() || !LIZ) {
            return false;
        }
        return true;
    }

    public final boolean LIZ() {
        InterfaceC178496zV interfaceC178496zV;
        M89 s3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if ((C7DU.LIZ() & 2) != 2 && (interfaceC178496zV = this.LJFF) != null && (s3 = interfaceC178496zV.s3()) != null) {
            if (((Number) C181497Aj.LIZ.getValue()).intValue() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (o.LJ("others_homepage", s3.getEventType()) && s3.isFromPostList()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (s3.isStoryPage() && !o.LJ("chat_list", s3.getEventType())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (o.LJ(s3.getEventType(), "others_homepage") || o.LJ(s3.getEventType(), "homepage_hot")) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (s3.isChain() && z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z && (z2 || z3 || z5)) {
                return true;
            }
        }
        return false;
    }

    public C178506zW(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1631));
        this.LIZJ = C221108m2.LIZIZ(C178556zb.LJLIL);
        this.LJII = "";
    }
}
