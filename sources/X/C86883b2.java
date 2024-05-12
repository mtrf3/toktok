package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* renamed from: X.3b2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86883b2 extends F9E implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C86883b2(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        String str;
        if (!(interfaceC57784Mm4 instanceof C86883b2)) {
            return false;
        }
        Video video = this.LJLIL.getVideo();
        String str2 = null;
        if (video != null) {
            str = video.getVideoId();
        } else {
            str = null;
        }
        Video video2 = ((C86883b2) interfaceC57784Mm4).LJLIL.getVideo();
        if (video2 != null) {
            str2 = video2.getVideoId();
        }
        return o.LJ(str, str2);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C86883b2) || this.LJLIL.getAid() == null || !o.LJ(this.LJLIL.getAid(), ((C86883b2) interfaceC57784Mm4).LJLIL.getAid())) {
            return false;
        }
        return true;
    }
}
