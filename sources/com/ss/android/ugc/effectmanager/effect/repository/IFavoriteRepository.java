package com.ss.android.ugc.effectmanager.effect.repository;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import java.util.List;

/* loaded from: classes16.dex */
public interface IFavoriteRepository {
    String fetchFavoriteList(String str, IFetchFavoriteList iFetchFavoriteList);

    String modFavoriteList(String str, String str2, boolean z, IModFavoriteList iModFavoriteList);

    String modFavoriteList(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList);
}
