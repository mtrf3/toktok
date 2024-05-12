package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.tt.appbrandimpl.PublishExtra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HIi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43836HIi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(MicroAppModel microAppModel, StringBuilder sb, List list) {
        PublishExtra publishExtra;
        List<TaskMentionedUser> list2;
        if (microAppModel != null && (!TextUtils.isEmpty(microAppModel.extra)) && (publishExtra = (PublishExtra) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), microAppModel.extra, PublishExtra.class)) != null) {
            List<String> list3 = publishExtra.hashTagList;
            if (list3 != null && (!list3.isEmpty())) {
                Iterator<String> it = list3.iterator();
                while (it.hasNext()) {
                    C1DI.LIZIZ(sb, "#", it.next(), " ");
                }
            }
            String str = publishExtra.videoTitle;
            if (str != null && (list2 = publishExtra.userList) != null && (!list2.isEmpty())) {
                ArrayList arrayList = new ArrayList();
                for (TaskMentionedUser taskMentionedUser : list2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('@');
                    LIZ2.append(taskMentionedUser.getNickname());
                    arrayList.add(X1D.LIZIZ(LIZ2));
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(copyOf, copyOf.length));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                sb.append(LLLZ);
                for (TaskMentionedUser taskMentionedUser2 : list2) {
                    int indexOf = sb.indexOf(taskMentionedUser2.getNickname()) - 1;
                    int length = taskMentionedUser2.getNickname().length() + indexOf + 1;
                    String userId = taskMentionedUser2.getUserId();
                    o.LJIIIIZZ(userId, "user.userId");
                    ((ArrayList) list).add(AVTextExtraStructHelper.createAtStruct(indexOf, length, userId, taskMentionedUser2.getSecUid()));
                }
            }
        }
    }
}
