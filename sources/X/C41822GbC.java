package X;

import com.ss.android.ugc.aweme.canvas.ForwardMusic;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.MediaAuthor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.GbC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41822GbC implements ForwardMedia {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final ForwardVideo LJLJI;
    public final float LJLJJI;
    public final MediaAuthor LJLJJL;
    public final ForwardMusic LJLJJLL;
    public final PhotoModeImageInfo LJLJL;
    public final String LJLJLJ;
    public final long LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final int LJLLILLLL;

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public MediaAuthor getAuthor() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public int getAwemeType() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public long getCreateTime() {
        return this.LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public String getEnterMethod() {
        return this.LJLLI;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public String getEventType() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public ForwardMusic getForwardMusic() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public int getOriginVideoAIGCLabelType() {
        return this.LJLLILLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public String getPastMemoryKey() {
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public PhotoModeImageInfo getPhotoModeImageInfo() {
        return this.LJLJL;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public String getSourceId() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public float getTargetVolumeLoud() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMedia
    public ForwardVideo getVideo() {
        return this.LJLJI;
    }

    public C41822GbC(String sourceId, int i, ForwardVideo video, float f, MediaAuthor author, ForwardMusic forwardMusic, PhotoModeImageInfo photoModeImageInfo, String pastMemoryKey, long j, String eventType, String enterMethod, int i2) {
        o.LJIIIZ(sourceId, "sourceId");
        o.LJIIIZ(video, "video");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = sourceId;
        this.LJLILLLLZI = i;
        this.LJLJI = video;
        this.LJLJJI = f;
        this.LJLJJL = author;
        this.LJLJJLL = forwardMusic;
        this.LJLJL = photoModeImageInfo;
        this.LJLJLJ = pastMemoryKey;
        this.LJLJLLL = j;
        this.LJLL = eventType;
        this.LJLLI = enterMethod;
        this.LJLLILLLL = i2;
    }

    public /* synthetic */ C41822GbC(String str, int i, ForwardVideo forwardVideo, float f, MediaAuthor mediaAuthor, ForwardMusic forwardMusic, PhotoModeImageInfo photoModeImageInfo, String str2, long j, String str3, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, forwardVideo, f, mediaAuthor, forwardMusic, photoModeImageInfo, str2, j, str3, (i3 & 1024) != 0 ? "" : str4, (i3 & 2048) != 0 ? 0 : i2);
    }
}
