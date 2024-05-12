package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219618jd extends F9E implements InterfaceC57784Mm4 {
    public final int LJLIL;
    public final AddYoursTopic LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        String str;
        if (interfaceC57784Mm4 instanceof C219618jd) {
            C219618jd c219618jd = (C219618jd) interfaceC57784Mm4;
            if (o.LJ(this.LJLILLLLZI.getTopicId(), c219618jd.LJLILLLLZI.getTopicId())) {
                Aweme video = this.LJLILLLLZI.getVideo();
                String str2 = null;
                if (video != null) {
                    str = video.getAid();
                } else {
                    str = null;
                }
                Aweme video2 = c219618jd.LJLILLLLZI.getVideo();
                if (video2 != null) {
                    str2 = video2.getAid();
                }
                if (o.LJ(str, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C219618jd(int i, AddYoursTopic addYoursTopic, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = addYoursTopic;
        this.LJLJI = z;
    }
}
