package Y;

import X.AbstractC73672Svk;
import X.C56514MFy;
import X.C57296MeC;
import X.C76800UCe;
import X.C84339X8d;
import X.C84340X8e;
import X.InterfaceC48038ItG;
import X.MG0;
import X.WM7;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDhS12S1100000_9 implements InterfaceC48038ItG {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS12S1100000_9 iDhS12S1100000_9, Object it) {
        o.LJIIIZ(it, "it");
        AbstractC73672Svk<UserStoriesResponse> userStories = StoryApi.LIZIZ.getUserStories(iDhS12S1100000_9.s0);
        ((C57296MeC) iDhS12S1100000_9.l1).LJLILLLLZI.set(true);
        return userStories;
    }

    public static final Object apply$1(IDhS12S1100000_9 iDhS12S1100000_9, Object obj) {
        boolean z;
        int i;
        String queryParameter;
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        try {
            z = ((Uri) iDhS12S1100000_9.l1).getBooleanQueryParameter("allow_play_full_song_in_tt", false);
        } catch (Exception unused) {
            z = false;
        }
        try {
            queryParameter = UriProtector.getQueryParameter((Uri) iDhS12S1100000_9.l1, WM7.SCENE_SERVICE);
        } catch (Exception unused2) {
        }
        if (queryParameter != null) {
            i = CastIntegerProtector.parseInt(queryParameter);
            String str = iDhS12S1100000_9.s0;
            Boolean valueOf = Boolean.valueOf(z);
            MG0.LIZJ = false;
            C84340X8e c84340X8e = C84339X8d.LIZJ;
            C56514MFy c56514MFy = new C56514MFy(i, str, valueOf, it);
            c84340X8e.getClass();
            C84340X8e.LIZIZ(c56514MFy);
            return C76800UCe.LIZ;
        }
        i = 0;
        String str2 = iDhS12S1100000_9.s0;
        Boolean valueOf2 = Boolean.valueOf(z);
        MG0.LIZJ = false;
        C84340X8e c84340X8e2 = C84339X8d.LIZJ;
        C56514MFy c56514MFy2 = new C56514MFy(i, str2, valueOf2, it);
        c84340X8e2.getClass();
        C84340X8e.LIZIZ(c56514MFy2);
        return C76800UCe.LIZ;
    }

    public IDhS12S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
