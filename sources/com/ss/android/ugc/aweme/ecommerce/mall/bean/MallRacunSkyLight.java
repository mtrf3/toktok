package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MallRacunSkyLight {

    @InterfaceC65349Pkn("feed_list")
    public final List<MallSkyLightFeed> feedList;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallRacunSkyLight copy$default(MallRacunSkyLight mallRacunSkyLight, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mallRacunSkyLight.title;
        }
        if ((i & 2) != 0) {
            list = mallRacunSkyLight.feedList;
        }
        return mallRacunSkyLight.copy(str, list);
    }

    public final MallRacunSkyLight copy(String str, List<MallSkyLightFeed> list) {
        return new MallRacunSkyLight(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallRacunSkyLight)) {
            return false;
        }
        MallRacunSkyLight mallRacunSkyLight = (MallRacunSkyLight) obj;
        return o.LJ(this.title, mallRacunSkyLight.title) && o.LJ(this.feedList, mallRacunSkyLight.feedList);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MallSkyLightFeed> list = this.feedList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallRacunSkyLight(title=");
        LIZ.append(this.title);
        LIZ.append(", feedList=");
        return C1NE.LIZIZ(LIZ, this.feedList, ')', LIZ);
    }

    public final List<MallSkyLightFeed> getFeedList() {
        return this.feedList;
    }

    public final String getTitle() {
        return this.title;
    }

    public MallRacunSkyLight(String str, List<MallSkyLightFeed> list) {
        this.title = str;
        this.feedList = list;
    }
}
