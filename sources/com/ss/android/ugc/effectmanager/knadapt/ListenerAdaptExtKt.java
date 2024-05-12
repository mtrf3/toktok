package com.ss.android.ugc.effectmanager.knadapt;

import X.C32I;
import X.C62850Ola;
import X.C76800UCe;
import X.C84418XBe;
import X.C84448XCi;
import X.InterfaceC84449XCj;
import X.InterfaceC84461XCv;
import X.InterfaceC88472Yns;
import X.XCP;
import X.XCX;
import X.XD4;
import X.XDR;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.EffectExtra;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListenerExt;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.INothingListener;
import com.ss.android.ugc.effectmanager.effect.listener.IQueryCustomizedEffectsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ListenerAdaptExtKt {
    public static final void preProcess(List<? extends Effect> preProcess) {
        o.LJIIJ(preProcess, "$this$preProcess");
        for (Effect effect : preProcess) {
            effect.getRequirements();
            effect.getModel_names();
        }
    }

    public static final XCP toKNListener(final IFetchEffectListener iFetchEffectListener) {
        if (iFetchEffectListener != null) {
            final ListenerAdaptExtKt$toKNListener$defaultImpl$1 listenerAdaptExtKt$toKNListener$defaultImpl$1 = new ListenerAdaptExtKt$toKNListener$defaultImpl$1(iFetchEffectListener);
            if (iFetchEffectListener instanceof IFetchEffectListenerExt) {
                return new InterfaceC84449XCj() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$1
                    public Effect oldEffect;

                    @Override // X.XDR
                    public void preProcess(com.ss.ugc.effectplatform.model.Effect effect) {
                    }

                    @Override // X.XCP
                    public void onStart(com.ss.ugc.effectplatform.model.Effect effect) {
                        ListenerAdaptExtKt$toKNListener$defaultImpl$1.this.onStart(effect);
                    }

                    @Override // X.XDR
                    public void onSuccess(com.ss.ugc.effectplatform.model.Effect effect) {
                        ListenerAdaptExtKt$toKNListener$defaultImpl$1.this.onSuccess(effect);
                    }

                    @Override // X.XDR
                    public void onFail(com.ss.ugc.effectplatform.model.Effect effect, C84418XBe exception) {
                        o.LJIIJ(exception, "exception");
                        ListenerAdaptExtKt$toKNListener$defaultImpl$1.this.onFail(effect, exception);
                    }

                    @Override // X.InterfaceC84449XCj
                    public void onSuccess(com.ss.ugc.effectplatform.model.Effect effect, C84448XCi extra) {
                        o.LJIIJ(extra, "extra");
                        if (this.oldEffect == null) {
                            this.oldEffect = new Effect(effect);
                        }
                        ((IFetchEffectListenerExt) iFetchEffectListener).onSuccess(this.oldEffect, EffectExtra.Companion.create(extra));
                    }

                    @Override // X.XCP
                    public void onProgress(com.ss.ugc.effectplatform.model.Effect effect, int i, long j) {
                        ListenerAdaptExtKt$toKNListener$defaultImpl$1.this.onProgress(effect, i, j);
                    }
                };
            }
            return listenerAdaptExtKt$toKNListener$defaultImpl$1;
        }
        return null;
    }

    public static final ExceptionResult toOldExceptionResult(C84418XBe toOldExceptionResult) {
        o.LJIIJ(toOldExceptionResult, "$this$toOldExceptionResult");
        ExceptionResult exceptionResult = new ExceptionResult(toOldExceptionResult.LIZ, toOldExceptionResult.LIZJ);
        exceptionResult.setMsg(toOldExceptionResult.LIZIZ);
        return exceptionResult;
    }

    public static final InterfaceC84461XCv toKNListener(final IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        if (iDownloadProviderEffectListener != null) {
            return new InterfaceC84461XCv() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$13
                @Override // X.XDR
                public void preProcess(ProviderEffect response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(ProviderEffect response) {
                    o.LJIIJ(response, "response");
                    IDownloadProviderEffectListener.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect(response));
                }

                @Override // X.XDR
                public void onFail(ProviderEffect providerEffect, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IDownloadProviderEffectListener.this.onFail(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect), ListenerAdaptExtKt.toOldExceptionResult(exception));
                }

                @Override // X.InterfaceC84461XCv
                public void onProgress(ProviderEffect providerEffect, int i, long j) {
                    IDownloadProviderEffectListener iDownloadProviderEffectListener2 = IDownloadProviderEffectListener.this;
                    if (iDownloadProviderEffectListener2 instanceof IDownloadProviderEffectProgressListener) {
                        ((IDownloadProviderEffectProgressListener) iDownloadProviderEffectListener2).onProgress(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect), i, j);
                    }
                }
            };
        }
        return null;
    }

    public static final XD4 toKNListener(final IUpdateTagListener iUpdateTagListener) {
        if (iUpdateTagListener != null) {
            return new XD4() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$10
                @Override // X.XD4
                public void onFinally() {
                    IUpdateTagListener.this.onFinally();
                }
            };
        }
        return null;
    }

    public static final XDR<Boolean> toKNListener(final ICheckChannelListener iCheckChannelListener) {
        if (iCheckChannelListener != null) {
            return new XDR<Boolean>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$6
                public void preProcess(boolean z) {
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
                    onSuccess(bool.booleanValue());
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void preProcess(Boolean bool) {
                    preProcess(bool.booleanValue());
                }

                public void onSuccess(boolean z) {
                    ICheckChannelListener.this.checkChannelSuccess(z);
                }

                @Override // X.XDR
                public void onFail(Boolean bool, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    ICheckChannelListener.this.checkChannelFailed(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<EffectListResponse> toKNListener(final IEffectListResponseListener iEffectListResponseListener) {
        if (iEffectListResponseListener != null) {
            return new XDR<EffectListResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$18
                @Override // X.XDR
                public void preProcess(EffectListResponse response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(EffectListResponse response) {
                    o.LJIIJ(response, "response");
                    IEffectListResponseListener.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse(response));
                }

                @Override // X.XDR
                public void onFail(EffectListResponse effectListResponse, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IEffectListResponseListener.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<EffectListResponse> toKNListener(final IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        if (iFetchEffectListByIdsListener != null) {
            return new XDR<EffectListResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$5
                @Override // X.XDR
                public void preProcess(EffectListResponse response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(EffectListResponse response) {
                    o.LJIIJ(response, "response");
                    IFetchEffectListByIdsListener.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse(response));
                }

                @Override // X.XDR
                public void onFail(EffectListResponse effectListResponse, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IFetchEffectListByIdsListener.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<List<com.ss.ugc.effectplatform.model.Effect>> toKNListener(final IFetchEffectListListener iFetchEffectListListener) {
        if (iFetchEffectListListener != null) {
            return new XDR<List<? extends com.ss.ugc.effectplatform.model.Effect>>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$4
                @Override // X.XDR
                public void preProcess(List<? extends com.ss.ugc.effectplatform.model.Effect> response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(List<? extends com.ss.ugc.effectplatform.model.Effect> response) {
                    o.LJIIJ(response, "response");
                    IFetchEffectListListener iFetchEffectListListener2 = IFetchEffectListListener.this;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(response, 10));
                    Iterator<? extends com.ss.ugc.effectplatform.model.Effect> it = response.iterator();
                    while (it.hasNext()) {
                        C62850Ola.LJII(it.next(), arrayList);
                    }
                    iFetchEffectListListener2.onSuccess(arrayList);
                }

                @Override // X.XDR
                public void onFail(List<? extends com.ss.ugc.effectplatform.model.Effect> list, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IFetchEffectListListener.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<FetchFavoriteListResponse> toKNListener(final IFetchFavoriteList iFetchFavoriteList) {
        if (iFetchFavoriteList != null) {
            return new XDR<FetchFavoriteListResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$17
                @Override // X.XDR
                public void preProcess(FetchFavoriteListResponse response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(FetchFavoriteListResponse response) {
                    o.LJIIJ(response, "response");
                    IFetchFavoriteList.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse(response));
                }

                @Override // X.XDR
                public void onFail(FetchFavoriteListResponse fetchFavoriteListResponse, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IFetchFavoriteList.this.onFailed(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<FetchHotEffectResponse> toKNListener(final IFetchHotEffectListener iFetchHotEffectListener) {
        if (iFetchHotEffectListener != null) {
            return new XDR<FetchHotEffectResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$19
                @Override // X.XDR
                public void preProcess(FetchHotEffectResponse response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(FetchHotEffectResponse response) {
                    o.LJIIJ(response, "response");
                    IFetchHotEffectListener.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse(response));
                }

                @Override // X.XDR
                public void onFail(FetchHotEffectResponse fetchHotEffectResponse, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IFetchHotEffectListener.this.onFailed(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<ProviderEffectModel> toKNListener(final IFetchProviderEffect iFetchProviderEffect) {
        if (iFetchProviderEffect != null) {
            return new XDR<ProviderEffectModel>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$12
                @Override // X.XDR
                public void preProcess(ProviderEffectModel response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(ProviderEffectModel response) {
                    o.LJIIJ(response, "response");
                    IFetchProviderEffect.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel(response));
                }

                @Override // X.XDR
                public void onFail(ProviderEffectModel providerEffectModel, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IFetchProviderEffect.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<ResourceListModel> toKNListener(final IFetchResourceListener iFetchResourceListener) {
        if (iFetchResourceListener != null) {
            return new XDR<ResourceListModel>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$20
                @Override // X.XDR
                public void preProcess(ResourceListModel response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(ResourceListModel response) {
                    o.LJIIJ(response, "response");
                    IFetchResourceListener.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.ResourceListModel(response));
                }

                @Override // X.XDR
                public void onFail(ResourceListModel resourceListModel, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IFetchResourceListener.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<Boolean> toKNListener(final IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (iIsTagNeedUpdatedListener != null) {
            return new XDR<Boolean>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$11
                public void preProcess(boolean z) {
                }

                public void onSuccess(boolean z) {
                    if (z) {
                        IIsTagNeedUpdatedListener.this.onTagNeedUpdate();
                    } else {
                        IIsTagNeedUpdatedListener.this.onTagNeedNotUpdate();
                    }
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void preProcess(Boolean bool) {
                    preProcess(bool.booleanValue());
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
                    onSuccess(bool.booleanValue());
                }

                @Override // X.XDR
                public void onFail(Boolean bool, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IIsTagNeedUpdatedListener.this.onTagNeedNotUpdate();
                }
            };
        }
        return null;
    }

    public static final XDR<List<String>> toKNListener(final IModFavoriteList iModFavoriteList) {
        if (iModFavoriteList != null) {
            return new XDR<List<? extends String>>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$16
                /* renamed from: preProcess, reason: avoid collision after fix types in other method */
                public void preProcess2(List<String> response) {
                    o.LJIIJ(response, "response");
                }

                /* renamed from: onSuccess, reason: avoid collision after fix types in other method */
                public void onSuccess2(List<String> response) {
                    o.LJIIJ(response, "response");
                    IModFavoriteList.this.onSuccess(response);
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void preProcess(List<? extends String> list) {
                    preProcess2((List<String>) list);
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void onSuccess(List<? extends String> list) {
                    onSuccess2((List<String>) list);
                }

                /* renamed from: onFail, reason: avoid collision after fix types in other method */
                public void onFail2(List<String> list, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IModFavoriteList.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void onFail(List<? extends String> list, C84418XBe c84418XBe) {
                    onFail2((List<String>) list, c84418XBe);
                }
            };
        }
        return null;
    }

    public static final XDR toKNListener(final INothingListener iNothingListener) {
        if (iNothingListener != null) {
            return new XDR() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$22
                @Override // X.XDR
                public void preProcess(Void response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(Void response) {
                    o.LJIIJ(response, "response");
                    INothingListener.this.onSuccess(response);
                }

                @Override // X.XDR
                public void onFail(Void r3, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    INothingListener.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<CustomizedEffectsResponse> toKNListener(final IQueryCustomizedEffectsListener iQueryCustomizedEffectsListener) {
        if (iQueryCustomizedEffectsListener != null) {
            return new XDR<CustomizedEffectsResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$3
                @Override // X.XDR
                public void preProcess(CustomizedEffectsResponse response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(CustomizedEffectsResponse response) {
                    o.LJIIJ(response, "response");
                    IQueryCustomizedEffectsListener.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.CustomizedEffectsResponse(response));
                }

                @Override // X.XDR
                public void onFail(CustomizedEffectsResponse customizedEffectsResponse, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IQueryCustomizedEffectsListener.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<QueryRewardEffectsResponse> toKNListener(final IRewardEffectsListener iRewardEffectsListener) {
        if (iRewardEffectsListener != null) {
            return new XDR<QueryRewardEffectsResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$7
                @Override // X.XDR
                public void preProcess(QueryRewardEffectsResponse response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(QueryRewardEffectsResponse response) {
                    o.LJIIJ(response, "response");
                    IRewardEffectsListener.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse(response));
                }

                @Override // X.XDR
                public void onFail(QueryRewardEffectsResponse queryRewardEffectsResponse, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IRewardEffectsListener.this.onFailed(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<com.ss.ugc.effectplatform.model.Effect> toKNListener(final IScanQRCodeListener iScanQRCodeListener) {
        if (iScanQRCodeListener != null) {
            return new XDR<com.ss.ugc.effectplatform.model.Effect>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$21
                @Override // X.XDR
                public void preProcess(com.ss.ugc.effectplatform.model.Effect response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(com.ss.ugc.effectplatform.model.Effect response) {
                    o.LJIIJ(response, "response");
                    IScanQRCodeListener.this.onSuccess(new Effect(response));
                }

                @Override // X.XDR
                public void onFail(com.ss.ugc.effectplatform.model.Effect effect, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IScanQRCodeListener.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<SearchEffectResponse> toKNListener(final ISearchEffectListener iSearchEffectListener) {
        if (iSearchEffectListener != null) {
            return new XDR<SearchEffectResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$8
                @Override // X.XDR
                public void preProcess(SearchEffectResponse response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(SearchEffectResponse response) {
                    o.LJIIJ(response, "response");
                    ISearchEffectListener.this.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse(response));
                }

                @Override // X.XDR
                public void onFail(SearchEffectResponse searchEffectResponse, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    ISearchEffectListener.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<SearchEffectResponseV2> toKNListener(final ISearchEffectListenerV2 iSearchEffectListenerV2) {
        if (iSearchEffectListenerV2 != null) {
            return new XDR<SearchEffectResponseV2>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$9
                @Override // X.XDR
                public void preProcess(SearchEffectResponseV2 response) {
                    o.LJIIJ(response, "response");
                }

                @Override // X.XDR
                public void onSuccess(SearchEffectResponseV2 response) {
                    o.LJIIJ(response, "response");
                    com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2 searchEffectResponseV2 = new com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2();
                    searchEffectResponseV2.setData(new SearchEffectModel(response.getData()));
                    searchEffectResponseV2.status_code = response.getStatus_code();
                    searchEffectResponseV2.message = response.getMessage();
                    ISearchEffectListenerV2.this.onSuccess(searchEffectResponseV2);
                }

                @Override // X.XDR
                public void onFail(SearchEffectResponseV2 searchEffectResponseV2, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    ISearchEffectListenerV2.this.onFail(ListenerAdaptExtKt.toOldExceptionResult(exception));
                }
            };
        }
        return null;
    }

    public static final XDR<CategoryPageModel> toKNListener(IFetchCategoryEffectListener iFetchCategoryEffectListener, XCX xcx) {
        if (iFetchCategoryEffectListener != null) {
            return new ListenerAdaptExtKt$toKNListener$14(xcx, iFetchCategoryEffectListener);
        }
        return null;
    }

    public static final XDR<EffectChannelResponse> toKNListener(IFetchEffectChannelListener iFetchEffectChannelListener, XCX xcx) {
        if (iFetchEffectChannelListener != null) {
            return new ListenerAdaptExtKt$toKNListener$2(xcx, iFetchEffectChannelListener);
        }
        return null;
    }

    public static final XDR<PanelInfoModel> toKNListener(IFetchPanelInfoListener iFetchPanelInfoListener, XCX xcx) {
        if (iFetchPanelInfoListener != null) {
            return new ListenerAdaptExtKt$toKNListener$15(xcx, iFetchPanelInfoListener);
        }
        return null;
    }

    public static final void preProcess(CategoryPageModel preProcess, XCX xcx, InterfaceC88472Yns<? super com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, C76800UCe> runnable) {
        o.LJIIJ(preProcess, "$this$preProcess");
        o.LJIIJ(runnable, "runnable");
        if (xcx != null) {
            commit(xcx, preProcess, ListenerAdaptExtKt$preProcess$2.INSTANCE, runnable);
        }
    }

    public static final void preProcess(EffectChannelResponse preProcess, XCX xcx, InterfaceC88472Yns<? super com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse, C76800UCe> runnable) {
        o.LJIIJ(preProcess, "$this$preProcess");
        o.LJIIJ(runnable, "runnable");
        if (xcx != null) {
            commit(xcx, preProcess, ListenerAdaptExtKt$preProcess$1.INSTANCE, runnable);
        }
    }

    public static final void preProcess(PanelInfoModel preProcess, XCX xcx, InterfaceC88472Yns<? super com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel, C76800UCe> runnable) {
        o.LJIIJ(preProcess, "$this$preProcess");
        o.LJIIJ(runnable, "runnable");
        if (xcx != null) {
            commit(xcx, preProcess, ListenerAdaptExtKt$preProcess$3.INSTANCE, runnable);
        }
    }

    public static final <T, R> void commit(XCX commit, T t, InterfaceC88472Yns<? super T, ? extends R> runnable, InterfaceC88472Yns<? super R, C76800UCe> callbackInMainThread) {
        o.LJIIJ(commit, "$this$commit");
        o.LJIIJ(runnable, "runnable");
        o.LJIIJ(callbackInMainThread, "callbackInMainThread");
        commit.LIZ(new ListenerAdaptExtKt$commit$1(runnable, t, callbackInMainThread));
    }
}
