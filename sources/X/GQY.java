package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchUser;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GQY extends GQR {
    public final ActivityC45651qj LIZ;
    public final VideoPublishEditModel LIZIZ;

    @Override // X.GQR
    public final List<AbstractC41508GQu> LIZ() {
        String str;
        if (this.LIZIZ.isStitchMode()) {
            ActivityC45651qj activityC45651qj = this.LIZ;
            StitchUser stitchUser = this.LIZIZ.creativeModel.stitchModel.stitchAuthor;
            if (stitchUser != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('@');
                if (!FriendsServiceImpl.LJJJJ().LJIJJ() || (str = stitchUser.nickname) == null) {
                    if (!TextUtils.isEmpty(stitchUser.uniqueId)) {
                        str = stitchUser.uniqueId;
                    } else if (!TextUtils.isEmpty(stitchUser.shortId)) {
                        str = stitchUser.shortId;
                    } else {
                        str = "";
                    }
                }
                LIZ.append(str);
                String LIZIZ = X1D.LIZIZ(LIZ);
                String string = activityC45651qj.getString(R.string.p61, LIZIZ);
                o.LJIIIIZZ(string, "context.getString(resId, userName)");
                if (ujb.o.LJJJJ(string, LIZIZ, false)) {
                    string = C42398GkU.LIZIZ(string, ' ');
                }
                if (!ujb.o.LJJJJ(string, " ", false)) {
                    string = C42398GkU.LIZIZ(string, ' ');
                }
                int LJJLIIIJL = s.LJJLIIIJL(string, LIZIZ, 0, false, 6);
                int length = LIZIZ.length() + LJJLIIIJL;
                ArrayList arrayList = new ArrayList();
                String str2 = this.LIZIZ.creativeModel.stitchModel.videoId;
                if (str2 != null) {
                    AVTextExtraStruct createDuetStruct = AVTextExtraStructHelper.createDuetStruct(LJJLIIIJL, length, stitchUser.uid, str2);
                    arrayList.add(AVTextExtraStructHelper.createStitchChainBoundaryStruct(string));
                    arrayList.add(createDuetStruct);
                    arrayList.addAll(GQL.LIZ(string, arrayList));
                    GQL.LIZIZ(arrayList, true);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AVTextExtraStruct) it.next()).setDuet(false);
                    }
                    C45322HqY c45322HqY = new C45322HqY((CharSequence) string, (List) arrayList);
                    CharSequence charSequence = c45322HqY.LJLJI;
                    List list = c45322HqY.LJLILLLLZI;
                    C41495GQh c41495GQh = new C41495GQh(new GQU());
                    c41495GQh.LJI(charSequence, list);
                    return c41495GQh.LIZ();
                }
                "stitch video id is null in stitch mode".toString();
                throw new IllegalArgumentException("stitch video id is null in stitch mode");
            }
            "stitch author is null in stitch mode".toString();
            throw new IllegalArgumentException("stitch author is null in stitch mode");
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.GQR
    public final GQV LIZJ() {
        return GQV.STITCH_CHAIN;
    }

    @Override // X.GQR
    public final void LIZLLL(List<AbstractC41508GQu> original) {
        o.LJIIIZ(original, "original");
        Iterator<AbstractC41508GQu> it = original.iterator();
        while (it.hasNext()) {
            AbstractC41508GQu next = it.next();
            if (next instanceof GR3) {
                it.remove();
                if (it.hasNext()) {
                    GQR.LJ(it.next());
                    return;
                }
                return;
            }
            if (!GQR.LIZIZ(next)) {
                return;
            }
        }
    }

    public GQY(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LIZ = activityC45651qj;
        this.LIZIZ = videoPublishEditModel;
    }
}
