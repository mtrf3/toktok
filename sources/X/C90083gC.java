package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3gC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90083gC extends MK7 {
    public final C89853fp LJLIL;
    public List<? extends IMUser> LJLILLLLZI;
    public List<? extends SearchSugEntity> LJLJI;
    public String LJLJJI = "";

    @Override // X.C4II
    public final int getBasicItemCount() {
        int i;
        List<? extends IMUser> list = this.LJLILLLLZI;
        int i2 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List<? extends SearchSugEntity> list2 = this.LJLJI;
        if (list2 != null) {
            i2 = list2.size();
        }
        return i + i2;
    }

    public C90083gC(C89853fp c89853fp) {
        this.LJLIL = c89853fp;
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String str;
        int i3;
        List<? extends IMUser> list = this.LJLILLLLZI;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (!(viewHolder instanceof C89933fx)) {
            return;
        }
        C89933fx c89933fx = (C89933fx) viewHolder;
        String str2 = this.LJLJJI;
        c89933fx.getClass();
        o.LJIIIZ(str2, "<set-?>");
        if (i < i2) {
            List<? extends IMUser> list2 = this.LJLILLLLZI;
            if (list2 != null) {
                IMUser imUser = (IMUser) ListProtector.get(list2, i);
                c89933fx.getClass();
                o.LJIIIZ(imUser, "imUser");
                if (i == 0) {
                    c89933fx.LJLJI.setVisibility(0);
                    c89933fx.LJLJI.setText(R.string.pow);
                } else {
                    c89933fx.LJLJI.setVisibility(8);
                }
                c89933fx.N(i, imUser);
                return;
            }
            return;
        }
        List<? extends SearchSugEntity> list3 = this.LJLJI;
        if (list3 == null) {
            return;
        }
        SearchSugEntity data = (SearchSugEntity) ListProtector.get(list3, i - i2);
        c89933fx.getClass();
        o.LJIIIZ(data, "data");
        SugExtraInfo sugExtraInfo = data.sugExtraInfo;
        o.LJIIIIZZ(sugExtraInfo, "data.sugExtraInfo");
        int mentionBlockType = (int) sugExtraInfo.getMentionBlockType();
        IMUser iMUser = new IMUser();
        iMUser.setUid(sugExtraInfo.getUserId());
        iMUser.setSecUid(sugExtraInfo.getSecUserId());
        iMUser.setNickName(sugExtraInfo.getUserNickname());
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(sugExtraInfo.getUserAvatarUri());
        boolean z = true;
        urlModel.setUrlList(C47261Igj.LJJIJIIJI(sugExtraInfo.getUserAvatarUri(), sugExtraInfo.getUserAvatarUri()));
        iMUser.setAvatarThumb(urlModel);
        iMUser.setUniqueId(sugExtraInfo.getUsername());
        iMUser.setSearchType(1);
        if (sugExtraInfo.isVerifiedUser()) {
            str = "verified";
        } else {
            str = "";
        }
        iMUser.setCustomVerify(str);
        if (mentionBlockType != 0) {
            z = false;
        }
        iMUser.setUserEnabledQAInvite(Boolean.valueOf(z));
        List<? extends IMUser> list4 = c89933fx.LJLILLLLZI.LJLILLLLZI;
        if (list4 != null) {
            i3 = list4.size();
        } else {
            i3 = 0;
        }
        if (i == i3) {
            c89933fx.LJLJI.setVisibility(0);
            c89933fx.LJLJI.setText(R.string.pop);
        } else {
            c89933fx.LJLJI.setVisibility(8);
        }
        c89933fx.N(i, iMUser);
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        return new C89933fx(this, C1FL.LIZIZ(parent, R.layout.c_r, parent, false, "from(parent.context)\n   …user_item, parent, false)"), this);
    }
}
