package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Skin extends F9E {

    @InterfaceC65349Pkn("account")
    public SkinHostAccount account;

    @InterfaceC65349Pkn("drawer_entrance")
    public SkinDrawerEntrance drawerEntrance;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    /* JADX WARN: Multi-variable type inference failed */
    public Skin() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Skin copy$default(Skin skin, SkinHostAccount skinHostAccount, SkinDrawerEntrance skinDrawerEntrance, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            skinHostAccount = skin.account;
        }
        if ((i & 2) != 0) {
            skinDrawerEntrance = skin.drawerEntrance;
        }
        if ((i & 4) != 0) {
            str = skin.scene;
        }
        return skin.copy(skinHostAccount, skinDrawerEntrance, str);
    }

    public final SkinHostAccount component1() {
        return this.account;
    }

    public final SkinDrawerEntrance component2() {
        return this.drawerEntrance;
    }

    public final String component3() {
        return this.scene;
    }

    public final Skin copy(SkinHostAccount skinHostAccount, SkinDrawerEntrance skinDrawerEntrance, String scene) {
        o.LJIIIZ(scene, "scene");
        return new Skin(skinHostAccount, skinDrawerEntrance, scene);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.account, this.drawerEntrance, this.scene};
    }

    public Skin(SkinHostAccount skinHostAccount, SkinDrawerEntrance skinDrawerEntrance, String scene) {
        o.LJIIIZ(scene, "scene");
        this.account = skinHostAccount;
        this.drawerEntrance = skinDrawerEntrance;
        this.scene = scene;
    }

    public /* synthetic */ Skin(SkinHostAccount skinHostAccount, SkinDrawerEntrance skinDrawerEntrance, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : skinHostAccount, (i & 2) != 0 ? null : skinDrawerEntrance, (i & 4) != 0 ? "" : str);
    }
}
