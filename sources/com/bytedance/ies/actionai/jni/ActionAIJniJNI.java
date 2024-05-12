package com.bytedance.ies.actionai.jni;

import com.bytedance.ies.actionai.jni.UnorderedMapStrStr;

/* loaded from: classes17.dex */
public class ActionAIJniJNI {
    public static final native void ActionAIEventObserver_onActionFinished(long j, ActionAIEventObserver actionAIEventObserver, long j2, MessageRequest messageRequest, long j3, MessageResponse messageResponse);

    public static final native void ActionAIEventObserver_onActionReadyStart(long j, ActionAIEventObserver actionAIEventObserver);

    public static final native void ActionAIEventObserver_onActionRegisterFail(long j, ActionAIEventObserver actionAIEventObserver);

    public static final native void ActionAIEventObserver_onActionRegisterSuccess(long j, ActionAIEventObserver actionAIEventObserver);

    public static final native void ActionAIEventObserver_onCancelFail(long j, ActionAIEventObserver actionAIEventObserver);

    public static final native void ActionAIEventObserver_onCancelSuccess(long j, ActionAIEventObserver actionAIEventObserver);

    public static final native void ActionAIEventObserver_onSessionReleaseFail(long j, ActionAIEventObserver actionAIEventObserver);

    public static final native void ActionAIEventObserver_onSessionReleaseSuccess(long j, ActionAIEventObserver actionAIEventObserver);

    public static final native long ActionAIExecutorCreatorWrapper_getDefaultExecutorCreator();

    public static final native long ActionAIExecutorCreatorWrapper_obtain();

    public static final native void ActionAIExecutorCreatorWrapper_setDefaultActionExecutorCreator(long j, IActionAIExecutorCreator iActionAIExecutorCreator);

    public static final native void ActionAIExecutor_change_ownership(ActionAIExecutor actionAIExecutor, long j, boolean z);

    public static final native void ActionAIExecutor_director_connect(ActionAIExecutor actionAIExecutor, long j, boolean z, boolean z2);

    public static final native void ActionAIExecutor_release__SWIG_0(long j, ActionAIExecutor actionAIExecutor, boolean z);

    public static final native void ActionAIExecutor_release__SWIG_1(long j, ActionAIExecutor actionAIExecutor);

    public static final native void ActionAIExecutor_start(long j, ActionAIExecutor actionAIExecutor);

    public static final native void ActionAIHttpClientCallbackDelegate_onCallback(long j, ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate, long j2, int i, byte[] bArr, long j3, long j4, MsgExtParam msgExtParam);

    public static final native long ActionAILoggerListener_SWIGSmartPtrUpcast(long j);

    public static final native void ActionAILoggerListener_change_ownership(ActionAILoggerListener actionAILoggerListener, long j, boolean z);

    public static final native void ActionAILoggerListener_director_connect(ActionAILoggerListener actionAILoggerListener, long j, boolean z, boolean z2);

    public static final native void ActionAILoggerListener_onLogSwigExplicitActionAILoggerListener__SWIG_0(long j, ActionAILoggerListener actionAILoggerListener, int i, String str, long j2);

    public static final native void ActionAILoggerListener_onLog__SWIG_0(long j, ActionAILoggerListener actionAILoggerListener, int i, String str, long j2);

    public static final native void ActionAILoggerListener_onLog__SWIG_1(long j, ActionAILoggerListener actionAILoggerListener, int i, String str);

    public static final native void ActionAILogger_d(long j, ActionAILogger actionAILogger, String str);

    public static final native void ActionAILogger_e(long j, ActionAILogger actionAILogger, String str);

    public static final native void ActionAILogger_i(long j, ActionAILogger actionAILogger, String str);

    public static final native long ActionAILogger_obtain();

    public static final native void ActionAILogger_setDelegate(long j, ActionAILogger actionAILogger, long j2, ActionAILoggerFunc actionAILoggerFunc);

    public static final native void ActionAILogger_setLogLevel(long j, ActionAILogger actionAILogger, int i);

    public static final native void ActionAILogger_v(long j, ActionAILogger actionAILogger, String str);

    public static final native void ActionAILogger_w(long j, ActionAILogger actionAILogger, String str);

    public static final native void ActionAILogger_wtf(long j, ActionAILogger actionAILogger, String str);

    public static final native long ActionAIMonitor_obtain();

    public static final native void ActionAIMonitor_onEvent(long j, ActionAIMonitor actionAIMonitor, String str, int i, String str2);

    public static final native void ActionAIMonitor_onSuccessRateMonitor(long j, ActionAIMonitor actionAIMonitor, String str, int i, String str2);

    public static final native void ActionAIMonitor_setListener(long j, ActionAIMonitor actionAIMonitor, long j2, IActionAIMonitorDelegate iActionAIMonitorDelegate);

    public static final native void ActionAINetworkClientDelegateWrapper_setHttpClientWrapper(long j, IActionAIHTTPClientDelegateWrapper iActionAIHTTPClientDelegateWrapper);

    public static final native void ActionAIPlatform_cancel(long j, ActionAIPlatform actionAIPlatform);

    public static final native long ActionAIPlatform_getObserver(long j, ActionAIPlatform actionAIPlatform);

    public static final native void ActionAIPlatform_initSession(long j, ActionAIPlatform actionAIPlatform, long j2, SessionConfig sessionConfig, long j3, SessionInitCallback sessionInitCallback);

    public static final native boolean ActionAIPlatform_registerAction(long j, ActionAIPlatform actionAIPlatform, long j2, ActionExecutor actionExecutor);

    public static final native void ActionAIPlatform_releaseSession(long j, ActionAIPlatform actionAIPlatform, String str);

    public static final native void ActionAIPlatform_sendMessage(long j, ActionAIPlatform actionAIPlatform, long j2, MessageRequest messageRequest, long j3, MessageCallback messageCallback);

