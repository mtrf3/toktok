package com.bytedance.android.livesdk.module;

import X.ActivityC45651qj;
import X.C29261Be5;
import X.C30941CCj;
import X.C31934Cg6;
import X.CN1;
import X.CNF;
import X.CNI;
import X.COQ;
import X.UOS;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.live.browser.IContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.container.config.base.PageConfig;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.ui.PageContainerFragment;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ContainerService implements IContainerService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.browser.IContainerService
    public final C31934Cg6 PR() {
        return C31934Cg6.LIZIZ;
    }

    @Override // com.bytedance.android.live.browser.IContainerService
    public final COQ b90() {
        return COQ.LIZIZ;
    }

    @Override // com.bytedance.android.live.browser.IContainerService
    public final PageContainerFragment Se(Uri uri) {
        o.LJIIIZ(uri, "uri");
        PageConfig pageConfig = new PageConfig(uri);
        PageContainerFragment pageContainerFragment = new PageContainerFragment();
        C29261Be5.LIZ(pageConfig.getUrl());
        Bundle bundle = new Bundle();
        bundle.putSerializable("argument_key_config", pageConfig);
        pageContainerFragment.setArguments(bundle);
        return pageContainerFragment;
    }

    @Override // com.bytedance.android.live.browser.IContainerService
    public final boolean t00(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        if (!CNI.LJ.contains(host) && ((!CNI.LIZLLL.contains(host) || !o.LJ("1", UriProtector.getQueryParameter(uri, "use_new_container"))) && !CNI.LJFF.contains(host))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.browser.IContainerService
    public final boolean CM(Context context, Uri uri) {
        Uri uri2;
        UOS uos;
        UOS uos2;
        Context context2 = context;
        if (uri == null) {
            return false;
        }
        if (CNI.LIZJ.contains(uri.getHost())) {
            uri2 = uri.buildUpon().appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis())).build();
        } else {
            uri2 = uri;
        }
        String host = uri2.getHost();
        if (CNI.LIZLLL.contains(host)) {
            ((IHostAction) CN1.LIZ(IHostAction.class)).openLiveNewHybrid(uri2, context2, new Bundle());
        } else if (CNI.LJ.contains(host)) {
            PopupContainerFragment LIZ = C30941CCj.LIZ(new PopupConfig(uri2));
            if (context2 != null) {
                if (!(context2 instanceof Activity)) {
                    context2 = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
                }
                ActivityC45651qj LJIILL = g0.LJIILL(context2);
                if (LJIILL != null) {
                    BaseDialogFragment.wl(LJIILL, LIZ);
                }
            }
        } else {
            if (!CNI.LJFF.contains(host)) {
                return false;
            }
            String queryParameter = UriProtector.getQueryParameter(uri, "action");
            if (queryParameter == null) {
                queryParameter = CNF.ADD.getValue();
            }
            Uri uri3 = null;
            String str = "";
            if (o.LJ(queryParameter, CNF.ADD.getValue())) {
                IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
                String queryParameter2 = UriProtector.getQueryParameter(uri, "name");
                if (queryParameter2 != null) {
                    str = queryParameter2;
                }
                boolean parseBoolean = Boolean.parseBoolean(UriProtector.getQueryParameter(uri, "view_sync"));
                String queryParameter3 = UriProtector.getQueryParameter(uri, "preview_url");
                if (queryParameter3 != null) {
                    uri3 = UriProtector.parse(queryParameter3);
                }
                iShortTouchService.HK(context2, uri, str, parseBoolean, uri3, Boolean.valueOf(Boolean.parseBoolean(UriProtector.getQueryParameter(uri, "preview_sync"))));
            } else if (o.LJ(queryParameter, CNF.REMOVE.getValue())) {
                if (UriProtector.getQueryParameter(uri, "id") != null) {
                    uos2 = UOS.ID;
                } else {
                    uos2 = UOS.NAME;
                }
                String queryParameter4 = UriProtector.getQueryParameter(uri, uos2.getValue());
                if (queryParameter4 != null) {
                    ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(uos2, queryParameter4);
                }
            } else if (o.LJ(queryParameter, CNF.REFRESH.getValue())) {
                if (UriProtector.getQueryParameter(uri, "id") != null) {
                    uos = UOS.ID;
                } else {
                    uos = UOS.NAME;
                }
                String queryParameter5 = UriProtector.getQueryParameter(uri, uos.getValue());
                if (queryParameter5 != null) {
                    IShortTouchService iShortTouchService2 = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
                    String queryParameter6 = UriProtector.getQueryParameter(uri, "name");
                    if (queryParameter6 != null) {
                        str = queryParameter6;
                    }
                    boolean parseBoolean2 = Boolean.parseBoolean(UriProtector.getQueryParameter(uri, "view_sync"));
                    String queryParameter7 = UriProtector.getQueryParameter(uri, "preview_url");
                    if (queryParameter7 != null) {
                        uri3 = UriProtector.parse(queryParameter7);
                    }
                    iShortTouchService2.vn0(context2, uos, queryParameter5, uri, str, parseBoolean2, uri3, Boolean.valueOf(Boolean.parseBoolean(UriProtector.getQueryParameter(uri, "preview_sync"))));
                }
            }
        }
        return true;
    }
}
