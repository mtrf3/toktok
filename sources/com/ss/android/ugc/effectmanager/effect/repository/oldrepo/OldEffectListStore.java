package com.ss.android.ugc.effectmanager.effect.repository.oldrepo;

import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

/* loaded from: classes16.dex */
public class OldEffectListStore {
    public EffectConfiguration mConfiguration;
    public EffectChannelResponse mEffectChannels;

    public EffectChannelResponse getCurrentEffectChannel() {
        EffectChannelResponse effectChannelResponse = this.mEffectChannels;
        if (effectChannelResponse == null) {
            return new EffectChannelResponse();
        }
        return effectChannelResponse;
    }

    public OldEffectListStore(EffectConfiguration effectConfiguration) {
        this.mConfiguration = effectConfiguration;
    }

    public void updateEffectListDownloadStatus(String str, List<Effect> list, ExceptionResult exceptionResult) {
        IFetchEffectListListener fetchEffectLisListener = this.mConfiguration.getListenerManger().getFetchEffectLisListener(str);
        if (fetchEffectLisListener != null) {
            if (exceptionResult == null) {
                fetchEffectLisListener.onSuccess(list);
            } else {
                fetchEffectLisListener.onFail(exceptionResult);
            }
            this.mConfiguration.getListenerManger().removeFetchEffectLisListener(str);
        }
    }

    public void updateEffectChannel(String str, EffectChannelResponse effectChannelResponse, int i, ExceptionResult exceptionResult) {
        IFetchEffectChannelListener fetchEffectChannelListener;
        if (i != 23) {
            if (i != 27 || (fetchEffectChannelListener = this.mConfiguration.getListenerManger().getFetchEffectChannelListener(str)) == null) {
                return;
            }
            fetchEffectChannelListener.onFail(exceptionResult);
            this.mConfiguration.getListenerManger().removeFetchEffectChannelListener(str);
            return;
        }
        this.mEffectChannels = effectChannelResponse;
        IFetchEffectChannelListener fetchEffectChannelListener2 = this.mConfiguration.getListenerManger().getFetchEffectChannelListener(str);
        if (fetchEffectChannelListener2 == null) {
            return;
        }
        fetchEffectChannelListener2.onSuccess(effectChannelResponse);
        this.mConfiguration.getListenerManger().removeFetchEffectChannelListener(str);
    }

    public void updateEffectDownloadStatus(String str, Effect effect, int i, ExceptionResult exceptionResult) {
        IFetchEffectListener fetchEffectListener;
        if (i != 20) {
            if (i != 26 || (fetchEffectListener = this.mConfiguration.getListenerManger().getFetchEffectListener(str)) == null) {
                return;
            }
            fetchEffectListener.onFail(effect, exceptionResult);
            this.mConfiguration.getListenerManger().removeFetchEffectListener(str);
            return;
        }
        IFetchEffectListener fetchEffectListener2 = this.mConfiguration.getListenerManger().getFetchEffectListener(str);
        if (fetchEffectListener2 == null) {
            return;
        }
        fetchEffectListener2.onSuccess(effect);
        this.mConfiguration.getListenerManger().removeFetchEffectListener(str);
    }
}