    public static final native void ActionAIPlatform_setObserver(long j, ActionAIPlatform actionAIPlatform, long j2, ActionAIEventObserver actionAIEventObserver);

    public static final native void ActionExecuteCallback_change_ownership(ActionExecuteCallback actionExecuteCallback, long j, boolean z);

    public static final native void ActionExecuteCallback_director_connect(ActionExecuteCallback actionExecuteCallback, long j, boolean z, boolean z2);

    public static final native void ActionExecuteCallback_onExecuteError(long j, ActionExecuteCallback actionExecuteCallback, int i, String str, long j2, ServerErrorInfo serverErrorInfo);

    public static final native void ActionExecuteCallback_onExecuteStep(long j, ActionExecuteCallback actionExecuteCallback, long j2, ExecutionRecord executionRecord);

    public static final native void ActionExecuteCallback_onExecuteSuccess(long j, ActionExecuteCallback actionExecuteCallback, long j2, ActionResult actionResult);

    public static final native boolean ActionExecutionNode_drop_end_msg_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_drop_end_msg_set(long j, ActionExecutionNode actionExecutionNode, boolean z);

    public static final native long ActionExecutionNode_execution_record_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_execution_record_set(long j, ActionExecutionNode actionExecutionNode, long j2, StringList stringList);

    public static final native String ActionExecutionNode_name_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_name_set(long j, ActionExecutionNode actionExecutionNode, String str);

    public static final native String ActionExecutionNode_next_node_ids_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_next_node_ids_set(long j, ActionExecutionNode actionExecutionNode, String str);

    public static final native long ActionExecutionNode_output_context_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_output_context_set(long j, ActionExecutionNode actionExecutionNode, long j2, StringList stringList);

    public static final native String ActionExecutionNode_output_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_output_set(long j, ActionExecutionNode actionExecutionNode, String str);

    public static final native String ActionExecutionNode_parameters_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_parameters_set(long j, ActionExecutionNode actionExecutionNode, String str);

    public static final native String ActionExecutionNode_previous_node_ids_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_previous_node_ids_set(long j, ActionExecutionNode actionExecutionNode, String str);

    public static final native int ActionExecutionNode_priority_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_priority_set(long j, ActionExecutionNode actionExecutionNode, int i);

    public static final native int ActionExecutionNode_type_get(long j, ActionExecutionNode actionExecutionNode);

    public static final native void ActionExecutionNode_type_set(long j, ActionExecutionNode actionExecutionNode, int i);

    public static final native void ActionExecutor_change_ownership(ActionExecutor actionExecutor, long j, boolean z);

    public static final native void ActionExecutor_director_connect(ActionExecutor actionExecutor, long j, boolean z, boolean z2);

    public static final native void ActionExecutor_execute(long j, ActionExecutor actionExecutor, long j2, ExecutionContext executionContext, String str, long j3, ActionExecuteCallback actionExecuteCallback);

    public static final native long ActionExecutor_getActionModel(long j, ActionExecutor actionExecutor);

    public static final native String ActionModel_address_get(long j, ActionModel actionModel);

    public static final native void ActionModel_address_set(long j, ActionModel actionModel, String str);

    public static final native String ActionModel_category_get(long j, ActionModel actionModel);

    public static final native void ActionModel_category_set(long j, ActionModel actionModel, String str);

    public static final native String ActionModel_description_get(long j, ActionModel actionModel);

    public static final native void ActionModel_description_set(long j, ActionModel actionModel, String str);

    public static final native String ActionModel_example_get(long j, ActionModel actionModel);

    public static final native void ActionModel_example_set(long j, ActionModel actionModel, String str);

    public static final native long ActionModel_input_description_get(long j, ActionModel actionModel);

    public static final native void ActionModel_input_description_set(long j, ActionModel actionModel, long j2, InputDescList inputDescList);

    public static final native boolean ActionModel_is_client_defined_get(long j, ActionModel actionModel);

    public static final native void ActionModel_is_client_defined_set(long j, ActionModel actionModel, boolean z);

    public static final native String ActionModel_name_get(long j, ActionModel actionModel);

    public static final native void ActionModel_name_set(long j, ActionModel actionModel, String str);

    public static final native long ActionModel_output_description_get(long j, ActionModel actionModel);

    public static final native void ActionModel_output_description_set(long j, ActionModel actionModel, long j2, OutputDescList outputDescList);

    public static final native int ActionModel_priority_get(long j, ActionModel actionModel);

    public static final native void ActionModel_priority_set(long j, ActionModel actionModel, int i);

    public static final native String ActionModel_scenario_get(long j, ActionModel actionModel);

    public static final native void ActionModel_scenario_set(long j, ActionModel actionModel, String str);

    public static final native int ActionModel_type_get(long j, ActionModel actionModel);

    public static final native void ActionModel_type_set(long j, ActionModel actionModel, int i);

    public static final native long ActionNodeList_capacity(long j, ActionNodeList actionNodeList);

    public static final native void ActionNodeList_clear(long j, ActionNodeList actionNodeList);

    public static final native void ActionNodeList_doAdd__SWIG_0(long j, ActionNodeList actionNodeList, long j2, ActionExecutionNode actionExecutionNode);

    public static final native void ActionNodeList_doAdd__SWIG_1(long j, ActionNodeList actionNodeList, int i, long j2, ActionExecutionNode actionExecutionNode);

    public static final native long ActionNodeList_doGet(long j, ActionNodeList actionNodeList, int i);

    public static final native long ActionNodeList_doRemove(long j, ActionNodeList actionNodeList, int i);

    public static final native void ActionNodeList_doRemoveRange(long j, ActionNodeList actionNodeList, int i, int i2);

    public static final native long ActionNodeList_doSet(long j, ActionNodeList actionNodeList, int i, long j2, ActionExecutionNode actionExecutionNode);

    public static final native int ActionNodeList_doSize(long j, ActionNodeList actionNodeList);

