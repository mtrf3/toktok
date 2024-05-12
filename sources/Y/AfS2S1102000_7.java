package Y;

import X.GSU;
import X.InterfaceC64592gB;
import android.text.Editable;
import com.ss.android.ugc.aweme.api.ValidInfo;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.api.VideoRelatedInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AfS2S1102000_7 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS2S1102000_7 afS2S1102000_7, Object obj) {
        Boolean bool;
        GSU gsu;
        String toastContent;
        Boolean valueOf;
        VideoInfoFromURLResponse videoInfoFromURLResponse = (VideoInfoFromURLResponse) obj;
        int i = afS2S1102000_7.i2;
        int i2 = afS2S1102000_7.i3;
        GSU gsu2 = (GSU) afS2S1102000_7.l1;
        if (gsu2 != null && gsu2.LJLLI) {
            gsu2.setHasUrlTransforming(false);
            Editable text = gsu2.getText();
            if (text != null) {
                text.delete(i, i2);
            }
            gsu2.setUrlEnd(i);
        }
        if (videoInfoFromURLResponse.getStatusCode() == 408) {
            GSU gsu3 = (GSU) afS2S1102000_7.l1;
            if (gsu3 != null) {
                gsu3.LJIIJ("timeout", false, afS2S1102000_7.i2, null, afS2S1102000_7.s0);
                return;
            }
            return;
        }
        String str = null;
        if (videoInfoFromURLResponse.getStatusCode() != 0 || videoInfoFromURLResponse.getValidInfo() == null || videoInfoFromURLResponse.getVideoInfo() == null) {
            GSU gsu4 = (GSU) afS2S1102000_7.l1;
            if (gsu4 == null) {
                return;
            }
            ValidInfo validInfo = videoInfoFromURLResponse.getValidInfo();
            if (validInfo != null) {
                str = validInfo.getToastContent();
            }
            gsu4.LJIIJ(str, false, afS2S1102000_7.i2, null, afS2S1102000_7.s0);
            return;
        }
        ValidInfo validInfo2 = videoInfoFromURLResponse.getValidInfo();
        if (validInfo2 != null) {
            bool = Boolean.valueOf(validInfo2.getAttachable());
        } else {
            bool = null;
        }
        if (bool != null) {
            if (bool.booleanValue() && (gsu = (GSU) afS2S1102000_7.l1) != null) {
                List<String> mentionVideoIdList = gsu.getMentionVideoIdList();
                if (mentionVideoIdList.size() > 3) {
                    GSU gsu5 = (GSU) afS2S1102000_7.l1;
                    gsu5.LJIIJ(gsu5.getContext().getString(R.string.e5z), false, afS2S1102000_7.i2, null, afS2S1102000_7.s0);
                    return;
                }
                if (mentionVideoIdList.size() == 3) {
                    GSU gsu6 = (GSU) afS2S1102000_7.l1;
                    gsu6.LJIIJ(gsu6.getContext().getString(R.string.e5y), false, afS2S1102000_7.i2, null, afS2S1102000_7.s0);
                    return;
                }
                VideoRelatedInfo videoInfo = videoInfoFromURLResponse.getVideoInfo();
                o.LJI(videoInfo);
                if (mentionVideoIdList.contains(String.valueOf(videoInfo.getAwemeId()))) {
                    GSU gsu7 = (GSU) afS2S1102000_7.l1;
                    gsu7.LJIIJ(gsu7.getContext().getString(R.string.e5x), false, afS2S1102000_7.i2, null, afS2S1102000_7.s0);
                    return;
                }
                GSU gsu8 = (GSU) afS2S1102000_7.l1;
                ValidInfo validInfo3 = videoInfoFromURLResponse.getValidInfo();
                if (validInfo3 != null && (toastContent = validInfo3.getToastContent()) != null) {
                    ValidInfo validInfo4 = videoInfoFromURLResponse.getValidInfo();
                    if (validInfo4 != null && (valueOf = Boolean.valueOf(validInfo4.isLongUrl())) != null) {
                        gsu8.LJIIJ(toastContent, valueOf.booleanValue(), afS2S1102000_7.i2, videoInfoFromURLResponse.getVideoInfo(), afS2S1102000_7.s0);
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            GSU gsu9 = (GSU) afS2S1102000_7.l1;
            if (gsu9 == null) {
                return;
            }
            ValidInfo validInfo5 = videoInfoFromURLResponse.getValidInfo();
            if (validInfo5 != null) {
                str = validInfo5.getToastContent();
            }
            gsu9.LJIIJ(str, false, afS2S1102000_7.i2, null, afS2S1102000_7.s0);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void accept$1(AfS2S1102000_7 afS2S1102000_7, Object obj) {
        int i = afS2S1102000_7.i2;
        int i2 = afS2S1102000_7.i3;
        GSU gsu = (GSU) afS2S1102000_7.l1;
        if (gsu != null && gsu.LJLLI) {
            gsu.setHasUrlTransforming(false);
            Editable text = gsu.getText();
            if (text != null) {
                text.delete(i, i2);
            }
            gsu.setUrlEnd(i);
        }
        GSU gsu2 = (GSU) afS2S1102000_7.l1;
        if (gsu2 != null) {
            gsu2.LJIIJ("timeout", false, afS2S1102000_7.i2, null, afS2S1102000_7.s0);
        }
    }

    public AfS2S1102000_7(int i, int i2, GSU gsu, String str, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = gsu;
        this.s0 = str;
    }
}
