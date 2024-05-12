package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C16880lQ;
import X.C190407dc;
import X.C190497dl;
import X.C190557dr;
import X.C214298b3;
import X.C45243HpH;
import X.C47704Ins;
import X.C55749LuL;
import X.C57434MgQ;
import X.C57446Mgc;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C78685UuP;
import X.C78926UyI;
import X.C7YW;
import X.C90193gN;
import X.C9BE;
import X.EnumC57119MbL;
import Y.ACListenerS0S4300000_3;
import Y.IDTListenerS113S0100000_3;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.AvatarThumbModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.OwnerInfoModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS71S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailContentHeaderClaimedStoreAssemV3 extends PoiDetailContentHeaderBaseAssemV3 {
    public final C55749LuL LJLJJL;
    public final C214298b3 LJLJJLL;

    public PoiDetailContentHeaderClaimedStoreAssemV3() {
        new LinkedHashMap();
        this.LJLJJL = new C55749LuL(C47704Ins.LJ(this, C190407dc.class, "PoiDetailContentHeaderHierarchyDataV3"), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 709), C190557dr.INSTANCE, null);
    }

    public final C190407dc O3() {
        return (C190407dc) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3
    public final void H3(View view) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        C190497dl c190497dl;
        String str;
        String str2;
        String str3;
        C190497dl c190497dl2;
        int i;
        List<String> urlList;
        String str4;
        C190497dl c190497dl3;
        C190497dl c190497dl4;
        C190497dl c190497dl5;
        String str5;
        String str6;
        String str7;
        C190497dl c190497dl6;
        C190497dl c190497dl7;
        C190497dl c190497dl8;
        o.LJIIIZ(view, "view");
        String str8 = ((PoiDetailInfoViewModel) this.LJLJJLL.getValue()).LJLIL;
        C190407dc O3 = O3();
        if (O3 != null && (poiDetailResponse = O3.LJLILLLLZI) != null && str8 != null && poiDetailResponse != null) {
            I3(poiDetailResponse, str8);
            L3(poiDetailResponse, str8);
            F3(poiDetailResponse);
            if (str8 != null) {
                boolean LIZJ = C45243HpH.LIZJ(view, "view.context");
                C190407dc O32 = O3();
                if (O32 != null && (c190497dl8 = O32.LJLJI) != null) {
                    str5 = c190497dl8.LJLJJI;
                } else {
                    str5 = null;
                }
                C190407dc O33 = O3();
                if (O33 != null && (c190497dl7 = O33.LJLJI) != null) {
                    str6 = c190497dl7.LJLJJL;
                } else {
                    str6 = null;
                }
                C190407dc O34 = O3();
                if (O34 != null && (c190497dl6 = O34.LJLJI) != null) {
                    str7 = c190497dl6.LJLJJLL;
                } else {
                    str7 = null;
                }
                str8 = str8;
                M3(str8, LIZJ, poiDetailResponse, str5, str6, str7);
            }
            C190407dc O35 = O3();
            if (O35 != null) {
                c190497dl = O35.LJLJI;
            } else {
                c190497dl = null;
            }
            C3(str8, poiDetailResponse, c190497dl);
            C190407dc O36 = O3();
            if (O36 != null && (c190497dl5 = O36.LJLJI) != null) {
                str = c190497dl5.LJLJJI;
            } else {
                str = null;
            }
            C190407dc O37 = O3();
            if (O37 != null && (c190497dl4 = O37.LJLJI) != null) {
                str2 = c190497dl4.LJLJJL;
            } else {
                str2 = null;
            }
            C190407dc O38 = O3();
            if (O38 != null && (c190497dl3 = O38.LJLJI) != null) {
                str3 = c190497dl3.LJLJJLL;
            } else {
                str3 = null;
            }
            ViewGroup viewGroup = (ViewGroup) x3().findViewById(R.id.huj);
            OwnerInfoModel ownerInfoModel = poiDetailResponse.ownerInfo;
            int i2 = 8;
            if (ownerInfoModel != null && C78685UuP.LJJJZ(ownerInfoModel.getUniqueId()) && C78685UuP.LJJJZ(ownerInfoModel.getUid()) && ownerInfoModel != null) {
                viewGroup.setVisibility(0);
                TextView textView = (TextView) x3().findViewById(R.id.hun);
                textView.setText(ownerInfoModel.getUniqueId());
                if (C90193gN.LIZIZ(textView.getContext())) {
                    i = 4;
                } else {
                    i = 3;
                }
                textView.setTextDirection(i);
                View findViewById = x3().findViewById(R.id.huo);
                if (ownerInfoModel.getBlueIcon()) {
                    i2 = 0;
                }
                findViewById.setVisibility(i2);
                AvatarThumbModel avatarThumb = ownerInfoModel.getAvatarThumb();
                if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null && (str4 = (String) ListProtector.get(urlList, 0)) != null && C78685UuP.LJJJZ(str4) && str4 != null) {
                    View findViewById2 = x3().findViewById(R.id.hul);
                    o.LJIIIIZZ(findViewById2, "parentView.findViewById<…iew>(R.id.poi_owner_icon)");
                    C71799SFv.LJIIJ((C71799SFv) findViewById2, str4, null, false, null, 110);
                }
                LinearLayout linearLayout = (LinearLayout) x3().findViewById(R.id.hum);
                C16880lQ.LJIIZILJ(linearLayout, new ACListenerS0S4300000_3(ownerInfoModel, this, viewGroup, str8, str, str2, str3, 0));
                linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.2S0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        View findViewById3 = view2.findViewById(R.id.hul);
                        View findViewById4 = view2.findViewById(R.id.hun);
                        View findViewById5 = view2.findViewById(R.id.huo);
                        if (motionEvent.getAction() == 0) {
                            findViewById3.setAlpha(0.2f);
                            findViewById4.setAlpha(0.2f);
                            findViewById5.setAlpha(0.2f);
                            return false;
                        }
                        findViewById3.setAlpha(1.0f);
                        findViewById4.setAlpha(1.0f);
                        findViewById5.setAlpha(1.0f);
                        return false;
                    }
                });
                C57446Mgc c57446Mgc = (C57446Mgc) x3().findViewById(R.id.huk);
                if (poiDetailResponse.followOwnerStatus != null && ownerInfoModel.getUid() != null) {
                    C7YW c7yw = new C7YW();
                    User user = new User();
                    user.setUid(ownerInfoModel.getUid());
                    user.setFollowStatus(o.LJ(poiDetailResponse.followOwnerStatus, Boolean.TRUE) ? 1 : 0);
                    c7yw.LIZ = user;
                    c7yw.LIZIZ(EnumC57119MbL.NORMAL);
                    Context context = c57446Mgc.getContext();
                    o.LJIIIIZZ(context, "context");
                    c7yw.LJFF = C57434MgQ.LIZIZ(context);
                    c7yw.LIZJ = true;
                    c57446Mgc.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
                    c57446Mgc.setTracker(new AqS71S1100000_3(this, str8, 8));
                }
                c57446Mgc.setOnTouchListener(new IDTListenerS113S0100000_3(this, 22));
            } else {
                viewGroup.setVisibility(8);
            }
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            C190407dc O39 = O3();
            if (O39 != null) {
                c190497dl2 = O39.LJLJI;
            } else {
                c190497dl2 = null;
            }
            E3(str8, poiDetailResponse, context2, c190497dl2);
            K3(poiDetailResponse, str8);
        }
    }
}