    public static final native boolean ActionNodeList_isEmpty(long j, ActionNodeList actionNodeList);

    public static final native void ActionNodeList_reserve(long j, ActionNodeList actionNodeList, long j2);

    public static final native long ActionParamDescList_capacity(long j, ActionParamDescList actionParamDescList);

    public static final native void ActionParamDescList_clear(long j, ActionParamDescList actionParamDescList);

    public static final native void ActionParamDescList_doAdd__SWIG_0(long j, ActionParamDescList actionParamDescList, long j2, ActionParamDescription actionParamDescription);

    public static final native void ActionParamDescList_doAdd__SWIG_1(long j, ActionParamDescList actionParamDescList, int i, long j2, ActionParamDescription actionParamDescription);

    public static final native long ActionParamDescList_doGet(long j, ActionParamDescList actionParamDescList, int i);

    public static final native long ActionParamDescList_doRemove(long j, ActionParamDescList actionParamDescList, int i);

    public static final native void ActionParamDescList_doRemoveRange(long j, ActionParamDescList actionParamDescList, int i, int i2);

    public static final native long ActionParamDescList_doSet(long j, ActionParamDescList actionParamDescList, int i, long j2, ActionParamDescription actionParamDescription);

    public static final native int ActionParamDescList_doSize(long j, ActionParamDescList actionParamDescList);

    public static final native boolean ActionParamDescList_isEmpty(long j, ActionParamDescList actionParamDescList);

    public static final native void ActionParamDescList_reserve(long j, ActionParamDescList actionParamDescList, long j2);

    public static final native String ActionParamDescription_context_key_get(long j, ActionParamDescription actionParamDescription);

    public static final native void ActionParamDescription_context_key_set(long j, ActionParamDescription actionParamDescription, String str);

    public static final native boolean ActionParamDescription_context_visible_get(long j, ActionParamDescription actionParamDescription);

    public static final native void ActionParamDescription_context_visible_set(long j, ActionParamDescription actionParamDescription, boolean z);

    public static final native String ActionParamDescription_default_value_get(long j, ActionParamDescription actionParamDescription);

    public static final native void ActionParamDescription_default_value_set(long j, ActionParamDescription actionParamDescription, String str);

    public static final native String ActionParamDescription_description_get(long j, ActionParamDescription actionParamDescription);

    public static final native void ActionParamDescription_description_set(long j, ActionParamDescription actionParamDescription, String str);

    public static final native int ActionParamDescription_optional_get(long j, ActionParamDescription actionParamDescription);

    public static final native void ActionParamDescription_optional_set(long j, ActionParamDescription actionParamDescription, int i);

    public static final native int ActionParamDescription_type_get(long j, ActionParamDescription actionParamDescription);

    public static final native void ActionParamDescription_type_set(long j, ActionParamDescription actionParamDescription, int i);

    public static final native String ActionParamDescription_var_name_get(long j, ActionParamDescription actionParamDescription);

    public static final native void ActionParamDescription_var_name_set(long j, ActionParamDescription actionParamDescription, String str);

    public static final native boolean ActionResult_dropEndMsg_get(long j, ActionResult actionResult);

    public static final native void ActionResult_dropEndMsg_set(long j, ActionResult actionResult, boolean z);

    public static final native String ActionResult_outputJsonStr_get(long j, ActionResult actionResult);

    public static final native void ActionResult_outputJsonStr_set(long j, ActionResult actionResult, String str);

    public static final native long BaseMessage_endTimeMills_get(long j, BaseMessage baseMessage);

    public static final native void BaseMessage_endTimeMills_set(long j, BaseMessage baseMessage, long j2);

    public static final native String BaseMessage_messageId_get(long j, BaseMessage baseMessage);

    public static final native void BaseMessage_messageId_set(long j, BaseMessage baseMessage, String str);

    public static final native long BaseMessage_startTimeMills_get(long j, BaseMessage baseMessage);

    public static final native void BaseMessage_startTimeMills_set(long j, BaseMessage baseMessage, long j2);

    public static final native long ExecutionContext_actionDAG_get(long j, ExecutionContext executionContext);

    public static final native void ExecutionContext_actionDAG_set(long j, ExecutionContext executionContext, long j2, ActionNodeList actionNodeList);

    public static final native String ExecutionContext_conversationId_get(long j, ExecutionContext executionContext);

    public static final native void ExecutionContext_conversationId_set(long j, ExecutionContext executionContext, String str);

    public static final native String ExecutionContext_messageId_get(long j, ExecutionContext executionContext);

    public static final native void ExecutionContext_messageId_set(long j, ExecutionContext executionContext, String str);

    public static final native long ExecutionRecord_record_value_pair_get(long j, ExecutionRecord executionRecord);

    public static final native void ExecutionRecord_record_value_pair_set(long j, ExecutionRecord executionRecord, long j2, StringPair stringPair);

    public static final native long FollowUpQuestionMsgResponse_SWIGSmartPtrUpcast(long j);

    public static final native long FollowUpQuestionMsgResponse_dynamicCast(long j, MessageResponse messageResponse);

    public static final native long FollowUpQuestionMsgResponse_followUpQuestionList_get(long j, FollowUpQuestionMsgResponse followUpQuestionMsgResponse);

    public static final native void FollowUpQuestionMsgResponse_followUpQuestionList_set(long j, FollowUpQuestionMsgResponse followUpQuestionMsgResponse, long j2, StringList stringList);

    public static final native void IActionAIExecutorCreator_change_ownership(IActionAIExecutorCreator iActionAIExecutorCreator, long j, boolean z);

    public static final native long IActionAIExecutorCreator_createExecutor(long j, IActionAIExecutorCreator iActionAIExecutorCreator, String str, int i);

    public static final native void IActionAIExecutorCreator_director_connect(IActionAIExecutorCreator iActionAIExecutorCreator, long j, boolean z, boolean z2);

