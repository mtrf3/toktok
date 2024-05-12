package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.X8h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84343X8h {
    public static final ArrayList<X8X> LIZ;

    static {
        ArrayList<X8X> arrayList = new ArrayList<>();
        LIZ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("com.ss.android.ugc.aweme.mix.api.MixDetailNetPreload");
        arrayList2.add("com.ss.android.ugc.aweme.mix.api.MixListNetPreload");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("aweme://mix/detail");
        arrayList3.add("//mix/detail");
        arrayList.add(new X8X(arrayList2, arrayList3, "com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload");
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("//music/detail");
        arrayList5.add("aweme://music/detail/");
        arrayList.add(new X8X(arrayList4, arrayList5, "com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", null));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add("com.ss.android.ugc.tiktok.addyours.hub.AddYoursHubPreload");
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add("//add_yours/hub");
        arrayList.add(new X8X(arrayList6, arrayList7, "", "com.ss.android.ugc.tiktok.addyours.hub.AddYoursHubFragment"));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add("com.ss.android.ugc.aweme.challenge.api.ChallengeNetPreload");
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add("//challenge/detail");
        arrayList9.add("//aweme/challenge/detail");
        arrayList.add(new X8X(arrayList8, arrayList9, "com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", null));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add("com.ss.android.ugc.aweme.paidcontent.preload.PaidContentCollectionPreload");
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add("aweme://paidcontent/collections");
        arrayList11.add("aweme://paidcontent/anchor_collections_selection");
        arrayList.add(new X8X(arrayList10, arrayList11, "", "com.ss.android.ugc.aweme.paidcontent.activity.PaidContentCollectionFragment"));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add("com.ss.android.ugc.aweme.paidcontent.preload.PaidContentCollectionPreload");
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add("aweme://paidcontent/promote");
        arrayList.add(new X8X(arrayList12, arrayList13, "", "com.ss.android.ugc.aweme.paidcontent.activity.PaidContentPromoteFragment"));
        ArrayList arrayList14 = new ArrayList();
        arrayList14.add("com.ss.android.ugc.aweme.paidcontent.preload.PaidContentCollectionDetailPreload");
        ArrayList arrayList15 = new ArrayList();
        arrayList15.add("aweme://paidcontent/collections/detail");
        arrayList.add(new X8X(arrayList14, arrayList15, "", "com.ss.android.ugc.aweme.paidcontent.activity.PaidContentCollectionDetailFragment"));
    }

    public static X8X LIZ(String str) {
        android.net.Uri parse = UriProtector.parse(str);
        String LJIILLIIL = o.LJIILLIIL(parse.getPath(), parse.getAuthority());
        Iterator<X8X> it = LIZ.iterator();
        while (it.hasNext()) {
            X8X next = it.next();
            Iterator<String> it2 = next.LJLJJL.iterator();
            while (it2.hasNext()) {
                android.net.Uri parse2 = UriProtector.parse(it2.next());
                if (o.LJ(LJIILLIIL, o.LJIILLIIL(parse2.getPath(), parse2.getAuthority()))) {
                    List<String> preLoads = next.LJLJJI;
                    List<String> uriList = next.LJLJJL;
                    String str2 = next.LJLJJLL;
                    String str3 = next.LJLJL;
                    o.LJIIJ(preLoads, "preLoads");
                    o.LJIIJ(uriList, "uriList");
                    return new X8X(preLoads, uriList, str2, str3);
                }
            }
        }
        return null;
    }
}
