package com.ss.android.ugc.aweme.bullet.api;

import X.F3T;
import X.InterfaceC38186Eyk;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface IBulletHostProxy {
    JSONObject LJFF(String str);

    HashMap<Class<?>, HashMap<String, Class<?>>> LJI();

    HashMap<Class<?>, HashMap<String, Class<?>>> LJII();

    HashMap<Class<?>, HashMap<String, Class<?>>> LJIIIIZZ();

    InterfaceC38186Eyk LJIIIZ(F3T f3t, String str);

    List<InterfaceC38186Eyk> LJIIJ(F3T f3t);

    List<InterfaceC38186Eyk> createBridges(F3T f3t);
}
