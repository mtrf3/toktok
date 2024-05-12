package com.bytedance.effectcreatormobile.ckeapi.api.behaviour;

import X.AbstractC94370afu;
import X.AbstractC94512aiC;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;

/* loaded from: classes34.dex */
public interface IBehaviourEditor extends IService {
    void addInvisibleGroup(List<? extends AbstractC94512aiC> list);

    AbstractC94370afu createAndInsertCommand(String str);

    AbstractC94370afu findCommandById(long j);

    AbstractC94512aiC findObjectById(long j);

    List<AbstractC94370afu> getCommandList();

    List<AbstractC94512aiC> getObjectList();

    void removeCommand(int i);
}
