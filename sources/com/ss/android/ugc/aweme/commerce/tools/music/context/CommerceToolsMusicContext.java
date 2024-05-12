package com.ss.android.ugc.aweme.commerce.tools.music.context;

import X.C42479Gln;
import X.GPV;
import X.H92;
import X.H97;
import X.HJZ;
import X.InterfaceC51059K2d;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceToolsMusicContext implements Serializable, Parcelable, InterfaceC51059K2d {
    public static final Parcelable.Creator<CommerceToolsMusicContext> CREATOR = new C42479Gln();

    @GPV
    public String bannerId;

    @GPV
    public String bannerType;

    @GPV
    public String categoryId;

    @GPV
    public boolean inCommercialSoundPage;

    @GPV
    public boolean inPromoteRecommendCMLScene;

    @GPV
    public boolean inPromoteReplaceMusicScene;

    @GPV
    public Integer musicOrder;

    @GPV
    public Integer playlistOrderInCsp;

    @GPV
    public String playlistSuggestionId;
    public String shootWay;

    @GPV
    public HJZ lastSearchSoundPage = HJZ.NONE;

    @GPV
    public ShootActionOrigin actionOriginatedFrom = ShootActionOrigin.OTHERS;

    @GPV
    public List<H97> currentPageStack = new ArrayList();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public String getBannerId() {
        H92.LJLIL.getClass();
        return (String) H92.LJLJJLL.LIZ(H92.LJLILLLLZI[3]);
    }

    public String getCategoryId() {
        H92.LJLIL.getClass();
        return (String) H92.LJLJLLL.LIZ(H92.LJLILLLLZI[6]);
    }

    public List<H97> getCurrentPageStack() {
        H92.LJLIL.getClass();
        return H92.LJLLILLLL;
    }

    @Override // X.InterfaceC51059K2d
    public boolean getInCommercialSoundPage() {
        return H92.LJLIL.getInCommercialSoundPage();
    }

    public boolean getInPromoteRecommendCMLScene() {
        H92.LJLIL.getClass();
        return ((Boolean) H92.LJLLL.LIZ(H92.LJLILLLLZI[10])).booleanValue();
    }

    @Override // X.InterfaceC51059K2d
    public HJZ getLastSearchSoundPage() {
        return H92.LJLIL.getLastSearchSoundPage();
    }

    public Integer getMusicOrder() {
        H92.LJLIL.getClass();
        return (Integer) H92.LJLL.LIZ(H92.LJLILLLLZI[7]);
    }

    public Integer getPlaylistOrderInCsp() {
        H92.LJLIL.getClass();
        return (Integer) H92.LJLLI.LIZ(H92.LJLILLLLZI[8]);
    }

    public String getPlaylistSuggestionId() {
        H92.LJLIL.getClass();
        return (String) H92.LJLJLJ.LIZ(H92.LJLILLLLZI[5]);
    }

    public String getShootWay() {
        H92.LJLIL.getClass();
        return (String) H92.LJLLLL.LIZ(H92.LJLILLLLZI[11]);
    }

    public ShootActionOrigin getActionOriginatedFrom() {
        return H92.LIZ();
    }

    public String getBannerType() {
        return H92.LIZIZ();
    }

    public boolean getInPromoteReplaceMusicScene() {
        return H92.LJ();
    }

    public void setActionOriginatedFrom(ShootActionOrigin value) {
        o.LJIIIZ(value, "value");
        H92.LJLIL.getClass();
        H92.LJLJJL.LIZIZ(H92.LJLILLLLZI[2], value);
        this.actionOriginatedFrom = value;
    }

    public void setBannerId(String str) {
        H92.LJLIL.getClass();
        H92.LJLJJLL.LIZIZ(H92.LJLILLLLZI[3], str);
        this.bannerId = str;
    }

    public void setBannerType(String str) {
        H92.LJLIL.getClass();
        H92.LJLJL.LIZIZ(H92.LJLILLLLZI[4], str);
        this.bannerType = str;
    }

    public void setCategoryId(String str) {
        H92.LJFF(getCategoryId());
        this.categoryId = str;
    }

    public void setCurrentPageStack(List<H97> value) {
        o.LJIIIZ(value, "value");
        H92.LJLIL.getClass();
        this.currentPageStack = value;
    }

    @Override // X.InterfaceC51059K2d
    public void setInCommercialSoundPage(boolean z) {
        H92.LJLIL.setInCommercialSoundPage(z);
        this.inCommercialSoundPage = z;
    }

    public void setInPromoteRecommendCMLScene(boolean z) {
        H92.LJLIL.getClass();
        H92.LJLLL.LIZIZ(H92.LJLILLLLZI[10], Boolean.valueOf(z));
        this.inPromoteRecommendCMLScene = z;
    }

    public void setInPromoteReplaceMusicScene(boolean z) {
        H92.LJLIL.getClass();
        H92.LJLLJ.LIZIZ(H92.LJLILLLLZI[9], Boolean.valueOf(z));
        this.inPromoteReplaceMusicScene = z;
    }

    @Override // X.InterfaceC51059K2d
    public void setLastSearchSoundPage(HJZ value) {
        o.LJIIIZ(value, "value");
        H92.LJLIL.setLastSearchSoundPage(value);
        this.lastSearchSoundPage = value;
    }

    public void setMusicOrder(Integer num) {
        H92.LJI(num);
        this.musicOrder = num;
    }

    public void setPlaylistOrderInCsp(Integer num) {
        H92.LJLIL.getClass();
        H92.LJLLI.LIZ(H92.LJLILLLLZI[8]);
        this.playlistOrderInCsp = num;
    }

    public void setPlaylistSuggestionId(String str) {
        H92.LJII(str);
        this.playlistSuggestionId = str;
    }

    public void setShootWay(String str) {
        H92.LJLIL.getClass();
        H92.LJLLLL.LIZIZ(H92.LJLILLLLZI[11], str);
        this.shootWay = str;
    }
}