    public static final native void IActionAIHTTPClientDelegateWrapper_change_ownership(IActionAIHTTPClientDelegateWrapper iActionAIHTTPClientDelegateWrapper, long j, boolean z);

    public static final native void IActionAIHTTPClientDelegateWrapper_director_connect(IActionAIHTTPClientDelegateWrapper iActionAIHTTPClientDelegateWrapper, long j, boolean z, boolean z2);

    public static final native boolean IActionAIHTTPClientDelegateWrapper_requestNet(long j, IActionAIHTTPClientDelegateWrapper iActionAIHTTPClientDelegateWrapper, String str, int i, long j2, long j3, UnorderedMapStrStr unorderedMapStrStr, long j4, UnorderedMapStrStr unorderedMapStrStr2, String str2, byte[] bArr, long j5, long j6, ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate);

    public static final native void IActionAIMonitorDelegate_change_ownership(IActionAIMonitorDelegate iActionAIMonitorDelegate, long j, boolean z);

    public static final native void IActionAIMonitorDelegate_director_connect(IActionAIMonitorDelegate iActionAIMonitorDelegate, long j, boolean z, boolean z2);

    public static final native void IActionAIMonitorDelegate_onEvent(long j, IActionAIMonitorDelegate iActionAIMonitorDelegate, String str, int i, String str2);

    public static final native void IActionAIMonitorDelegate_onSuccessRateMonitor(long j, IActionAIMonitorDelegate iActionAIMonitorDelegate, String str, int i, String str2);

    public static final native long IExecutorDelegate_SWIGSmartPtrUpcast(long j);

    public static final native void IExecutorDelegate_change_ownership(IExecutorDelegate iExecutorDelegate, long j, boolean z);

    public static final native void IExecutorDelegate_director_connect(IExecutorDelegate iExecutorDelegate, long j, boolean z, boolean z2);

    public static final native void IExecutorDelegate_postRunnable(long j, IExecutorDelegate iExecutorDelegate, long j2, IExecutorRunnable iExecutorRunnable);

    public static final native void IExecutorRunnable_change_ownership(IExecutorRunnable iExecutorRunnable, long j, boolean z);

    public static final native void IExecutorRunnable_director_connect(IExecutorRunnable iExecutorRunnable, long j, boolean z, boolean z2);

    public static final native void IExecutorRunnable_run(long j, IExecutorRunnable iExecutorRunnable);

    public static final native long InputDescList_capacity(long j, InputDescList inputDescList);

    public static final native void InputDescList_clear(long j, InputDescList inputDescList);

    public static final native void InputDescList_doAdd__SWIG_0(long j, InputDescList inputDescList, long j2, InputDescription inputDescription);

    public static final native void InputDescList_doAdd__SWIG_1(long j, InputDescList inputDescList, int i, long j2, InputDescription inputDescription);

    public static final native long InputDescList_doGet(long j, InputDescList inputDescList, int i);

    public static final native long InputDescList_doRemove(long j, InputDescList inputDescList, int i);

    public static final native void InputDescList_doRemoveRange(long j, InputDescList inputDescList, int i, int i2);

    public static final native long InputDescList_doSet(long j, InputDescList inputDescList, int i, long j2, InputDescription inputDescription);

    public static final native int InputDescList_doSize(long j, InputDescList inputDescList);

    public static final native boolean InputDescList_isEmpty(long j, InputDescList inputDescList);

    public static final native void InputDescList_reserve(long j, InputDescList inputDescList, long j2);

    public static final native long InputDescription_SWIGSmartPtrUpcast(long j);

    public static final native int InputDescription_from_where_get(long j, InputDescription inputDescription);

    public static final native void InputDescription_from_where_set(long j, InputDescription inputDescription, int i);

    public static final native boolean InputDescription_use_end_message_get(long j, InputDescription inputDescription);

    public static final native void InputDescription_use_end_message_set(long j, InputDescription inputDescription, boolean z);

    public static final native String LogInfo_action_name_get(long j, LogInfo logInfo);

    public static final native void LogInfo_action_name_set(long j, LogInfo logInfo, String str);

    public static final native String LogInfo_inputJson_get(long j, LogInfo logInfo);

    public static final native void LogInfo_inputJson_set(long j, LogInfo logInfo, String str);

    public static final native String LogInfo_outputJson_get(long j, LogInfo logInfo);

    public static final native void LogInfo_outputJson_set(long j, LogInfo logInfo, String str);

    public static final native long LogMsgResponse_SWIGSmartPtrUpcast(long j);

    public static final native long LogMsgResponse_dynamicCast(long j, MessageResponse messageResponse);

    public static final native String LogMsgResponse_getLogAsString(long j, LogMsgResponse logMsgResponse);

    public static final native long LogMsgResponse_log_info_get(long j, LogMsgResponse logMsgResponse);

    public static final native void LogMsgResponse_log_info_set(long j, LogMsgResponse logMsgResponse, long j2, LogInfo logInfo);

    public static final native void LogMsgResponse_printLog(long j, LogMsgResponse logMsgResponse);

    public static final native void MessageCallback_change_ownership(MessageCallback messageCallback, long j, boolean z);

    public static final native void MessageCallback_director_connect(MessageCallback messageCallback, long j, boolean z, boolean z2);

    public static final native void MessageCallback_onNotify(long j, MessageCallback messageCallback, int i, long j2, MessageResponse messageResponse);

    public static final native long MessageRequest_SWIGSmartPtrUpcast(long j);

    public static final native String MessageRequest_input_get(long j, MessageRequest messageRequest);

    public static final native void MessageRequest_input_set(long j, MessageRequest messageRequest, String str);

    public static final native boolean MessageRequest_is_canceled_get(long j, MessageRequest messageRequest);

    public static final native void MessageRequest_is_canceled_set(long j, MessageRequest messageRequest, boolean z);

