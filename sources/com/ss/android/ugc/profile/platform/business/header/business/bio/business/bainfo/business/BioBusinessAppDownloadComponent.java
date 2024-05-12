package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business;

import X.C17J;
import X.C188727au;
import X.C237559Tz;
import X.C44384HbQ;
import X.C75792yF;
import X.C76W;
import X.C9IL;
import X.FMX;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioDownloadData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BioBusinessAppDownloadComponent extends BioBusinessBaseUIComponent {
    public boolean LJLJJI;
    public BioDownloadData LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String C3() {
        String lowerCase = "HAS_DOWNLOAD_APP".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (X.NP8.LJ(r0, r4) == false) goto L13;
     */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void componentClick() {
        /*
            r10 = this;
            com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioDownloadData r0 = r10.LJLJJL
            java.lang.String r3 = ""
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.getAndroidDownloadAppLink()
            if (r0 != 0) goto Ld
        Lc:
            r0 = r3
        Ld:
            android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            X.UCH r0 = X.C73340SqO.LJJII()
            r0.getClass()
            boolean r0 = X.NP8.LIZIZ(r4)
            r2 = 0
            if (r0 == 0) goto L41
            X.UCH r1 = X.C73340SqO.LJJII()
            android.content.Context r0 = r10.getContext()
            r1.getClass()
            boolean r0 = X.NP8.LIZ(r0)
            if (r0 == 0) goto L41
            X.UCH r1 = X.C73340SqO.LJJII()
            android.content.Context r0 = r10.getContext()
            r1.getClass()
            boolean r0 = X.NP8.LJ(r0, r4)
            if (r0 != 0) goto L68
        L41:
            r10.LJLJJI = r2
            android.content.Context r1 = r10.getContext()
            java.lang.String r0 = "aweme://webview/"
            com.bytedance.router.SmartRoute r5 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            X.9L3 r0 = new X.9L3
            r0.<init>()
            r5.withCallback(r0)
            com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioDownloadData r0 = r10.LJLJJL
            if (r0 == 0) goto L5f
            java.lang.String r4 = r0.getAndroidDownloadAppLink()
            if (r4 != 0) goto L60
        L5f:
            r4 = r3
        L60:
            java.lang.String r2 = "url"
            java.lang.String r1 = "use_webview_title"
            r0 = 1
            X.C0NY.LIZJ(r5, r2, r4, r1, r0)
        L68:
            java.lang.String r0 = r10.getEnterFrom()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 != 0) goto La4
            X.9Tz r4 = new X.9Tz
            r4.<init>()
            com.ss.android.ugc.aweme.profile.model.User r5 = r10.getUser()
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r10.x3()
            if (r0 == 0) goto Le2
            X.33Q r0 = r0.getState()
            X.9PM r0 = (X.C9PM) r0
            if (r0 == 0) goto Le2
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.LJLJLLL
        L8c:
            java.lang.String r7 = r10.getEnterFrom()
            boolean r0 = r10.LJLJJI
            if (r0 == 0) goto Ldf
            java.lang.String r8 = "1"
        L96:
            com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioDownloadData r0 = r10.LJLJJL
            if (r0 == 0) goto La0
            java.lang.String r9 = r0.getAndroidDownloadAppLink()
            if (r9 != 0) goto La1
        La0:
            r9 = r3
        La1:
            r4.LJIILL(r5, r6, r7, r8, r9)
        La4:
            boolean r1 = r10.L7()
            java.lang.String r0 = "download_app"
            X.C17J.LJJJ(r10, r1, r0)
            X.Lm3 r1 = X.C55096Ljo.LJIIZILJ(r10)
            java.lang.Class<com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility> r0 = com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility.class
            X.2K0 r2 = X.C55096Ljo.LIZ(r1, r0, r2)
            com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility r2 = (com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility) r2
            if (r2 == 0) goto Ldc
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r1 = r10.getCommonInfo()
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r0 = r10.x3()
            if (r0 == 0) goto Ld7
            X.33Q r0 = r0.getState()
            X.9PM r0 = (X.C9PM) r0
            if (r0 == 0) goto Ld7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLJLLL
            if (r0 == 0) goto Ld7
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto Ldd
        Ld7:
            java.lang.String r0 = "download_link"
            r2.vg(r1, r0, r3)
        Ldc:
            return
        Ldd:
            r3 = r0
            goto Ld7
        Ldf:
            java.lang.String r8 = "0"
            goto L96
        Le2:
            r6 = r2
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business.BioBusinessAppDownloadComponent.componentClick():void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer E3() {
        return Integer.valueOf(R.raw.icon_arrow_down_to_line);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String F3() {
        return C44384HbQ.LJJZ(R.string.kg);
    }

    public final User getUser() {
        ProfilePlatformViewModel x3 = x3();
        if (x3 != null) {
            return x3.hv0();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        BizAccountInfo bizAccountInfo;
        String str2;
        super.updateComponentUIAndData();
        boolean L7 = L7();
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_DOWNLOAD_APP".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, true);
        new C237559Tz().LJJIII(getUser(), getEnterFrom());
        User user = getUser();
        String str3 = null;
        if (user != null && (bizAccountInfo = user.getBizAccountInfo()) != null) {
            BioDownloadData bioDownloadData = this.LJLJJL;
            if (bioDownloadData != null) {
                str2 = bioDownloadData.getAndroidDownloadAppLink();
            } else {
                str2 = null;
            }
            bizAccountInfo.setAndroidDownloadAppLink(str2);
        }
        getContext();
        String enterFrom = getEnterFrom();
        User user2 = getUser();
        if (user2 != null) {
            str = user2.getUid();
        } else {
            str = null;
        }
        C76W c76w = new C76W();
        c76w.LIZ("link_type", "download_link");
        FMX.LJIIJ("show_link", enterFrom, str, CardStruct.IStatusCode.DEFAULT, c76w.LIZIZ());
        C188727au c188727au = new C188727au();
        User user3 = getUser();
        if (user3 != null) {
            str3 = user3.getUid();
        }
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        c188727au.LJIIIZ("link_type", "download_link");
        FMX.LJIIL("show_link", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        super.parseComponentBizData(jsonObject);
        this.LJLJJL = (BioDownloadData) C75792yF.LIZ(jsonObject.toString(), BioDownloadData.class);
    }
}
