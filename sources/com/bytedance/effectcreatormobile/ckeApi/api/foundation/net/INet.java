package com.bytedance.effectcreatormobile.ckeapi.api.foundation.net;

import X.C93424aQe;
import X.C93426aQg;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;
import java.util.Map;

/* loaded from: classes34.dex */
public interface INet extends IService {
    C93426aQg doGet(String str, boolean z, int i, Map<String, String> map, List<C93424aQe> list);

    C93426aQg doPost(String str, boolean z, int i, Map<String, String> map, Map<String, ? extends Object> map2, List<C93424aQe> list);
}