    public static final native long MessageResponse_SWIGSmartPtrUpcast(long j);

    public static final native long MessageResponse_actionDAG_get(long j, MessageResponse messageResponse);

    public static final native void MessageResponse_actionDAG_set(long j, MessageResponse messageResponse, long j2, ActionNodeList actionNodeList);

    public static final native String MessageResponse_conversationId_get(long j, MessageResponse messageResponse);

    public static final native void MessageResponse_conversationId_set(long j, MessageResponse messageResponse, String str);

    public static final native int MessageResponse_errorCode_get(long j, MessageResponse messageResponse);

    public static final native void MessageResponse_errorCode_set(long j, MessageResponse messageResponse, int i);

    public static final native String MessageResponse_errorMsg_get(long j, MessageResponse messageResponse);

    public static final native void MessageResponse_errorMsg_set(long j, MessageResponse messageResponse, String str);

    public static final native String MessageResponse_message_get(long j, MessageResponse messageResponse);

    public static final native void MessageResponse_message_set(long j, MessageResponse messageResponse, String str);

    public static final native long MessageResponse_serverErrorInfo_get(long j, MessageResponse messageResponse);

    public static final native void MessageResponse_serverErrorInfo_set(long j, MessageResponse messageResponse, long j2, ServerErrorInfo serverErrorInfo);

    public static final native int MsgExtParam_eHttpType_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_eHttpType_set(long j, MsgExtParam msgExtParam, int i);

    public static final native int MsgExtParam_errorCode_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_errorCode_set(long j, MsgExtParam msgExtParam, int i);

    public static final native String MsgExtParam_errorMsg_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_errorMsg_set(long j, MsgExtParam msgExtParam, String str);

    public static final native long MsgExtParam_uiReqId_get(long j, MsgExtParam msgExtParam);

    public static final native void MsgExtParam_uiReqId_set(long j, MsgExtParam msgExtParam, long j2);

    public static final native long OutputDescList_capacity(long j, OutputDescList outputDescList);

    public static final native void OutputDescList_clear(long j, OutputDescList outputDescList);

    public static final native void OutputDescList_doAdd__SWIG_0(long j, OutputDescList outputDescList, long j2, OutputDescription outputDescription);

    public static final native void OutputDescList_doAdd__SWIG_1(long j, OutputDescList outputDescList, int i, long j2, OutputDescription outputDescription);

    public static final native long OutputDescList_doGet(long j, OutputDescList outputDescList, int i);

    public static final native long OutputDescList_doRemove(long j, OutputDescList outputDescList, int i);

    public static final native void OutputDescList_doRemoveRange(long j, OutputDescList outputDescList, int i, int i2);

    public static final native long OutputDescList_doSet(long j, OutputDescList outputDescList, int i, long j2, OutputDescription outputDescription);

    public static final native int OutputDescList_doSize(long j, OutputDescList outputDescList);

    public static final native boolean OutputDescList_isEmpty(long j, OutputDescList outputDescList);

    public static final native void OutputDescList_reserve(long j, OutputDescList outputDescList, long j2);

    public static final native long OutputDescription_SWIGSmartPtrUpcast(long j);

    public static final native int OutputDescription_to_where_get(long j, OutputDescription outputDescription);

    public static final native void OutputDescription_to_where_set(long j, OutputDescription outputDescription, int i);

    public static final native String ServerErrorInfo_detail_get(long j, ServerErrorInfo serverErrorInfo);

    public static final native void ServerErrorInfo_detail_set(long j, ServerErrorInfo serverErrorInfo, String str);

    public static final native String ServerErrorInfo_logId_get(long j, ServerErrorInfo serverErrorInfo);

    public static final native void ServerErrorInfo_logId_set(long j, ServerErrorInfo serverErrorInfo, String str);

    public static final native String ServerErrorInfo_message_get(long j, ServerErrorInfo serverErrorInfo);

    public static final native void ServerErrorInfo_message_set(long j, ServerErrorInfo serverErrorInfo, String str);

    public static final native String ServerErrorInfo_search_type_get(long j, ServerErrorInfo serverErrorInfo);

    public static final native void ServerErrorInfo_search_type_set(long j, ServerErrorInfo serverErrorInfo, String str);

    public static final native int ServerErrorInfo_statusCode_get(long j, ServerErrorInfo serverErrorInfo);

    public static final native void ServerErrorInfo_statusCode_set(long j, ServerErrorInfo serverErrorInfo, int i);

    public static final native long SessionConfigBuilder_build(long j, SessionConfigBuilder sessionConfigBuilder);

    public static final native long SessionConfigBuilder_setBizId(long j, SessionConfigBuilder sessionConfigBuilder, String str);

    public static final native long SessionConfigBuilder_setDebugMode(long j, SessionConfigBuilder sessionConfigBuilder, boolean z);

    public static final native long SessionConfigBuilder_setEnableChatHistory(long j, SessionConfigBuilder sessionConfigBuilder, boolean z);

    public static final native long SessionConfigBuilder_setEnableDynamicActionList(long j, SessionConfigBuilder sessionConfigBuilder, boolean z);

    public static final native long SessionConfigBuilder_setEnableLLMCache(long j, SessionConfigBuilder sessionConfigBuilder, boolean z);

    public static final native long SessionConfigBuilder_setHost(long j, SessionConfigBuilder sessionConfigBuilder, String str);

    public static final native long SessionConfigBuilder_setLlmKey(long j, SessionConfigBuilder sessionConfigBuilder, String str);

    public static final native long SessionConfigBuilder_setLlmTimeoutSecond(long j, SessionConfigBuilder sessionConfigBuilder, int i);

    public static final native long SessionConfigBuilder_setLlmType(long j, SessionConfigBuilder sessionConfigBuilder, String str);

    public static final native String SessionConfig_getBizId(long j, SessionConfig sessionConfig);

