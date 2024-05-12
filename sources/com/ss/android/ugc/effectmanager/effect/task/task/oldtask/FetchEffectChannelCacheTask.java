package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import X.C16880lQ;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectChannelTaskResult;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class FetchEffectChannelCacheTask extends NormalTask {
    public ICache mCache;
    public EffectContext mEffectContext;
    public IJsonConverter mJsonConverter;
    public String panel;
    public boolean whileDownload;

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectChannelModel effectChannelModel;
        InputStream queryToStream = this.mCache.queryToStream(EffectCacheKeyGenerator.generatePanelKey(this.mEffectContext.getEffectConfiguration().getChannel(), this.panel));
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse();
        effectChannelResponse.setPanel(this.panel);
        if (queryToStream == null) {
            sendMessage(14, new EffectChannelTaskResult(effectChannelResponse, new ExceptionResult(10004)));
            return;
        }
        try {
            effectChannelModel = (EffectChannelModel) this.mJsonConverter.convertJsonToObj(queryToStream, EffectChannelModel.class);
        } catch (Exception e) {
            EPLog.e("FetchEffectChannelCacheTask", Log.getStackTraceString(e));
        }
        if (effectChannelModel != null) {
            if (!effectChannelModel.checkValued()) {
                sendMessage(14, new EffectChannelTaskResult(effectChannelResponse, new ExceptionResult(10004)));
            } else {
                sendMessage(14, new EffectChannelTaskResult(new BuildEffectChannelResponse(this.panel, this.mEffectContext.getEffectConfiguration().getEffectDir().getAbsolutePath(), true).buildChannelResponse(effectChannelModel), null));
            }
            CloseUtil.close(queryToStream);
        }
        sendMessage(14, new EffectChannelTaskResult(effectChannelResponse, new ExceptionResult(10004)));
        CloseUtil.close(queryToStream);
    }

    private EffectChannelResponse buildChannelResponse(EffectChannelModel effectChannelModel) {
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse();
        effectChannelResponse.setVersion(effectChannelModel.getVersion());
        effectChannelResponse.setAllCategoryEffects(effectChannelModel.getEffects());
        ArrayList arrayList = new ArrayList();
        effectChannelResponse.setCollections(effectChannelModel.getCollection());
        for (EffectCategoryModel effectCategoryModel : effectChannelModel.getCategory()) {
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
            effectCategoryModel.checkValued();
            effectCategoryResponse.setName(effectCategoryModel.getName());
            effectCategoryResponse.setId(effectCategoryModel.getId());
            if (!effectCategoryModel.getIcon().getUrl_list().isEmpty()) {
                effectCategoryResponse.setIcon_normal_url((String) ListProtector.get(effectCategoryModel.getIcon().getUrl_list(), 0));
            }
            if (!effectCategoryModel.getIcon_selected().getUrl_list().isEmpty()) {
                effectCategoryResponse.setIcon_selected_url((String) ListProtector.get(effectCategoryModel.getIcon_selected().getUrl_list(), 0));
            }
            effectCategoryResponse.setTotalEffects(getCategoryAllEffects(effectCategoryModel, effectChannelModel));
            effectCategoryResponse.setTagsUpdateTime(effectCategoryModel.getTagsUpdateTime());
            effectCategoryResponse.setTags(effectCategoryModel.getTags());
            effectCategoryResponse.setKey(effectCategoryModel.getKey());
            arrayList.add(effectCategoryResponse);
        }
        effectChannelResponse.setCategoryResponseList(arrayList);
        effectChannelResponse.setPanel(this.panel);
        effectChannelResponse.setPanelModel(effectChannelModel.getPanel());
        if (this.whileDownload) {
            downloadEffect(effectChannelModel.getEffects());
        }
        return effectChannelResponse;
    }

    private void downloadEffect(List<Effect> list) {
        for (Effect effect : list) {
            if (!this.mCache.has(effect.getId())) {
                try {
                    EffectUtils.downloadEffect(this.mEffectContext.getEffectConfiguration(), effect);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    private List<Effect> getCategoryAllEffects(EffectCategoryModel effectCategoryModel, EffectChannelModel effectChannelModel) {
        ArrayList arrayList = new ArrayList();
        for (String str : effectCategoryModel.getEffects()) {
            for (Effect effect : effectChannelModel.getEffects()) {
                if (TextUtils.equals(str, effect.getEffectId())) {
                    arrayList.add(effect);
                }
            }
        }
        return arrayList;
    }

    public FetchEffectChannelCacheTask(EffectContext effectContext, String str, String str2, Handler handler, boolean z) {
        super(handler, str2);
        this.panel = str;
        this.whileDownload = z;
        this.mEffectContext = effectContext;
        this.mCache = effectContext.getEffectConfiguration().getCache();
        this.mJsonConverter = this.mEffectContext.getEffectConfiguration().getJsonConverter();
    }
}
