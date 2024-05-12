package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OfV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62473OfV extends FrameLayout {
    public String LJLIL;
    public BaseSharePackage LJLILLLLZI;
    public List<String> LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public HashMap LJLJJLL;

    public final View LIZ(int i) {
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new HashMap();
        }
        View view = (View) this.LJLJJLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJLJJLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        String str2;
        Bundle bundle;
        Bundle bundle2;
        super.onAttachedToWindow();
        BaseSharePackage baseSharePackage = this.LJLILLLLZI;
        if (baseSharePackage == null || (bundle2 = baseSharePackage.extras) == null || (str = bundle2.getString("share_display_tag_id")) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LJLJJL = str;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(C119364mK.LIZ(getContext())), R.layout.bmd, this, true);
        ArrayList arrayList = new ArrayList();
        BaseSharePackage baseSharePackage2 = this.LJLILLLLZI;
        if (baseSharePackage2 == null || (bundle = baseSharePackage2.extras) == null || (str2 = bundle.getString("app_language")) == null) {
            str2 = "en";
        }
        int i = 0;
        for (String str3 : this.LJLJI) {
            int i2 = i % 3;
            if (i2 == 0) {
                arrayList.add(new C62713OjN(this.LJLJJI, str3, this.LJLJJL, this.LJLIL, str2));
            } else if (i2 == 1) {
                arrayList.add(new C62712OjM(this.LJLJJI, str3, this.LJLJJL, this.LJLIL, str2));
            } else {
                arrayList.add(new C62713OjN(this.LJLJJI, str3, this.LJLJJL, this.LJLIL, str2));
            }
            i++;
        }
        arrayList.add(new C62714OjO(this.LJLIL));
        C62285OcT.LIZ();
        C62727Ojb c62727Ojb = new C62727Ojb(arrayList, new C62527OgN(this));
        C0CM vp_share_campaign = (C0CM) LIZ(R.id.neo);
        o.LJIIIIZZ(vp_share_campaign, "vp_share_campaign");
        vp_share_campaign.setOffscreenPageLimit(1);
        View childAt = ((ViewGroup) LIZ(R.id.neo)).getChildAt(0);
        o.LJIIIIZZ(childAt, "vp_share_campaign.getChildAt(0)");
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setClipToPadding(false);
        }
        ((C0CM) LIZ(R.id.neo)).setPageTransformer(new C51628KOa());
        ((C0CM) LIZ(R.id.neo)).LIZIZ(new C62472OfU(this));
        C0CM vp_share_campaign2 = (C0CM) LIZ(R.id.neo);
        o.LJIIIIZZ(vp_share_campaign2, "vp_share_campaign");
        vp_share_campaign2.setAdapter(c62727Ojb);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        View vp_share_campaign3 = LIZ(R.id.neo);
        o.LJIIIIZZ(vp_share_campaign3, "vp_share_campaign");
        C49151JQt.LIZ(context, vp_share_campaign3);
    }

    public final String getCampaignId() {
        return this.LJLJJI;
    }

    public final String getCoverUrl() {
        return this.LJLIL;
    }

    public final BaseSharePackage getSharePackage() {
        return this.LJLILLLLZI;
    }

    public final List<String> getTemplateList() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62473OfV(Context context) {
        super(context, null, 0);
        String str;
        List<String> list;
        o.LJIIIZ(context, "context");
        String str2 = "";
        this.LJLIL = "";
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        this.LJLJI = (LIZ == null || (list = LIZ.operationTemplateList) == null) ? new ArrayList<>() : list;
        SharingOperationConfig LIZ2 = C62285OcT.LIZ();
        if (LIZ2 != null && (str = LIZ2.operationId) != null) {
            str2 = str;
        }
        this.LJLJJI = str2;
        this.LJLJJL = CardStruct.IStatusCode.DEFAULT;
    }

    public final void setCampaignId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJI = str;
    }

    public final void setCoverUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setSharePackage(BaseSharePackage baseSharePackage) {
        this.LJLILLLLZI = baseSharePackage;
    }

    public final void setTemplateList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJI = list;
    }
}