    public static final native boolean SessionConfig_getDebugMode(long j, SessionConfig sessionConfig);

    public static final native boolean SessionConfig_getEnableChatHistory(long j, SessionConfig sessionConfig);

    public static final native boolean SessionConfig_getEnableDynamicActionList(long j, SessionConfig sessionConfig);

    public static final native boolean SessionConfig_getEnableLLMCache(long j, SessionConfig sessionConfig);

    public static final native String SessionConfig_getHost(long j, SessionConfig sessionConfig);

    public static final native String SessionConfig_getLlmKey(long j, SessionConfig sessionConfig);

    public static final native int SessionConfig_getLlmTimeoutSecond(long j, SessionConfig sessionConfig);

    public static final native String SessionConfig_getLlmType(long j, SessionConfig sessionConfig);

    public static final native void SessionInitCallback_change_ownership(SessionInitCallback sessionInitCallback, long j, boolean z);

    public static final native void SessionInitCallback_director_connect(SessionInitCallback sessionInitCallback, long j, boolean z, boolean z2);

    public static final native void SessionInitCallback_onFail(long j, SessionInitCallback sessionInitCallback, int i, String str, long j2, ServerErrorInfo serverErrorInfo);

    public static final native void SessionInitCallback_onSuccess(long j, SessionInitCallback sessionInitCallback, String str);

    public static final native long StringList_capacity(long j, StringList stringList);

    public static final native void StringList_clear(long j, StringList stringList);

    public static final native void StringList_doAdd__SWIG_0(long j, StringList stringList, String str);

    public static final native void StringList_doAdd__SWIG_1(long j, StringList stringList, int i, String str);

    public static final native String StringList_doGet(long j, StringList stringList, int i);

    public static final native String StringList_doRemove(long j, StringList stringList, int i);

    public static final native void StringList_doRemoveRange(long j, StringList stringList, int i, int i2);

    public static final native String StringList_doSet(long j, StringList stringList, int i, String str);

    public static final native int StringList_doSize(long j, StringList stringList);

    public static final native boolean StringList_isEmpty(long j, StringList stringList);

    public static final native void StringList_reserve(long j, StringList stringList, long j2);

    public static final native String StringPair_first_get(long j, StringPair stringPair);

    public static final native void StringPair_first_set(long j, StringPair stringPair, String str);

    public static final native String StringPair_second_get(long j, StringPair stringPair);

    public static final native void StringPair_second_set(long j, StringPair stringPair, String str);

