package com.ss.android.ugc.aweme.services;

import X.AbstractC60811Ntn;
import X.AbstractC60815Ntr;
import X.C60072Nhs;
import X.InterfaceC60850NuQ;
import android.content.Context;

/* loaded from: classes8.dex */
public interface IArticleModeAnchorService {
    void openAddAnchorFlow(Context context, String str, String str2, String str3);

    void openRelatedArticle(Context context, String str, C60072Nhs c60072Nhs, AbstractC60815Ntr abstractC60815Ntr, AbstractC60811Ntn abstractC60811Ntn, InterfaceC60850NuQ interfaceC60850NuQ);

    void previewArticle(Context context, String str);

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void openRelatedArticle$default(IArticleModeAnchorService iArticleModeAnchorService, Context context, String str, C60072Nhs c60072Nhs, AbstractC60815Ntr abstractC60815Ntr, AbstractC60811Ntn abstractC60811Ntn, InterfaceC60850NuQ interfaceC60850NuQ, int i, Object obj) {
            AbstractC60815Ntr abstractC60815Ntr2 = abstractC60815Ntr;
            AbstractC60811Ntn abstractC60811Ntn2 = abstractC60811Ntn;
            if (obj == null) {
                InterfaceC60850NuQ interfaceC60850NuQ2 = null;
                if ((i & 8) != 0) {
                    abstractC60815Ntr2 = null;
                }
                if ((i & 16) != 0) {
                    abstractC60811Ntn2 = null;
                }
                if ((i & 32) == 0) {
                    interfaceC60850NuQ2 = interfaceC60850NuQ;
                }
                iArticleModeAnchorService.openRelatedArticle(context, str, c60072Nhs, abstractC60815Ntr2, abstractC60811Ntn2, interfaceC60850NuQ2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openRelatedArticle");
        }
    }
}
