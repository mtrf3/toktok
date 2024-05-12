package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.chatroom.banner.panel.BannerPanelFragment;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes6.dex */
public final class CA9<T> implements InterfaceC64592gB {
    public final /* synthetic */ NewTopRightBannerWidget LJLIL;
    public final /* synthetic */ List<BannerInRoom> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public CA9(NewTopRightBannerWidget newTopRightBannerWidget, List<? extends BannerInRoom> list) {
        this.LJLIL = newTopRightBannerWidget;
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ArrayList<? extends Parcelable> arrayList;
        String str;
        String name;
        C2R1 c2r1 = (C2R1) obj;
        NewTopRightBannerWidget newTopRightBannerWidget = this.LJLIL;
        List<BannerPanelItem> list = c2r1.LIZ;
        List<BannerInRoom> list2 = this.LJLILLLLZI;
        String str2 = c2r1.LIZIZ;
        newTopRightBannerWidget.getClass();
        Iterator<BannerPanelItem> it = list.iterator();
        while (true) {
            arrayList = null;
            BannerInRoom bannerInRoom = null;
            if (!it.hasNext()) {
                break;
            }
            BannerPanelItem next = it.next();
            Iterator<BannerInRoom> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BannerInRoom next2 = it2.next();
                if (o.LJ(String.valueOf(next2.id), next.bannerId)) {
                    bannerInRoom = next2;
                    break;
                }
            }
            BannerInRoom bannerInRoom2 = bannerInRoom;
            if (bannerInRoom2 != null) {
                String LJIIJJI = C77413UZt.LJIIJJI(bannerInRoom2);
                next.getClass();
                o.LJIIIZ(LJIIJJI, "<set-?>");
                next.activityId = LJIIJJI;
                Long l = bannerInRoom2.businessType;
                if (l != null && l.longValue() != 0) {
                    if (l.longValue() == 1) {
                        str = "campaign_static";
                    } else if (l.longValue() == 3) {
                        str = "task";
                    } else if (l.longValue() == 4) {
                        str = "live_house_channel";
                    } else if (l.longValue() == 5) {
                        str = "custom_dynamic";
                    } else if (l.longValue() == 6) {
                        str = "multi_guest";
                    } else if (l.longValue() == 2) {
                        try {
                            name = new JSONObject(bannerInRoom2.dynamicBanner.jsonResource).optString("name");
                            o.LJIIIIZZ(name, "name");
                        } catch (Exception unused) {
                        }
                        if (s.LJJJLZIJ(name, "host_academy_task", false)) {
                            str = "host_academy";
                        } else {
                            if (s.LJJJLZIJ(name, "creator_onboard_task", false)) {
                                str = "creator_onboard";
                            }
                            str = "campaign_dynamic";
                        }
                    }
                    next.bannerType = str;
                }
                str = "default";
                next.bannerType = str;
            }
        }
        if (list.size() == 1) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(newTopRightBannerWidget.context, ((BannerPanelItem) ListProtector.get(list, 0)).schema);
            return;
        }
        Context context = newTopRightBannerWidget.context;
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        boolean z = newTopRightBannerWidget.LJLJI;
        FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(1);
        sheetOptions.draggable = false;
        Bundle bundle = new Bundle();
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        }
        bundle.putParcelableArrayList("banner_list", arrayList);
        bundle.putString("focus_banner_id", str2);
        bundle.putBoolean("is_anchor", z);
        C32044Chs.LJIIIZ(supportFragmentManager, BannerPanelFragment.class, "BannerPanelFragment", sheetOptions, bundle);
    }
}