    public static final native String UnorderedMapStrStr_Iterator_getKey(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native long UnorderedMapStrStr_Iterator_getNextUnchecked(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native String UnorderedMapStrStr_Iterator_getValue(long j, UnorderedMapStrStr.Iterator iterator);

    public static final native boolean UnorderedMapStrStr_Iterator_isNot(long j, UnorderedMapStrStr.Iterator iterator, long j2, UnorderedMapStrStr.Iterator iterator2);

    public static final native void UnorderedMapStrStr_Iterator_setValue(long j, UnorderedMapStrStr.Iterator iterator, String str);

    public static final native long UnorderedMapStrStr_begin(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void UnorderedMapStrStr_clear(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native boolean UnorderedMapStrStr_containsImpl(long j, UnorderedMapStrStr unorderedMapStrStr, String str);

    public static final native long UnorderedMapStrStr_end(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native long UnorderedMapStrStr_find(long j, UnorderedMapStrStr unorderedMapStrStr, String str);

    public static final native boolean UnorderedMapStrStr_isEmpty(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void UnorderedMapStrStr_putUnchecked(long j, UnorderedMapStrStr unorderedMapStrStr, String str, String str2);

    public static final native void UnorderedMapStrStr_removeUnchecked(long j, UnorderedMapStrStr unorderedMapStrStr, long j2, UnorderedMapStrStr.Iterator iterator);

    public static final native int UnorderedMapStrStr_sizeImpl(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native void delete_ActionAIEventObserver(long j);

    public static final native void delete_ActionAIExecutor(long j);

    public static final native void delete_ActionAIExecutorCreatorWrapper(long j);

    public static final native void delete_ActionAIHttpClientCallbackDelegate(long j);

    public static final native void delete_ActionAILogger(long j);

    public static final native void delete_ActionAILoggerFunc(long j);

    public static final native void delete_ActionAILoggerListener(long j);

    public static final native void delete_ActionAIMonitor(long j);

    public static final native void delete_ActionAINetworkClientDelegateWrapper(long j);

    public static final native void delete_ActionAIPlatform(long j);

    public static final native void delete_ActionExecuteCallback(long j);

    public static final native void delete_ActionExecutionNode(long j);

    public static final native void delete_ActionExecutor(long j);

    public static final native void delete_ActionModel(long j);

    public static final native void delete_ActionNodeList(long j);

    public static final native void delete_ActionParamDescList(long j);

    public static final native void delete_ActionParamDescription(long j);

    public static final native void delete_ActionResult(long j);

    public static final native void delete_BaseMessage(long j);

    public static final native void delete_ExecutionContext(long j);

    public static final native void delete_ExecutionRecord(long j);

    public static final native void delete_FollowUpQuestionMsgResponse(long j);

    public static final native void delete_IActionAIExecutorCreator(long j);

    public static final native void delete_IActionAIHTTPClientDelegateWrapper(long j);

    public static final native void delete_IActionAIMonitorDelegate(long j);

    public static final native void delete_IExecutorDelegate(long j);

    public static final native void delete_IExecutorRunnable(long j);

    public static final native void delete_InputDescList(long j);

    public static final native void delete_InputDescription(long j);

    public static final native void delete_LogInfo(long j);

    public static final native void delete_LogMsgResponse(long j);

    public static final native void delete_MessageCallback(long j);

    public static final native void delete_MessageRequest(long j);

    public static final native void delete_MessageResponse(long j);

    public static final native void delete_MsgExtParam(long j);

    public static final native void delete_OutputDescList(long j);

    public static final native void delete_OutputDescription(long j);

    public static final native void delete_ServerErrorInfo(long j);

    public static final native void delete_SessionConfig(long j);

    public static final native void delete_SessionConfigBuilder(long j);

    public static final native void delete_SessionInitCallback(long j);

    public static final native void delete_StringList(long j);

    public static final native void delete_StringPair(long j);

    public static final native void delete_UnorderedMapStrStr(long j);

    public static final native void delete_UnorderedMapStrStr_Iterator(long j);

    public static final native void from_json__SWIG_0(long j, long j2, InputDescription inputDescription);

    public static final native void from_json__SWIG_1(long j, long j2, OutputDescription outputDescription);

    public static final native void from_json__SWIG_2(long j, long j2, ActionModel actionModel);

    public static final native long new_ActionAIExecutor();

    public static final native long new_ActionAIExecutorCreatorWrapper();

    public static final native long new_ActionAILogger();

    public static final native long new_ActionAILoggerListener();

    public static final native long new_ActionAIMonitor();

    public static final native long new_ActionAINetworkClientDelegateWrapper();

    public static final native long new_ActionAIPlatform();

    public static final native long new_ActionExecuteCallback();

    public static final native long new_ActionExecutionNode();

    public static final native long new_ActionExecutor();

    public static final native long new_ActionModel();

    public static final native long new_ActionNodeList__SWIG_0();

    public static final native long new_ActionNodeList__SWIG_1(long j, ActionNodeList actionNodeList);

    public static final native long new_ActionNodeList__SWIG_2(int i, long j, ActionExecutionNode actionExecutionNode);

    public static final native long new_ActionParamDescList__SWIG_0();

    public static final native long new_ActionParamDescList__SWIG_1(long j, ActionParamDescList actionParamDescList);

    public static final native long new_ActionParamDescList__SWIG_2(int i, long j, ActionParamDescription actionParamDescription);

    public static final native long new_ActionParamDescription();

    public static final native long new_ActionResult();

    public static final native long new_BaseMessage();

    public static final native long new_ExecutionContext();

    public static final native long new_ExecutionRecord();

    public static final native long new_FollowUpQuestionMsgResponse();

    public static final native long new_IActionAIExecutorCreator();

    public static final native long new_IActionAIHTTPClientDelegateWrapper();

    public static final native long new_IActionAIMonitorDelegate();

    public static final native long new_IExecutorDelegate();

    public static final native long new_IExecutorRunnable();

    public static final native long new_InputDescList__SWIG_0();

    public static final native long new_InputDescList__SWIG_1(long j, InputDescList inputDescList);

    public static final native long new_InputDescList__SWIG_2(int i, long j, InputDescription inputDescription);

    public static final native long new_InputDescription();

    public static final native long new_LogInfo();

    public static final native long new_LogMsgResponse();

    public static final native long new_MessageCallback();

    public static final native long new_MessageRequest();

    public static final native long new_MessageResponse();

    public static final native long new_MsgExtParam();

    public static final native long new_OutputDescList__SWIG_0();

    public static final native long new_OutputDescList__SWIG_1(long j, OutputDescList outputDescList);

    public static final native long new_OutputDescList__SWIG_2(int i, long j, OutputDescription outputDescription);

    public static final native long new_OutputDescription();

    public static final native long new_ServerErrorInfo();

    public static final native long new_SessionConfigBuilder();

    public static final native long new_SessionInitCallback();

    public static final native long new_StringList__SWIG_0();

    public static final native long new_StringList__SWIG_1(long j, StringList stringList);

    public static final native long new_StringList__SWIG_2(int i, String str);

    public static final native long new_StringPair__SWIG_0();

    public static final native long new_StringPair__SWIG_1(String str, String str2);

    public static final native long new_StringPair__SWIG_2(long j, StringPair stringPair);

    public static final native long new_UnorderedMapStrStr__SWIG_0();

    public static final native long new_UnorderedMapStrStr__SWIG_1(long j, UnorderedMapStrStr unorderedMapStrStr);

    public static final native int str_to_type(String str);

    public static final native void swig_module_init();

    public static final native void to_json__SWIG_0(long j, long j2, InputDescription inputDescription);

    public static final native void to_json__SWIG_1(long j, long j2, OutputDescription outputDescription);

    public static final native void to_json__SWIG_2(long j, long j2, ActionModel actionModel);

    public static final native String type_to_str(int i);

    static {
        swig_module_init();
    }

    public static void SwigDirector_ActionAIExecutor_release__SWIG_1(ActionAIExecutor actionAIExecutor) {
        actionAIExecutor.release();
    }

    public static void SwigDirector_ActionAIExecutor_start(ActionAIExecutor actionAIExecutor) {
        actionAIExecutor.start();
    }

    public static long SwigDirector_ActionExecutor_getActionModel(ActionExecutor actionExecutor) {
        return ActionModel.getCPtr(actionExecutor.getActionModel());
    }

    public static void SwigDirector_IExecutorDelegate_release__SWIG_1(IExecutorDelegate iExecutorDelegate) {
        iExecutorDelegate.release();
    }

    public static void SwigDirector_IExecutorDelegate_start(IExecutorDelegate iExecutorDelegate) {
        iExecutorDelegate.start();
    }

    public static void SwigDirector_IExecutorRunnable_run(IExecutorRunnable iExecutorRunnable) {
        iExecutorRunnable.run();
    }

    public static void SwigDirector_ActionAIExecutor_release__SWIG_0(ActionAIExecutor actionAIExecutor, boolean z) {
        actionAIExecutor.release(z);
    }

    public static void SwigDirector_ActionExecuteCallback_onExecuteStep(ActionExecuteCallback actionExecuteCallback, long j) {
        ExecutionRecord executionRecord;
        if (j == 0) {
            executionRecord = null;
        } else {
            executionRecord = new ExecutionRecord(j, true);
        }
        actionExecuteCallback.onExecuteStep(executionRecord);
    }

    public static void SwigDirector_ActionExecuteCallback_onExecuteSuccess(ActionExecuteCallback actionExecuteCallback, long j) {
        ActionResult actionResult;
        if (j == 0) {
            actionResult = null;
        } else {
            actionResult = new ActionResult(j, true);
        }
        actionExecuteCallback.onExecuteSuccess(actionResult);
    }

    public static void SwigDirector_IExecutorDelegate_postRunnable(IExecutorDelegate iExecutorDelegate, long j) {
        IExecutorRunnable iExecutorRunnable;
        if (j == 0) {
            iExecutorRunnable = null;
        } else {
            iExecutorRunnable = new IExecutorRunnable(j, true);
        }
        iExecutorDelegate.postRunnable(iExecutorRunnable);
    }

    public static void SwigDirector_IExecutorDelegate_release__SWIG_0(IExecutorDelegate iExecutorDelegate, boolean z) {
        iExecutorDelegate.release(z);
    }

    public static void SwigDirector_SessionInitCallback_onSuccess(SessionInitCallback sessionInitCallback, String str) {
        sessionInitCallback.onSuccess(str);
    }

    public static void SwigDirector_ActionAILoggerListener_onLog__SWIG_1(ActionAILoggerListener actionAILoggerListener, int i, String str) {
        actionAILoggerListener.onLog(LogLevel.swigToEnum(i), str);
    }

    public static long SwigDirector_IActionAIExecutorCreator_createExecutor(IActionAIExecutorCreator iActionAIExecutorCreator, String str, int i) {
        return ActionAIExecutor.getCPtr(iActionAIExecutorCreator.createExecutor(str, ActionAIExecutorType.swigToEnum(i)));
    }

    public static void SwigDirector_MessageCallback_onNotify(MessageCallback messageCallback, int i, long j) {
        MessageResponse messageResponse;
        MessageCode swigToEnum = MessageCode.swigToEnum(i);
        if (j == 0) {
            messageResponse = null;
        } else {
            messageResponse = new MessageResponse(j, true);
        }
        messageCallback.onNotify(swigToEnum, messageResponse);
    }

    public static void SwigDirector_ActionAILoggerListener_onLog__SWIG_0(ActionAILoggerListener actionAILoggerListener, int i, String str, long j) {
        actionAILoggerListener.onLog(LogLevel.swigToEnum(i), str, new SWIGTYPE_p_va_list(j, true));
    }

    public static void SwigDirector_ActionExecuteCallback_onExecuteError(ActionExecuteCallback actionExecuteCallback, int i, String str, long j) {
        ServerErrorInfo serverErrorInfo;
        ActionAIErrorCode swigToEnum = ActionAIErrorCode.swigToEnum(i);
        if (j == 0) {
            serverErrorInfo = null;
        } else {
            serverErrorInfo = new ServerErrorInfo(j, true);
        }
        actionExecuteCallback.onExecuteError(swigToEnum, str, serverErrorInfo);
    }

    public static void SwigDirector_ActionExecutor_execute(ActionExecutor actionExecutor, long j, String str, long j2) {
        ExecutionContext executionContext;
        ActionExecuteCallback actionExecuteCallback = null;
        if (j == 0) {
            executionContext = null;
        } else {
            executionContext = new ExecutionContext(j, true);
        }
        if (j2 != 0) {
            actionExecuteCallback = new ActionExecuteCallback(j2, true);
        }
        actionExecutor.execute(executionContext, str, actionExecuteCallback);
    }

    public static void SwigDirector_IActionAIMonitorDelegate_onEvent(IActionAIMonitorDelegate iActionAIMonitorDelegate, String str, int i, String str2) {
        iActionAIMonitorDelegate.onEvent(str, i, str2);
    }

    public static void SwigDirector_IActionAIMonitorDelegate_onSuccessRateMonitor(IActionAIMonitorDelegate iActionAIMonitorDelegate, String str, int i, String str2) {
        iActionAIMonitorDelegate.onSuccessRateMonitor(str, i, str2);
    }

    public static void SwigDirector_SessionInitCallback_onFail(SessionInitCallback sessionInitCallback, int i, String str, long j) {
        ServerErrorInfo serverErrorInfo;
        ActionAIErrorCode swigToEnum = ActionAIErrorCode.swigToEnum(i);
        if (j == 0) {
            serverErrorInfo = null;
        } else {
            serverErrorInfo = new ServerErrorInfo(j, true);
        }
        sessionInitCallback.onFail(swigToEnum, str, serverErrorInfo);
    }

    public static boolean SwigDirector_IActionAIHTTPClientDelegateWrapper_requestNet(IActionAIHTTPClientDelegateWrapper iActionAIHTTPClientDelegateWrapper, String str, int i, long j, long j2, long j3, String str2, byte[] bArr, long j4, long j5) {
        SWIGTYPE_p_void sWIGTYPE_p_void;
        ActionAIHttpType swigToEnum = ActionAIHttpType.swigToEnum(i);
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr(j2, true);
        UnorderedMapStrStr unorderedMapStrStr2 = new UnorderedMapStrStr(j3, true);
        ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate = null;
        if (j4 == 0) {
            sWIGTYPE_p_void = null;
        } else {
            sWIGTYPE_p_void = new SWIGTYPE_p_void(j4, false);
        }
        if (j5 != 0) {
            actionAIHttpClientCallbackDelegate = new ActionAIHttpClientCallbackDelegate(j5, true);
        }
        return iActionAIHTTPClientDelegateWrapper.requestNet(str, swigToEnum, j, unorderedMapStrStr, unorderedMapStrStr2, str2, bArr, sWIGTYPE_p_void, actionAIHttpClientCallbackDelegate);
    }
}
