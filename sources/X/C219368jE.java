package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8jE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219368jE implements InterfaceC57784Mm4 {
    public final long LJLIL;
    public final AddYoursTopic LJLILLLLZI;
    public final String LJLJI;
    public final UrlModel LJLJJI;
    public final long LJLJJL;
    public final Aweme LJLJJLL;
    public final List<AddYoursAvatar> LJLJL;
    public final boolean LJLJLJ;
    public final C219948kA LJLJLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C219368jE)) {
            return false;
        }
        C219368jE c219368jE = (C219368jE) obj;
        return this.LJLIL == c219368jE.LJLIL && o.LJ(this.LJLILLLLZI, c219368jE.LJLILLLLZI) && o.LJ(this.LJLJI, c219368jE.LJLJI) && o.LJ(this.LJLJJI, c219368jE.LJLJJI) && this.LJLJJL == c219368jE.LJLJJL && o.LJ(this.LJLJJLL, c219368jE.LJLJJLL) && o.LJ(this.LJLJL, c219368jE.LJLJL) && this.LJLJLJ == c219368jE.LJLJLJ && o.LJ(this.LJLJLLL, c219368jE.LJLJLLL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursCollectionItem(topicId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", topic=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", text=");
        LIZ.append(this.LJLJI);
        LIZ.append(", cover=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", videoCount=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", aweme=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", userAvatars=");
        LIZ.append(this.LJLJL);
        LIZ.append(", translated=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", translationInfo=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.LJLJI, (this.LJLILLLLZI.hashCode() + (C16880lQ.LLJIJIL(this.LJLIL) * 31)) * 31, 31);
        UrlModel urlModel = this.LJLJJI;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJLJJL, (LJ + hashCode) * 31, 31);
        Aweme aweme = this.LJLJJLL;
        if (aweme == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aweme.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        List<AddYoursAvatar> list = this.LJLJL;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        boolean z = this.LJLJLJ;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        C219948kA c219948kA = this.LJLJLLL;
        if (c219948kA != null) {
            i = c219948kA.hashCode();
        }
        return i5 + i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C219368jE(com.ss.android.ugc.aweme.addyours.model.AddYoursTopic r15) {
        /*
            r14 = this;
            java.lang.String r0 = "topicInfo"
            r5 = r15
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Long r0 = r5.getTopicId()
            r8 = 0
            if (r0 == 0) goto L75
            long r3 = r0.longValue()
        L12:
            java.lang.String r6 = r5.getText()
            if (r6 != 0) goto L1a
            java.lang.String r6 = ""
        L1a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getVideo()
            r11 = 0
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r0.getCover()
        L2b:
            java.lang.Long r0 = r5.getVideoCount()
            if (r0 == 0) goto L35
            long r8 = r0.longValue()
        L35:
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r5.getVideo()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getVideo()
            if (r0 == 0) goto L6a
            java.util.List r0 = r0.getInteractStickerStructs()
            if (r0 == 0) goto L6a
            java.util.Iterator r2 = r0.iterator()
        L49:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r0
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r0 = r0.getAddYoursStickerStruct()
            if (r0 == 0) goto L49
        L5c:
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r1 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r1
            if (r1 == 0) goto L6a
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r0 = r1.getAddYoursStickerStruct()
            if (r0 == 0) goto L6a
            java.util.List r11 = r0.getUserAvatars()
        L6a:
            r13 = 0
            r12 = 0
            r2 = r14
            r2.<init>(r3, r5, r6, r7, r8, r10, r11, r12, r13)
            return
        L71:
            r1 = r11
            goto L5c
        L73:
            r7 = r11
            goto L2b
        L75:
            r3 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219368jE.<init>(com.ss.android.ugc.aweme.addyours.model.AddYoursTopic):void");
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C219368jE(long j, AddYoursTopic topic, String str, UrlModel urlModel, long j2, Aweme aweme, List<AddYoursAvatar> list, boolean z, C219948kA c219948kA) {
        o.LJIIIZ(topic, "topic");
        this.LJLIL = j;
        this.LJLILLLLZI = topic;
        this.LJLJI = str;
        this.LJLJJI = urlModel;
        this.LJLJJL = j2;
        this.LJLJJLL = aweme;
        this.LJLJL = list;
        this.LJLJLJ = z;
        this.LJLJLLL = c219948kA;
    }
}
