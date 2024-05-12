package com.ss.android.ugc.aweme.story.feed.common.newarch;

import X.C222588oQ;
import X.C8RL;
import X.InterfaceC212878Xb;
import X.InterfaceC212998Xn;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseStoryCell<R extends InterfaceC212998Xn<R, ITEM>, ITEM extends C8RL> extends BaseStoryViewHolder<R, ITEM> {
    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2L4
    public List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStoryCell(C222588oQ producerParams, InterfaceC212878Xb<R, ITEM> interfaceC212878Xb) {
        super(producerParams, interfaceC212878Xb);
        o.LJIIIZ(producerParams, "producerParams");
    }
}
